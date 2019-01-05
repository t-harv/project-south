package com.ghost.writing.character.domainobject.impl;

import java.util.Collection;

import com.ghost.writing.character.domainobject.ISpiritualCharacteristics;

public class SpiritualCharacteristicsImpl implements ISpiritualCharacteristics {
	private boolean believe;
	private Collection<String> spiritualBeliefs;
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
	public Collection<String> getSpiritualBeliefs() {
		return spiritualBeliefs;
	}
	/**
	 * @param jalaSpiritualBeliefs the spiritualBeliefs to set
	 */
	public void setSpiritualBeliefs(Collection<String> jalaSpiritualBeliefs) {
		this.spiritualBeliefs = jalaSpiritualBeliefs;
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
