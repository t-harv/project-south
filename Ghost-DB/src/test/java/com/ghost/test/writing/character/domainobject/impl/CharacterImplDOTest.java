package com.ghost.test.writing.character.domainobject.impl;

import org.hibernate.Session;
import org.junit.Test;

import com.ghost.writing.character.domainobject.ICharacter;
import com.ghost.writing.character.domainobject.ICharacterArch;
import com.ghost.writing.character.domainobject.impl.CharacterArchImpl;
import com.ghost.writing.character.domainobject.impl.CharacterImpl;

import ghost.domain.hibernate.HibernateUtil;


/**
 * 
 * @author root
 * ok, so i'm a tad confused but i'm working the bugs out.  It appears, the hashSet is going to be populated by  hibernate and not me via whatever input 
 * mechinism.  What does that mean.  That means, when we get the character object, hibernate will fill this set up with any character archs associated
 * with the character! I need to test this out to be certian and learn something neat.
 *
 */
public class CharacterImplDOTest {
	
	@Test
	public void addCharacterTest() {
		System.out.println("Maven + Hibernate + Derby");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		ICharacter characterObject = new CharacterImpl("Chikita","Raslo");

		//add to db
		session.save(characterObject);
		
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		
		((CharacterArchImpl)characterArchObject).setCharacter(characterObject);
		((CharacterArchImpl)characterArchObject2).setCharacter(characterObject);
		
		session.save(characterArchObject);
		session.save(characterArchObject2);
		session.getTransaction().commit();
		session.close();		
	}
	

}
