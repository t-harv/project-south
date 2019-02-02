package com.ghost.writing.character.domainobject.impl;

import java.util.HashSet;
import java.util.Set;

import com.ghost.writing.character.domainobject.ICharacter;
import com.ghost.writing.character.domainobject.ICharacterArch;

public class CharacterImpl implements ICharacter {
	
	//get rid of one of these ID's
	private long characterId;
	private long recordId;
	private String firstName;
	private String lastName;
	private Set<ICharacterArch> charArchs;
	
	public CharacterImpl() {
		charArchs = new HashSet<ICharacterArch>();
		
	}
	
	public CharacterImpl(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public CharacterImpl(long characterId, String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.characterId = characterId;
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

	public Set<ICharacterArch> getCharArchs() {
		return charArchs;
	}

	public void setCharArchs(Set<ICharacterArch> charArchs) {
		this.charArchs = charArchs;
	}

	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}
}
