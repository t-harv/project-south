package com.ghost.test.writing.character.domainobject.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
 * I need to update the tests to be more durable.  If there is no data in db, the test will fail in certain senarios.  So solution is to add the data/remove the data in 
 * the test case.
 *
 */
public class CharacterImplDOXMLTest {
	

	
	//cascade update!
	@Test
	public void addCharacterTest2() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		ICharacter characterObject = new CharacterImpl("Chikita","Raslo");
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		
		((CharacterArchImpl)characterArchObject).setCharacter(characterObject);
		((CharacterArchImpl)characterArchObject2).setCharacter(characterObject);
		
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject);
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject2);
		
		session.save(characterObject);
		
		long recordId = ((CharacterImpl)characterObject).getRecordId();
		
		ICharacter retrievedObject = (ICharacter) session.get(CharacterImpl.class, recordId);
		
		System.out.println(((CharacterImpl)retrievedObject).getFirstName() + " " + ((CharacterImpl)retrievedObject).getLastName());
		
		session.getTransaction().commit();
		session.close();		
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(retrievedObject);
		session.getTransaction().commit();
		session.close();
	}
	
	@Test
	public void addCharacterTest3() {
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		ICharacter characterObject = new CharacterImpl(55l, "Chikita","Raslo");
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		
		((CharacterArchImpl)characterArchObject).setCharacter(characterObject);
		((CharacterArchImpl)characterArchObject2).setCharacter(characterObject);
		
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject);
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject2);
		
		session.save(characterObject);
		
		long recordId = ((CharacterImpl)characterObject).getRecordId();
		
		ICharacter retrievedObject = (ICharacter) session.get(CharacterImpl.class, recordId);
		
		System.out.println(((CharacterImpl)retrievedObject).getFirstName() + " " + ((CharacterImpl)retrievedObject).getLastName());
//		
		session.getTransaction().commit();
		session.close();		
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(retrievedObject);
		session.getTransaction().commit();
		session.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void addCharacterTest4() {
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		ICharacter characterObject = new CharacterImpl(55l, "Chikita","Raslo");
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		
		((CharacterArchImpl)characterArchObject).setCharacter(characterObject);
		((CharacterArchImpl)characterArchObject2).setCharacter(characterObject);
		
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject);
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject2);
		
		System.out.println("Record ID before save: " + ((CharacterImpl)characterObject).getRecordId());
		session.save(characterObject);
		long recordId = ((CharacterImpl)characterObject).getRecordId();
		System.out.println("Record ID after save: " + ((CharacterImpl)characterObject).getRecordId());
		
		ICharacter retrievedObject = (ICharacter) session.get(CharacterImpl.class, recordId);
		
		System.out.println(((CharacterImpl)retrievedObject).getFirstName() + " " + ((CharacterImpl)retrievedObject).getLastName());
//		
		session.getTransaction().commit();
		session.close();		
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(retrievedObject);
		session.getTransaction().commit();
		session.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	@Test
	public void retriveCharacterTest() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ICharacter characterObject = new CharacterImpl("Chikita","Raslo");
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		
		((CharacterArchImpl)characterArchObject).setCharacter(characterObject);
		((CharacterArchImpl)characterArchObject2).setCharacter(characterObject);
		
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject);
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject2);
		
		session.save(characterObject);
		long recordId = ((CharacterImpl)characterObject).getRecordId();
		session.getTransaction().commit();
		session.close();
		
		characterObject = null;
		characterArchObject = null;
		characterArchObject2 = null;
		
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ICharacter retrievedObject = (ICharacter)session.get(CharacterImpl.class, recordId);
		Set<ICharacterArch> sets = ((CharacterImpl)retrievedObject).getCharArchs();
		System.out.println("Character ID: " + ((CharacterImpl)retrievedObject).getCharacterId());
		System.out.println("Character Name: " + ((CharacterImpl)retrievedObject).getFirstName() + " " + ((CharacterImpl)retrievedObject).getLastName());
		
		for(Iterator<ICharacterArch> iter = sets.iterator();iter.hasNext();) {
			ICharacterArch arch = (CharacterArchImpl) iter.next();
			System.out.println("Character Arch ID : " + ((CharacterArchImpl)arch).getCharacterArchID() );
			System.out.println("Character first appearance : " + ((CharacterArchImpl)arch).getFirstAppearance() );
			System.out.println("Character role: " + ((CharacterArchImpl)arch).getCharacterRole() );
			System.out.println("Character finale : " + ((CharacterArchImpl)arch).getFinale() );
		}
		session.close();
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(retrievedObject);
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void updateCharacterTest() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ICharacter characterObject = new CharacterImpl("Chikita","Raslo");
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		
		((CharacterArchImpl)characterArchObject).setCharacter(characterObject);
		((CharacterArchImpl)characterArchObject2).setCharacter(characterObject);
		
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject);
		((CharacterImpl)characterObject).getCharArchs().add(characterArchObject2);
		
		session.save(characterObject);
		long recordId = ((CharacterImpl)characterObject).getRecordId();
		session.getTransaction().commit();
		session.close();
		
		characterObject = null;
		characterArchObject = null;
		characterArchObject2 = null;
		
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ICharacter retrievedObject = (ICharacter)session.get(CharacterImpl.class, recordId);
		Set<ICharacterArch> sets = ((CharacterImpl)retrievedObject).getCharArchs();
		System.out.println("Character ID: " + ((CharacterImpl)retrievedObject).getCharacterId());
		System.out.println("Character Name: " + ((CharacterImpl)retrievedObject).getFirstName() + " " + ((CharacterImpl)retrievedObject).getLastName());
		((CharacterImpl)retrievedObject).setFirstName("Mike");
		((CharacterImpl)retrievedObject).setLastName("Jones");
		
		List<ICharacterArch> removeArchList = new ArrayList<ICharacterArch>();
		List<ICharacterArch> newArchList = new ArrayList<ICharacterArch>();
		
		for(Iterator<ICharacterArch> iter = sets.iterator();iter.hasNext();) {
			ICharacterArch arch = (CharacterArchImpl) iter.next();
			ICharacterArch newArch = new CharacterArchImpl();
			
			
			System.out.println("Character Arch ID : " + ((CharacterArchImpl)arch).getCharacterArchID() );
			System.out.println("Character first appearance : " + ((CharacterArchImpl)arch).getFirstAppearance() );
			System.out.println("Character role: " + ((CharacterArchImpl)arch).getCharacterRole() );
			System.out.println("Character finale : " + ((CharacterArchImpl)arch).getFinale() );
//			((CharacterImpl)retrievedObject).getCharArchs().remove(arch);
			removeArchList.add(arch);
//			((CharacterImpl)retrievedObject).getCharArchs().add(newArch);
			((CharacterArchImpl)newArch).setCharacter(retrievedObject);
			newArchList.add(newArch);
		}
		
		((CharacterImpl)retrievedObject).getCharArchs().removeAll(removeArchList);
		((CharacterImpl)retrievedObject).getCharArchs().addAll(newArchList);
		
		
		session.save(retrievedObject);
		
		recordId = ((CharacterImpl)retrievedObject).getRecordId();
		session.getTransaction().commit();
		session.close();
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ICharacter retrievedObject2 = (ICharacter)session.get(CharacterImpl.class, recordId);
		Set<ICharacterArch> sets2 = ((CharacterImpl)retrievedObject2).getCharArchs();
		System.out.println("Character ID: " + ((CharacterImpl)retrievedObject2).getCharacterId());
		System.out.println("Character Name: " + ((CharacterImpl)retrievedObject2).getFirstName() + " " + ((CharacterImpl)retrievedObject2).getLastName());
		
		for(Iterator<ICharacterArch> iter = sets2.iterator();iter.hasNext();) {
			ICharacterArch arch = (CharacterArchImpl) iter.next();
			System.out.println("Character Arch ID : " + ((CharacterArchImpl)arch).getCharacterArchID() );
			System.out.println("Character first appearance : " + ((CharacterArchImpl)arch).getFirstAppearance() );
			System.out.println("Character role: " + ((CharacterArchImpl)arch).getCharacterRole() );
			System.out.println("Character finale : " + ((CharacterArchImpl)arch).getFinale() );
		}
		session.close();
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(retrievedObject2);
		session.getTransaction().commit();
		session.close();
	}
	

}
