package com.ghost.writing.character.dto;

import java.util.Collection;

import com.ghost.writing.character.domainobject.EmotionalCharacteristics;


/**
 * 
 * @author toyan
 * 
 * Character profiles emotional characteristics
 * 
 * make some of these booleans
 *
 */
public class EmotionalCharacteristicsDto implements EmotionalCharacteristics {
	private Collection<String> strengths;
	private Collection<String> weakness;
	private boolean introvert;
	private boolean extrovert;
	//how does the character deal with anger
	private String angerManagement;
	private String sadnessManagement;
	private String conflictManagement;
	private String changeManagement;
	private String lossManagement;
	//what does this character want out of life
	private String wantFromLife;
	//what would the character like to change in his/her life
	private String changeInLife;
	//what motivates this character
	private Collection<String> motivation;
	private Collection<String> frightens;
	//what make this character happy
	private Collection<String> joy;
	//is the character judgmental of others
	private boolean judgmental;
	//is the character generous or stingy
	private boolean generous;
	private boolean stingy;
	private boolean polite;
	private boolean rude;
	
	/**
	 * @return the strengths
	 */
	public Collection<String> getStrengths() {
		return strengths;
	}
	/**
	 * @param strengths the strengths to set
	 */
	public void setStrengths(Collection<String> strengths) {
		this.strengths = strengths;
	}
	/**
	 * @return the weakness
	 */
	public Collection<String> getWeakness() {
		return weakness;
	}
	/**
	 * @param weakness the weakness to set
	 */
	public void setWeakness(Collection<String> weakness) {
		this.weakness = weakness;
	}
	/**
	 * @return the introvert
	 */
	public boolean isIntrovert() {
		return introvert;
	}
	/**
	 * @param introvert the introvert to set
	 */
	public void setIntrovert(boolean introvert) {
		this.introvert = introvert;
	}
	/**
	 * @return the extrovert
	 */
	public boolean isExtrovert() {
		return extrovert;
	}
	/**
	 * @param extrovert the extrovert to set
	 */
	public void setExtrovert(boolean extrovert) {
		this.extrovert = extrovert;
	}
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
	 * @return the sadnessManagement
	 */
	public String getSadnessManagement() {
		return sadnessManagement;
	}
	/**
	 * @param sadnessManagement the sadnessManagement to set
	 */
	public void setSadnessManagement(String sadnessManagement) {
		this.sadnessManagement = sadnessManagement;
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
	 * @return the wantFromLife
	 */
	public String getWantFromLife() {
		return wantFromLife;
	}
	/**
	 * @param wantFromLife the wantFromLife to set
	 */
	public void setWantFromLife(String wantFromLife) {
		this.wantFromLife = wantFromLife;
	}
	/**
	 * @return the changeInLife
	 */
	public String getChangeInLife() {
		return changeInLife;
	}
	/**
	 * @param changeInLife the changeInLife to set
	 */
	public void setChangeInLife(String changeInLife) {
		this.changeInLife = changeInLife;
	}
	/**
	 * @return the motivation
	 */
	public Collection<String> getMotivation() {
		return motivation;
	}
	/**
	 * @param motivation the motivation to set
	 */
	public void setMotivation(Collection<String> motivation) {
		this.motivation = motivation;
	}
	/**
	 * @return the frightens
	 */
	public Collection<String> getFrightens() {
		return frightens;
	}
	/**
	 * @param frightens the frightens to set
	 */
	public void setFrightens(Collection<String> frightens) {
		this.frightens = frightens;
	}
	/**
	 * @return the joy
	 */
	public Collection<String> getJoy() {
		return joy;
	}
	/**
	 * @param joy the joy to set
	 */
	public void setJoy(Collection<String> joy) {
		this.joy = joy;
	}
	/**
	 * @return the judgmental
	 */
	public boolean isJudgmental() {
		return judgmental;
	}
	/**
	 * @param judgmental the judgmental to set
	 */
	public void setJudgmental(boolean judgmental) {
		this.judgmental = judgmental;
	}
	/**
	 * @return the generous
	 */
	public boolean isGenerous() {
		return generous;
	}
	/**
	 * @param generous the generous to set
	 */
	public void setGenerous(boolean generous) {
		this.generous = generous;
	}
	/**
	 * @return the stingy
	 */
	public boolean isStingy() {
		return stingy;
	}
	/**
	 * @param stingy the stingy to set
	 */
	public void setStingy(boolean stingy) {
		this.stingy = stingy;
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
