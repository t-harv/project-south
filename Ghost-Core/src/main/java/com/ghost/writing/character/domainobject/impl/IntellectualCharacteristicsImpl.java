package com.ghost.writing.character.domainobject.impl;

import java.util.List;

import com.ghost.writing.character.domainobject.IntellectualCharacteristics;

public class IntellectualCharacteristicsImpl implements IntellectualCharacteristics {
	private List<String> education;
	private String intelligenceLevel;
	private List<String> mentalIllnesses;
	private List<String> learningExperiences;
	private List<String> shortTermGoals;
	private List<String> longTermGoals;
	private String selfViewPoint; //how does character see himself/herself
	private String perception; //how does character belive he/she is perceived by others
	private boolean selfConfident;
	private boolean emotional; //does the character seem ruled by emotion or logic or some combination thereof?
	private String embarrassment;  //what would most embarrass this character
	
	/**
	 * @return the education
	 */
	public List<String> getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(List<String> education) {
		this.education = education;
	}
	/**
	 * @return the intelligenceLevel
	 */
	public String getIntelligenceLevel() {
		return intelligenceLevel;
	}
	/**
	 * @param intelligenceLevel the intelligenceLevel to set
	 */
	public void setIntelligenceLevel(String intelligenceLevel) {
		this.intelligenceLevel = intelligenceLevel;
	}
	/**
	 * @return the mentalIllnesses
	 */
	public List<String> getMentalIllnesses() {
		return mentalIllnesses;
	}
	/**
	 * @param mentalIllnesses the mentalIllnesses to set
	 */
	public void setMentalIllnesses(List<String> mentalIllnesses) {
		this.mentalIllnesses = mentalIllnesses;
	}
	/**
	 * @return the learningExperiences
	 */
	public List<String> getLearningExperiences() {
		return learningExperiences;
	}
	/**
	 * @param learningExperiences the learningExperiences to set
	 */
	public void setLearningExperiences(List<String> learningExperiences) {
		this.learningExperiences = learningExperiences;
	}
	/**
	 * @return the shortTermGoals
	 */
	public List<String> getShortTermGoals() {
		return shortTermGoals;
	}
	/**
	 * @param shortTermGoals the shortTermGoals to set
	 */
	public void setShortTermGoals(List<String> shortTermGoals) {
		this.shortTermGoals = shortTermGoals;
	}
	/**
	 * @return the longTermGoals
	 */
	public List<String> getLongTermGoals() {
		return longTermGoals;
	}
	/**
	 * @param longTermGoals the longTermGoals to set
	 */
	public void setLongTermGoals(List<String> longTermGoals) {
		this.longTermGoals = longTermGoals;
	}
	/**
	 * @return the selfViewPoint
	 */
	public String getSelfViewPoint() {
		return selfViewPoint;
	}
	/**
	 * @param selfViewPoint the selfViewPoint to set
	 */
	public void setSelfViewPoint(String selfViewPoint) {
		this.selfViewPoint = selfViewPoint;
	}
	/**
	 * @return the perception
	 */
	public String getPerception() {
		return perception;
	}
	/**
	 * @param perception the perception to set
	 */
	public void setPerception(String perception) {
		this.perception = perception;
	}
	/**
	 * @return the selfConfident
	 */
	public boolean isSelfConfident() {
		return selfConfident;
	}
	/**
	 * @param selfConfident the selfConfident to set
	 */
	public void setSelfConfident(boolean selfConfident) {
		this.selfConfident = selfConfident;
	}
	/**
	 * @return the emotional
	 */
	public boolean isEmotional() {
		return emotional;
	}
	/**
	 * @param emotional the emotional to set
	 */
	public void setEmotional(boolean emotional) {
		this.emotional = emotional;
	}
	/**
	 * @return the embarrassment
	 */
	public String getEmbarrassment() {
		return embarrassment;
	}
	/**
	 * @param embarrassment the embarrassment to set
	 */
	public void setEmbarrassment(String embarrassment) {
		this.embarrassment = embarrassment;
	}



}
