package com.ghost.writing.character.dto;

import com.ghost.writing.character.domainobject.IRelationships;

/**
 * 
 * @author toyan
 * 
 * Character's relationship to other characters.
 * 
 * In the futurer, i'd like to have any character added to character relationship to have an entry in character table.  It would be tough prehaps to do this because if you add someone
 * who do not exist yet you get a constraint error.  Unless if the character do not exist, you add them! 
 *
 */
public class RelationshipsDto implements IRelationships {
	private String characterName;
	private String relationship;
	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}
	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

}
