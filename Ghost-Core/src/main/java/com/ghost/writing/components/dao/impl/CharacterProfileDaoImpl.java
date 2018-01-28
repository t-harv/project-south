package com.ghost.writing.components.dao.impl;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.ghost.writing.components.dao.CharacterArch;
import com.ghost.writing.components.dao.CharacterProfile;
import com.ghost.writing.components.dao.EmotionalCharacteristics;
import com.ghost.writing.components.dao.IntellectualCharacteristics;
import com.ghost.writing.components.dao.PhysicalCharacteristics;
import com.ghost.writing.components.dao.SpiritualCharacteristics;

@XmlRootElement
@Entity
@Table(name="CHARACTER_PROFILE")
public class CharacterProfileDaoImpl implements CharacterProfile {
	//auto generated primary key
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;  //Surrogate key, means we want hibernate to do the job of populating this for us
	private String firstName;
	private String lastName;
	private String characterName;
	//private String nationality;  //can i have an enumeration?
	public enum nationality{BLACK, WHITE, ALASKIAN ,  HISPANIC, INDIAN, ASIAN, OTHER}; 
	private String homeTown;
	private String address;
	private String occupation;
	private String income;
	private Collection<String> talentSkills;  //make this a list
	private String salary;
	private String birthOrder;
	private Collection<String> siblings;  //make this a list
	private String spouse; 
	private Collection<String> children;  //make this a list
	private Collection<String> grandParents; //make this a list
	private Collection<String> grandChildren; //make this a list
	private Collection<String> significantOther;  //make this a list
	
	private PhysicalCharacteristics pc;
	private IntellectualCharacteristics ic;
	private EmotionalCharacteristics ec;
	private SpiritualCharacteristics sc;
	private CharacterArch ca;
	
	public CharacterProfileDaoImpl(CharacterProfile cp) {
		id = cp.getId();
		firstName = cp.getFirstName();
		lastName = cp.getLastName();
		characterName = cp.getCharacterName();
		homeTown = cp.getHomeTown();
		address = cp.getAddress();
		occupation = cp.getOccupation();
		income = cp.getIncome();
		talentSkills = cp.getTalentSkills();
		salary = cp.getSalary();
		birthOrder = cp.getBirthOrder();
		siblings = cp.getSiblings();
		spouse = cp.getSpouse();
		children = cp.getChildren();
		grandParents = cp.getGrandParents();
		grandChildren = cp.getGrandChildren();
		significantOther = cp.getSignificantOther();
		
//		pc = new PhysicalCharacteristicsDaoImpl(cp.get);
		
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * @return the homeTown
	 */
	public String getHomeTown() {
		return homeTown;
	}

	/**
	 * @param homeTown the homeTown to set
	 */
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the income
	 */
	public String getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(String income) {
		this.income = income;
	}

	/**
	 * @return the talentSkills
	 */
	public Collection<String> getTalentSkills() {
		return talentSkills;
	}

	/**
	 * @param talentSkills the talentSkills to set
	 */
	public void setTalentSkills(Collection<String> talentSkills) {
		this.talentSkills = talentSkills;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return the birthOrder
	 */
	public String getBirthOrder() {
		return birthOrder;
	}

	/**
	 * @param birthOrder the birthOrder to set
	 */
	public void setBirthOrder(String birthOrder) {
		this.birthOrder = birthOrder;
	}

	/**
	 * @return the siblings
	 */
	public Collection<String> getSiblings() {
		return siblings;
	}

	/**
	 * @param siblings the siblings to set
	 */
	public void setSiblings(Collection<String> siblings) {
		this.siblings = siblings;
	}

	/**
	 * @return the spouse
	 */
	public String getSpouse() {
		return spouse;
	}

	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	/**
	 * @return the children
	 */
	public Collection<String> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Collection<String> children) {
		this.children = children;
	}

	/**
	 * @return the grandParents
	 */
	public Collection<String> getGrandParents() {
		return grandParents;
	}

	/**
	 * @param grandParents the grandParents to set
	 */
	public void setGrandParents(Collection<String> grandParents) {
		this.grandParents = grandParents;
	}

	/**
	 * @return the grandChildren
	 */
	public Collection<String> getGrandChildren() {
		return grandChildren;
	}

	/**
	 * @param grandChildren the grandChildren to set
	 */
	public void setGrandChildren(Collection<String> grandChildren) {
		this.grandChildren = grandChildren;
	}

	/**
	 * @return the significantOther
	 */
	public Collection<String> getSignificantOther() {
		return significantOther;
	}

	/**
	 * @param significantOther the significantOther to set
	 */
	public void setSignificantOther(Collection<String> significantOther) {
		this.significantOther = significantOther;
	}

	/**
	 * @return the pc
	 */
	public PhysicalCharacteristics getPc() {
		return pc;
	}

	/**
	 * @param pc the pc to set
	 */
	public void setPc(PhysicalCharacteristics pc) {
		this.pc = pc;
	}

	/**
	 * @return the ic
	 */
	public IntellectualCharacteristics getIc() {
		return ic;
	}

	/**
	 * @param ic the ic to set
	 */
	public void setIc(IntellectualCharacteristics ic) {
		this.ic = ic;
	}

	/**
	 * @return the ec
	 */
	public EmotionalCharacteristics getEc() {
		return ec;
	}

	/**
	 * @param ec the ec to set
	 */
	public void setEc(EmotionalCharacteristics ec) {
		this.ec = ec;
	}

	/**
	 * @return the sc
	 */
	public SpiritualCharacteristics getSc() {
		return sc;
	}

	/**
	 * @param sc the sc to set
	 */
	public void setSc(SpiritualCharacteristics sc) {
		this.sc = sc;
	}

	/**
	 * @return the ca
	 */
	public CharacterArch getCa() {
		return ca;
	}

	/**
	 * @param ca the ca to set
	 */
	public void setCa(CharacterArch ca) {
		this.ca = ca;
	}
}
