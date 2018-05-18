package com.ghost.writing.character.domainobject.impl;

import java.util.List;

import com.ghost.writing.character.domainobject.CharacterArch;
import com.ghost.writing.character.domainobject.CharacterProfile;

public class CharacterArchImpl implements CharacterArch {
	private String characterRole;
	private String firstAppearance;
	private List<CharacterProfile> relationships;
	private String finale;  //how character is different at the end of the novel from when the novel began
	/**
	 * @return the characterRole
	 */
	public String getCharacterRole() {
		return characterRole;
	}
	/**
	 * @param characterRole the characterRole to set
	 */
	public void setCharacterRole(String characterRole) {
		this.characterRole = characterRole;
	}
	/**
	 * @return the firstAppearance
	 */
	public String getFirstAppearance() {
		return firstAppearance;
	}
	/**
	 * @param firstAppearance the firstAppearance to set
	 */
	public void setFirstAppearance(String firstAppearance) {
		this.firstAppearance = firstAppearance;
	}
	/**
	 * @return the relationships
	 */
	public List<CharacterProfile> getRelationships() {
		return relationships;
	}
	/**
	 * @param relationships the relationships to set
	 */
	public void setRelationships(List<CharacterProfile> relationships) {
		this.relationships = relationships;
	}
	/**
	 * @return the finale
	 */
	public String getFinale() {
		return finale;
	}
	/**
	 * @param finale the finale to set
	 */
	public void setFinale(String finale) {
		this.finale = finale;
	}

}
