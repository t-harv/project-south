package com.ghost.writing.character.domainobject.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.ghost.writing.character.domainobject.CharacterArch;

@Entity
@Table(name="CharacterArch")
public class CharacterArchImpl implements CharacterArch {
	
	@Id
	private long characterArchID;
	
	private String characterRole;
	private String firstAppearance;
//    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//	private CharacterProfile profile;
	
	/*
	 * I do not know how to properly map this collection in hibernate just yet.  I'm going to comment
	 * it out for the moment so that i have time to proper this
	 */
//	private List<CharacterProfile> relationships;
	private String finale;  //how character is different at the end of the novel from when the novel began
    
    //default constructor
    public CharacterArchImpl() {
    	characterRole = "unknown";
    	firstAppearance = "unknown";
    	finale = "unknown";
    }
    
    public CharacterArchImpl(String characterRole, String firstAppearance, String finale) {
    	this.characterRole = characterRole;
    	this.firstAppearance = firstAppearance;
    	this.finale = finale;
    }
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
//	public List<CharacterProfile> getRelationships() {
//		return relationships;
//	}
//	/**
//	 * @param relationships the relationships to set
//	 */
//	public void setRelationships(List<CharacterProfile> relationships) {
//		this.relationships = relationships;
//	}
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

	public long getCharacterArchID() {
		return characterArchID;
	}

	public void setCharacterArchID(long characterArchID) {
		this.characterArchID = characterArchID;
	}

//	/**
//	 * @return the profile
//	 */
//	public CharacterProfile getProfile() {
//		return profile;
//	}
//	/**
//	 * @param profile the profile to set
//	 */
//	public void setProfile(CharacterProfile profile) {
//		this.profile = profile;
//	}

}
