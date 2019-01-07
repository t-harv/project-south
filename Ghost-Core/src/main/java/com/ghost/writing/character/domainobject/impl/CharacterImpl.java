package com.ghost.writing.character.domainobject.impl;

import java.util.HashSet;
import java.util.Set;

import com.ghost.writing.character.domainobject.ICharacter;
import com.ghost.writing.character.domainobject.ICharacterArch;

public class CharacterImpl implements ICharacter {
	
	private long characterId;
	private String firstName;
	private String lastName;
	//using mkyong example, changed from List to a Set.  Find out why we chosed set over List...
	private Set<ICharacterArch> charArchs;
	
	public CharacterImpl() {
		charArchs = new HashSet<ICharacterArch>();
		
	}
	
	public CharacterImpl(String firstName, String lastName) {
		this();
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

	public Set<ICharacterArch> getCharArchs() {
		return charArchs;
	}

	public void setCharArchs(Set<ICharacterArch> charArchs) {
		this.charArchs = charArchs;
	}
}
