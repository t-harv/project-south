package com.ghost.test.brainstorming.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ghost.core.brainstorming.web.IdeaComponent;
import com.ghost.core.brainstorming.web.IdeaComposite;
import com.ghost.core.brainstorming.web.IdeaLeaf;
import com.ghost.core.brainstorming.web.iterator.IdeaIterator;

public class CompositeIteratorTest {
	IdeaComposite root, subLevel1Idea1, subLevel1Idea2, subLevel2Idea1, subLevel2Idea2, subLevel3Idea1, subLevel3Idea2,subLevel3Idea3, subLevel4Idea1, subLevel4Idea2;
	IdeaLeaf subLevel3IdeaLeaf1, subLevel3IdeaLeaf2,subLevel3IdeaLeaf3;
	
	final static Logger logger = Logger.getLogger(CompositeIteratorTest.class);
	
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
	
	@Test
	public void testIdeaIteratorRemove(){
		List<IdeaComponent> theList = new ArrayList<IdeaComponent>();
		theList.add(root);
		theList.add(subLevel1Idea1);
		theList.add(subLevel2Idea1);
		theList.add(subLevel3IdeaLeaf1);
		theList.add(subLevel3IdeaLeaf2);
		theList.add(subLevel3IdeaLeaf3);

		try{
			IdeaIterator testIterator = new IdeaIterator(theList);
			logger.debug("Printing Ideal Iterator");
			while(testIterator.hasNext()){
				//logger.debug(testIterator.next().getIdeaName());
				if(testIterator.next().getIdeaName().equalsIgnoreCase("A New Hope")){
						testIterator.remove();
				}
			}
			IdeaIterator testIterator2 = new IdeaIterator(theList);
			while(testIterator2.hasNext()){
				logger.debug(testIterator2.next().getIdeaName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
