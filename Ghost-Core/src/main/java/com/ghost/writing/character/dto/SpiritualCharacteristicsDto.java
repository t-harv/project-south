package com.ghost.writing.character.dto;

import com.ghost.writing.character.domainobject.ISpiritualCharacteristics;

/**
 * 
 * @author toyan
 * 
 * Character Profile spiritual characteristics
 *
 */
public class SpiritualCharacteristicsDto implements ISpiritualCharacteristics {
	private boolean beliefInGod;
	//sprititual beliefs
	private String belief;
	//is religion or spirituality a part of this character's life
	private boolean spirituality;
	private String spiritualityRole;
	
	/**
	 * @return the beliefInGod
	 */
	public boolean isBeliefInGod() {
		return beliefInGod;
	}
	/**
	 * @param beliefInGod the beliefInGod to set
	 */
	public void setBeliefInGod(boolean beliefInGod) {
		this.beliefInGod = beliefInGod;
	}
	/**
	 * @return the belief
	 */
	public String getBelief() {
		return belief;
	}
	/**
	 * @param belief the belief to set
	 */
	public void setBelief(String belief) {
		this.belief = belief;
	}
	/**
	 * @return the spirituality
	 */
	public boolean isSpirituality() {
		return spirituality;
	}
	/**
	 * @param spirituality the spirituality to set
	 */
	public void setSpirituality(boolean spirituality) {
		this.spirituality = spirituality;
	}
	/**
	 * @return the spiritualityRole
	 */
	public String getSpiritualityRole() {
		return spiritualityRole;
	}
	/**
	 * @param spiritualityRole the spiritualityRole to set
	 */
	public void setSpiritualityRole(String spiritualityRole) {
		this.spiritualityRole = spiritualityRole;
	}

}
