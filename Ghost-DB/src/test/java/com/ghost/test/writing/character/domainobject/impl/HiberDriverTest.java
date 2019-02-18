package com.ghost.test.writing.character.domainobject.impl;

import java.util.List;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import com.ghost.domainobject.ICharacter;
import com.ghost.domainobject.ICharacterArch;
import com.ghost.domainobject.ICharacterProfile;
import com.ghost.domainobject.impl.CharacterArchImpl;
import com.ghost.domainobject.impl.CharacterImpl;

import ghost.domain.hibernate.HibernateUtil;
import ghost.hibernate.HiberDriver;

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
		ICharacter characterObject = new CharacterImpl("Chikita","Raslo");

		//add to db
		
		ICharacterArch characterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		ICharacterArch characterArchObject2 = new CharacterArchImpl("Hero","USA", "Humanitarian");
		HiberDriver x = new HiberDriver();
		x.add(characterArchObject);
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
