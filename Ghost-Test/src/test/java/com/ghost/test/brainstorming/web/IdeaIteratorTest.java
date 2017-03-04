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
import com.ghost.core.brainstorming.web.iterator.IdeaIterator;

public class IdeaIteratorTest  {
	IdeaComposite ideaRoot1, ideaRoot2, subLevel1Idea1, subLevel1Idea2, subLevel2Idea1, subLevel2Idea2, subLevel3Idea1, subLevel3Idea2,subLevel3Idea3, subLevel4Idea1, subLevel4Idea2;
	IdeaLeaf subLevel3IdeaLeaf1, subLevel3IdeaLeaf2,subLevel3IdeaLeaf3;

	final static Logger logger = Logger.getLogger(IdeaIteratorTest.class);

	@Before
	public void setup(){
		//root = new IdeaComposite();
		ideaRoot1 = new IdeaComposite("Movie");
		subLevel1Idea1 = new IdeaComposite("Star Wars");
		subLevel2Idea1 = new IdeaComposite("Trilogy");
		subLevel3IdeaLeaf1 = new IdeaLeaf("A New Hope");
		subLevel3IdeaLeaf2 = new IdeaLeaf("The Empire Strikes Back");
		subLevel3IdeaLeaf3 = new IdeaLeaf("Return of the Jedi");
		ideaRoot1.add(subLevel1Idea1);
		subLevel1Idea1.add(subLevel2Idea1);
		subLevel2Idea1.add(subLevel3IdeaLeaf1);
		subLevel2Idea1.add(subLevel3IdeaLeaf2);
		subLevel2Idea1.add(subLevel3IdeaLeaf3);

		ideaRoot2 = new IdeaComposite("Animal");
		subLevel1Idea1 = new IdeaComposite("Big");
		subLevel2Idea1 = new IdeaComposite("Ocean");
		subLevel3IdeaLeaf1 = new IdeaLeaf("Great White Shark");
		subLevel3IdeaLeaf2 = new IdeaLeaf("Blue Whale");
		subLevel3IdeaLeaf3 = new IdeaLeaf("Kraken");
		ideaRoot2.add(subLevel1Idea1);
		subLevel1Idea1.add(subLevel2Idea1);
		subLevel2Idea1.add(subLevel3IdeaLeaf1);
		subLevel2Idea1.add(subLevel3IdeaLeaf2);
		subLevel2Idea1.add(subLevel3IdeaLeaf3);

	}

	/**
	 * Horrible test...  The only thing thats tested is if an Exception occurs during iteration of test data, assert fail.
	 */
	@Test
	public void scenario1(){
		if(logger.isDebugEnabled()){
			logger.debug("Test Scenario 1");
		}
		try{
			List<IdeaComponent> superList = new ArrayList<IdeaComponent>();
			superList.add(ideaRoot1);
			superList.add(ideaRoot2);
			IdeaIterator testIterator = new IdeaIterator(superList);
			if(logger.isDebugEnabled()){
				logger.debug("Printing Idea Iterator");
			}
			while(testIterator.hasNext()){
				if(logger.isDebugEnabled()){
					logger.debug(testIterator.next().getIdeaName());
				}
			}
		}catch(Exception e){
			Assert.fail("Scenario 1 failed with following exception: " + e.getMessage());
			e.printStackTrace();  //I can't remember if this will execute, the assert my end execution
		}
	}

	/**
	 * What happens when has next returns false and you call next()?  Null should be returned.
	 */
	@Test
	public void scenario2(){
		if(logger.isDebugEnabled()){
			logger.debug("Test Scenario 2");
		}
		try{
			List<IdeaComponent> superList = new ArrayList<IdeaComponent>();
			superList.add(ideaRoot1);	
			superList.add(ideaRoot2);
			IdeaIterator testIterator = new IdeaIterator(superList);
			if(logger.isDebugEnabled()){
				logger.debug("Printing Idea Iterator");
			}
			while(testIterator.hasNext()){
				if(logger.isDebugEnabled()){
					logger.debug(testIterator.next().getIdeaName());
				}
			}
			Assert.assertEquals(null, testIterator.next());
		}catch(Exception e){
			Assert.fail("Scenario 2 failed with following exception: " + e.getMessage());
			e.printStackTrace();  //I can't remember if this will execute, the assert my end execution
		}
	}

	/**
	 * Test IdeaIterator remove functionality
	 */
	@Test
	public void scenario3(){
		if(logger.isDebugEnabled()){
			logger.debug("Test Scenario 3");
		}
		try{
			List<IdeaComponent> superList = new ArrayList<IdeaComponent>();
			superList.add(ideaRoot1);	
			superList.add(ideaRoot2);
			IdeaIterator testIterator = new IdeaIterator(superList);
			if(logger.isDebugEnabled()){
				logger.debug("Printing Idea Iterator");
			}
			while(testIterator.hasNext()){
				IdeaComponent temp = testIterator.next();
				if(temp.getIdeaName().equalsIgnoreCase("Animal"))
					testIterator.remove();
			}

			Assert.assertEquals(1, superList.size());
			IdeaIterator testIterator2 = new IdeaIterator(superList);
			while(testIterator2.hasNext()){
				IdeaComponent temp = testIterator2.next();
				if(logger.isDebugEnabled()){
					logger.debug(temp.getIdeaName());
				}
			}

		}catch(Exception e){
			Assert.fail("Scenario 3 failed with following exception: " + e.getMessage());
			e.printStackTrace();  //I can't remember if this will execute, the assert my end execution
		}
	}

}
