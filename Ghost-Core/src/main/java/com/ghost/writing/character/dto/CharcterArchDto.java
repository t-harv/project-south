package com.ghost.writing.character.dto;

import java.util.Collection;

import com.ghost.writing.character.domainobject.ICharacterArch;
import com.ghost.writing.character.domainobject.IRelationships;


/**
 * 
 * @author toyan
 *
 *Character profile character arch.
 *
 */
public class CharcterArchDto implements ICharacterArch {
	private String roleInStory;
	private String firstAppearance;
	private Collection<IRelationships> relationships;
	//how character is different at the end of the story from when the story began;
	private String growth;
	private Collection<String> additionalNotes;
	
	/**
	 * @return the roleInStory
	 */
	public String getRoleInStory() {
		return roleInStory;
	}
	/**
	 * @param roleInStory the roleInStory to set
	 */
	public void setRoleInStory(String roleInStory) {
		this.roleInStory = roleInStory;
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
	public Collection<IRelationships> getRelationships() {
		return relationships;
	}
	/**
	 * @param relationships the relationships to set
	 */
	public void setRelationships(Collection<IRelationships> relationships) {
		this.relationships = relationships;
	}
	/**
	 * @return the growth
	 */
	public String getGrowth() {
		return growth;
	}
	/**
	 * @param growth the growth to set
	 */
	public void setGrowth(String growth) {
		this.growth = growth;
	}
	/**
	 * @return the additionalNotes
	 */
	public Collection<String> getAdditionalNotes() {
		return additionalNotes;
	}
	/**
	 * @param additionalNotes the additionalNotes to set
	 */
	public void setAdditionalNotes(Collection<String> additionalNotes) {
		this.additionalNotes = additionalNotes;
	}

}
