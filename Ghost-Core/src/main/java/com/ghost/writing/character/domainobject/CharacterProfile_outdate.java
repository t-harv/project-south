package com.ghost.writing.character.domainobject;

import java.util.Collection;

/**
 * 
 * @author toyan
 * contract between character profile DTO and DAO
 * 
 * Source for the profile - https://www.writerswrite.com/journal/jun98/how-to-create-a-character-profile-6986
 *
 */
public interface CharacterProfile_outdate {
	
	/**
	 * @return the id
	 */
	public long getId();
	/**
	 * @param id the id to set
	 */
	public void setId(long id);
	/**
	 * @return the firstName
	 */
	public String getFirstName();
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName);
	/**
	 * @return the lastName
	 */
	public String getLastName();
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName);
	/**
	 * @return the characterName
	 */
	public String getCharacterName();
	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName);
	/**
	 * @return the homeTown
	 */
	public String getHomeTown();
	/**
	 * @param homeTown the homeTown to set
	 */
	public void setHomeTown(String homeTown);
	/**
	 * @return the address
	 */
	public String getAddress();
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address);
	/**
	 * @return the occupation
	 */
	public String getOccupation();
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation);
	/**
	 * @return the income
	 */
	public String getIncome();
	/**
	 * @param income the income to set
	 */
	public void setIncome(String income);
	/**
	 * @return the talentSkills
	 */
	public Collection<String> getTalentSkills();
	/**
	 * @param talentSkills the talentSkills to set
	 */
	public void setTalentSkills(Collection<String> talentSkills);
	/**
	 * @return the salary
	 */
	public String getSalary();
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary);
	/**
	 * @return the birthOrder
	 */
	public String getBirthOrder();
	
	/**
	 * @param birthOrder the birthOrder to set
	 */
	public void setBirthOrder(String birthOrder);
	/**
	 * @return the siblings
	 */
	public Collection<String> getSiblings();
	/**
	 * @param siblings the siblings to set
	 */
	public void setSiblings(Collection<String> siblings);
	/**
	 * @return the spouse
	 */
	public String getSpouse();
	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(String spouse);
	/**
	 * @return the children
	 */
	public Collection<String> getChildren();
	/**
	 * @param children the children to set
	 */
	public void setChildren(Collection<String> children);
	/**
	 * @return the grandParents
	 */
	public Collection<String> getGrandParents();
	/**
	 * @param grandParents the grandParents to set
	 */
	public void setGrandParents(Collection<String> grandParents);
	/**
	 * @return the grandChildren
	 */
	public Collection<String> getGrandChildren();

	/**
	 * @param grandChildren the grandChildren to set
	 */
	public void setGrandChildren(Collection<String> grandChildren);

	/**
	 * @return the significantOther
	 */
	public Collection<String> getSignificantOther();
	
	/**
	 * @param significantOther the significantOther to set
	 */
	public void setSignificantOther(Collection<String> significantOther);

}
