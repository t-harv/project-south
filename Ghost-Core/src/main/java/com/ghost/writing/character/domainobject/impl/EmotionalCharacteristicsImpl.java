package com.ghost.writing.character.domainobject.impl;

import javax.persistence.Embeddable;

import com.ghost.writing.character.domainobject.IEmotionalCharacteristics;

@Embeddable
public class EmotionalCharacteristicsImpl implements IEmotionalCharacteristics {
//	@ElementCollection
//	@CollectionTable(name="Strenghts", joinColumns=@JoinColumn(name="character_profile_id"))
//	@GenericGenerator(name="sequence-gen", strategy="sequence")
//	@CollectionId(columns = { @Column(name="strenght_id") }, generator = "sequence-gen", type = @Type(type="long"))
//	private Collection<String> strengths;
//	@ElementCollection
//	@CollectionTable(name="Weakness", joinColumns=@JoinColumn(name="character_profile_id"))
//	@GenericGenerator(name="sequence-gen", strategy="sequence")
//	@CollectionId(columns = { @Column(name="weak_id") }, generator = "sequence-gen", type = @Type(type="long"))
//	private Collection<String> weaknesses;
	private String angerManagement;
	private String sadManagement;
	private String conflictManagement;
	private String changeManagement;
	private String lossManagement;
	private String wantOutOfLife; //what does character want out of life
//	@ElementCollection
//	@CollectionTable(name="Motivations", joinColumns=@JoinColumn(name="character_profile_id"))
//	@GenericGenerator(name="sequence-gen", strategy="sequence")
//	@CollectionId(columns = { @Column(name="motivation_id") }, generator = "sequence-gen", type = @Type(type="long"))
//	private Collection<String> motivations; // what motivate character
	private String frightens; 
	private String happy; //what makes character happy
	private Boolean judgmental; //is the character judgmental of others
	private boolean polite;
	private boolean rude;
	
//	/**
//	 * @return the strengths
//	 */
//	public Collection<String> getStrengths() {
//		return strengths;
//	}
//	/**
//	 * @param strengths the strengths to set
//	 */
//	public void setStrengths(Collection<String> strengths) {
//		this.strengths = strengths;
//	}
//	/**
//	 * @return the weaknesses
//	 */
//	public Collection<String> getWeaknesses() {
//		return weaknesses;
//	}
//	/**
//	 * @param weaknesses the weaknesses to set
//	 */
//	public void setWeaknesses(Collection<String> weaknesses) {
//		this.weaknesses = weaknesses;
//	}
	/**
	 * @return the angerManagement
	 */
	public String getAngerManagement() {
		return angerManagement;
	}
	/**
	 * @param angerManagement the angerManagement to set
	 */
	public void setAngerManagement(String angerManagement) {
		this.angerManagement = angerManagement;
	}
	/**
	 * @return the sadManagement
	 */
	public String getSadManagement() {
		return sadManagement;
	}
	/**
	 * @param sadManagement the sadManagement to set
	 */
	public void setSadManagement(String sadManagement) {
		this.sadManagement = sadManagement;
	}
	/**
	 * @return the conflictManagement
	 */
	public String getConflictManagement() {
		return conflictManagement;
	}
	/**
	 * @param conflictManagement the conflictManagement to set
	 */
	public void setConflictManagement(String conflictManagement) {
		this.conflictManagement = conflictManagement;
	}
	/**
	 * @return the changeManagement
	 */
	public String getChangeManagement() {
		return changeManagement;
	}
	/**
	 * @param changeManagement the changeManagement to set
	 */
	public void setChangeManagement(String changeManagement) {
		this.changeManagement = changeManagement;
	}
	/**
	 * @return the lossManagement
	 */
	public String getLossManagement() {
		return lossManagement;
	}
	/**
	 * @param lossManagement the lossManagement to set
	 */
	public void setLossManagement(String lossManagement) {
		this.lossManagement = lossManagement;
	}
	/**
	 * @return the wantOutOfLife
	 */
	public String getWantOutOfLife() {
		return wantOutOfLife;
	}
	/**
	 * @param wantOutOfLife the wantOutOfLife to set
	 */
	public void setWantOutOfLife(String wantOutOfLife) {
		this.wantOutOfLife = wantOutOfLife;
	}
//	/**
//	 * @return the motivations
//	 */
//	public Collection<String> getMotivations() {
//		return motivations;
//	}
//	/**
//	 * @param jalaMotivations the motivations to set
//	 */
//	public void setMotivations(Collection<String> jalaMotivations) {
//		this.motivations = jalaMotivations;
//	}
	/**
	 * @return the frightens
	 */
	public String getFrightens() {
		return frightens;
	}
	/**
	 * @param frightens the frightens to set
	 */
	public void setFrightens(String frightens) {
		this.frightens = frightens;
	}
	/**
	 * @return the happy
	 */
	public String getHappy() {
		return happy;
	}
	/**
	 * @param happy the happy to set
	 */
	public void setHappy(String happy) {
		this.happy = happy;
	}
	/**
	 * @return the judgmental
	 */
	public Boolean getJudgmental() {
		return judgmental;
	}
	/**
	 * @param judgmental the judgmental to set
	 */
	public void setJudgmental(Boolean judgmental) {
		this.judgmental = judgmental;
	}
	/**
	 * @return the polite
	 */
	public boolean isPolite() {
		return polite;
	}
	/**
	 * @param polite the polite to set
	 */
	public void setPolite(boolean polite) {
		this.polite = polite;
	}
	/**
	 * @return the rude
	 */
	public boolean isRude() {
		return rude;
	}
	/**
	 * @param rude the rude to set
	 */
	public void setRude(boolean rude) {
		this.rude = rude;
	}

}
