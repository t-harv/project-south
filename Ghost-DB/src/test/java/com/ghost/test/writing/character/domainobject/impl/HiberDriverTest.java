package com.ghost.test.writing.character.domainobject.impl;

import java.util.List;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import com.ghost.writing.character.domainobject.ICharacterArch;
import com.ghost.writing.character.domainobject.ICharacterProfile;
import com.ghost.writing.character.domainobject.impl.CharacterArchImpl;

import ghost.domain.hibernate.HibernateUtil;

public class HiberDriverTest {
	private String mapping;
	
	@Before
	public void setup() {
		//do something before!
		
	}
	
	
	public String getMappingTest() {
		return mapping;
	}

	public void setMappingTest(String mapping) {
		this.mapping = mapping;
	}

	public void removeTest(ICharacterProfile object) {
		
	}
	@Test
	public void addTest() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ICharacterArch CharacterArchObject = new CharacterArchImpl("Side Chick2","Mexico", "Fame");
		session.save(CharacterArchObject); 
		session.getTransaction().commit();
	}
	
	public void updateTest(ICharacterProfile object) {
		
	}
	
	public ICharacterProfile getTest(String name) {
		return null;
		
	}
	
	public List<ICharacterProfile> getAllTest() {
		return null;
		
	}
	
	public void dataSourceTest() {
		
	}
}
