package com.ghost.test.brainstorming.web;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ghost.core.brainstorming.web.IdeaComponent;
import com.ghost.core.brainstorming.web.IdeaComposite;
import com.ghost.core.brainstorming.web.IdeaLeaf;
import com.ghost.core.brainstorming.web.iterator.CompositeIterator;
import com.ghost.core.brainstorming.web.iterator.IdeaIterator;

public class IdeaCompositeTest {
	IdeaComposite root, subLevel1Idea1, subLevel1Idea2, subLevel2Idea1, subLevel2Idea2, subLevel3Idea1, subLevel3Idea2,subLevel3Idea3, subLevel4Idea1, subLevel4Idea2;
	IdeaLeaf subLevel3IdeaLeaf1, subLevel3IdeaLeaf2,subLevel3IdeaLeaf3;
	final static Logger logger = Logger.getLogger(IdeaCompositeTest.class);

	@Before
	public void setup(){
		//root = new IdeaComposite();
		root = new IdeaComposite("Movie");
		subLevel1Idea1 = new IdeaComposite("Star Wars");
		subLevel2Idea1 = new IdeaComposite("Trilogy");
		subLevel3IdeaLeaf1 = new IdeaLeaf("A New Hope");
		subLevel3IdeaLeaf2 = new IdeaLeaf("The Empire Strikes Back");
		subLevel3IdeaLeaf3 = new IdeaLeaf("Return of the Jedi");
		root.add(subLevel1Idea1);
		subLevel1Idea1.add(subLevel2Idea1);
		subLevel2Idea1.add(subLevel3IdeaLeaf1);
		subLevel2Idea1.add(subLevel3IdeaLeaf2);
		subLevel2Idea1.add(subLevel3IdeaLeaf3);
	}

	/**
	 * tests all the types of constructors we have for IdeaComposite
	 */
	@Test
	public void scenario1(){
		root = new IdeaComposite();
		Assert.assertEquals("Blank", root.getIdeaName());

		root = new IdeaComposite("South");
		Assert.assertEquals("South", root.getIdeaName());
	}

	/**
	 * I want to have a root idea, with 4 levels.  What i defined has 3 levels
	 */
	@Test
	public void scenario2(){
		List<IdeaComponent> superList = new ArrayList<IdeaComponent>();
		superList.add(root);
		superList.add(root);
		IdeaIterator testIterator = new IdeaIterator(superList);
		CompositeIterator compositeIterTest = new CompositeIterator(testIterator);
		logger.debug("Printing Composite Iterator");
		while(compositeIterTest.hasNext()){
			logger.debug(compositeIterTest.next().getIdeaName());
		}
	}
	
	/**
	 * test the remove functionality of IdeaComposite remove method.
	 */
	@Test
	public void scenario3(){
		Assert.assertEquals(3, subLevel2Idea1.getIdeaList().size());
		subLevel2Idea1.remove(subLevel3IdeaLeaf1);
		Assert.assertEquals(2, subLevel2Idea1.getIdeaList().size());
	}

	/**
	 * test the retrieve functionality of the getChild(...) method 
	 */
	@Test
	public void scenario4(){
		Assert.assertEquals("Return of the Jedi", subLevel2Idea1.getChild(2).getIdeaName());
	}
	
	/**
	 * test the operation() method. There's no current functionality so the UnsupportedOperationException exception should be thrown.
	 */
	@Test
	public void scenario5(){
		try{
		subLevel2Idea1.operation();
		}catch(Exception e){
			Assert.assertEquals("Operation not implemented yet!", e.getMessage());
		}
	}

}
