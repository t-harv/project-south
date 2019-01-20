package com.ghost.model;

import com.ghost.writing.character.domainobject.ICharacter;

/**
 * Purpose of this class is to build domain objects that the hibernate controller can easily persist.  So what that means is this class will be
 * the frontend for this application model layer.  The model objective is to build objects that can be easily persisted/retrieved from the data layer.
 * 
 * @author root
 * 
 * Notes
 * 
 * So, consider this.  We have character objects and character profile objects.  How do we handle this here?  My guess is to create 2 class, one for
 * handling character objects and another for handling character profile objects.
 * 
 * This is going to be tough because, your hibernate driver needs to understand both of these.  Right now, at this current point in time, there is 
 * no character profile!  So, i would handle only the character object at this point in time.  THe character object will be added to the character profile so
 * handling the character profile object shouldn't be to bad later to create.
 * 
 * 
 * Couple of problems.
 * 1.  How is data coming into this application?  
 * Answer - doesn't matter, assume it is via strings no objects.  So, there will be a string for each part of the domain object.  Think about it, if
 * you program it here to received actual character objects, that means something else outside of this application is creating character objects.  As 
 * of now, there's is nothing that do that.  So, the answer has to be, if i have a frontend that takes input text and submit it to this application,
 * it makes sense to assume, with those fragments of user text, i have to create the domain object here.  That is what this business logic is responsible for.
 * 
 *So that means, i have to understand the input/define the input requirements before i can accurately code this class.  So i need a blueprint for
 *the frontend so that i can understand the methods that are needed here.
 *
 *
 */
public class CharacterBuilder {

	/**
	 * This needs to be an overloaded method.  basically i need to create charcter domain objects here with a variable combination of input parameters. 
	 * @return
	 * 
	 * questions
	 * Ok so....  Character consists of several sub objects.  How is that handled.
	 * 
	 * Maybe, we simply get an object, and check if the required fields are present.  So that could mean, just check the required fields.  Nope,
	 * can't receive objects, its only text.
	 */
	ICharacter getCharacter() {
		return null;
	}
	
	

}
