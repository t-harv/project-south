package com.ghost.writing.character.domainobject.impl;

import com.ghost.writing.character.domainobject.ICharacter;

public class CharacterImpl implements ICharacter {
	
	private long characterId;
	private String firstName;
	private String lastName;
	
	public CharacterImpl() {
		
	}
	
	public CharacterImpl(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getCharacterId() {
		return characterId;
	}

	public void setCharacterId(long characterId) {
		this.characterId = characterId;
	}
}
