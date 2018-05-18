package com.ghost.writing.character.domainobject.impl;

import java.util.List;

import com.ghost.writing.character.domainobject.SpiritualCharacteristics;

public class SpiritualCharacteristicsImpl implements SpiritualCharacteristics {
	private boolean believe;
	private List<String> spiritualBeliefs;
	private boolean spiritual;
	private String role;  //if spiritual, what role does it play.
	/**
	 * @return the believe
	 */
	public boolean isBelieve() {
		return believe;
	}
	/**
	 * @param believe the believe to set
	 */
	public void setBelieve(boolean believe) {
		this.believe = believe;
	}
	/**
	 * @return the spiritualBeliefs
	 */
	public List<String> getSpiritualBeliefs() {
		return spiritualBeliefs;
	}
	/**
	 * @param spiritualBeliefs the spiritualBeliefs to set
	 */
	public void setSpiritualBeliefs(List<String> spiritualBeliefs) {
		this.spiritualBeliefs = spiritualBeliefs;
	}
	/**
	 * @return the spiritual
	 */
	public boolean isSpiritual() {
		return spiritual;
	}
	/**
	 * @param spiritual the spiritual to set
	 */
	public void setSpiritual(boolean spiritual) {
		this.spiritual = spiritual;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	

}
