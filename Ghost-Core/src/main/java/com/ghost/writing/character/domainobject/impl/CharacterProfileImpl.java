package com.ghost.writing.character.domainobject.impl;


import java.util.List;
import com.ghost.writing.character.dao.impl.CharacterProfileDaoImpl.Nationality;
import com.ghost.writing.character.domainobject.CharacterArch;
import com.ghost.writing.character.domainobject.CharacterProfile;
import com.ghost.writing.character.domainobject.EmotionalCharacteristics;
import com.ghost.writing.character.domainobject.IntellectualCharacteristics;
import com.ghost.writing.character.domainobject.PhysicalCharacteristics;
import com.ghost.writing.character.domainobject.SpiritualCharacteristics;


public class CharacterProfileImpl implements CharacterProfile{
	private String name;
	private String firstName;
	private String lastName;
	private Nationality nat;
	private String socioeconomicLevelAsAChild;
	private String socioeconomicLevelAsAnAdult;
	private String homeTown;
	private String currentAddress;
	private List<String> otherAddresses;
	private String occupation;
	private String income;
	private List<String> talents;
	private List<String> skills;
	private String salary;
	private Integer birthOrder;
	private List<String> siblings;
	private List<String> spouse;
	private List<String> children;
	private List<String> grandParents;
	private List<String> grandChildren;
	private List<String> significantOthers;
	
	
	private EmotionalCharacteristics ec;
	private IntellectualCharacteristics ic;
	private PhysicalCharacteristics pc;
	private SpiritualCharacteristics sc;
	private CharacterArch ca;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the nat
	 */
	public Nationality getNat() {
		return nat;
	}
	/**
	 * @param nat the nat to set
	 */
	public void setNat(Nationality nat) {
		this.nat = nat;
	}
	/**
	 * @return the socioeconomicLevelAsAChild
	 */
	public String getSocioeconomicLevelAsAChild() {
		return socioeconomicLevelAsAChild;
	}
	/**
	 * @param socioeconomicLevelAsAChild the socioeconomicLevelAsAChild to set
	 */
	public void setSocioeconomicLevelAsAChild(String socioeconomicLevelAsAChild) {
		this.socioeconomicLevelAsAChild = socioeconomicLevelAsAChild;
	}
	/**
	 * @return the socioeconomicLevelAsAnAdult
	 */
	public String getSocioeconomicLevelAsAnAdult() {
		return socioeconomicLevelAsAnAdult;
	}
	/**
	 * @param socioeconomicLevelAsAnAdult the socioeconomicLevelAsAnAdult to set
	 */
	public void setSocioeconomicLevelAsAnAdult(String socioeconomicLevelAsAnAdult) {
		this.socioeconomicLevelAsAnAdult = socioeconomicLevelAsAnAdult;
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
	 * @return the currentAddress
	 */
	public String getCurrentAddress() {
		return currentAddress;
	}
	/**
	 * @param currentAddress the currentAddress to set
	 */
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	/**
	 * @return the otherAddresses
	 */
	public List<String> getOtherAddresses() {
		return otherAddresses;
	}
	/**
	 * @param otherAddresses the otherAddresses to set
	 */
	public void setOtherAddresses(List<String> otherAddresses) {
		this.otherAddresses = otherAddresses;
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
	 * @return the talents
	 */
	public List<String> getTalents() {
		return talents;
	}
	/**
	 * @param talents the talents to set
	 */
	public void setTalents(List<String> talents) {
		this.talents = talents;
	}
	/**
	 * @return the skills
	 */
	public List<String> getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<String> skills) {
		this.skills = skills;
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
	public Integer getBirthOrder() {
		return birthOrder;
	}
	/**
	 * @param birthOrder the birthOrder to set
	 */
	public void setBirthOrder(Integer birthOrder) {
		this.birthOrder = birthOrder;
	}
	/**
	 * @return the siblings
	 */
	public List<String> getSiblings() {
		return siblings;
	}
	/**
	 * @param siblings the siblings to set
	 */
	public void setSiblings(List<String> siblings) {
		this.siblings = siblings;
	}
	/**
	 * @return the spouse
	 */
	public List<String> getSpouse() {
		return spouse;
	}
	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(List<String> spouse) {
		this.spouse = spouse;
	}
	/**
	 * @return the children
	 */
	public List<String> getChildren() {
		return children;
	}
	/**
	 * @param children the children to set
	 */
	public void setChildren(List<String> children) {
		this.children = children;
	}
	/**
	 * @return the grandParents
	 */
	public List<String> getGrandParents() {
		return grandParents;
	}
	/**
	 * @param grandParents the grandParents to set
	 */
	public void setGrandParents(List<String> grandParents) {
		this.grandParents = grandParents;
	}
	/**
	 * @return the grandChildren
	 */
	public List<String> getGrandChildren() {
		return grandChildren;
	}
	/**
	 * @param grandChildren the grandChildren to set
	 */
	public void setGrandChildren(List<String> grandChildren) {
		this.grandChildren = grandChildren;
	}
	/**
	 * @return the significantOthers
	 */
	public List<String> getSignificantOthers() {
		return significantOthers;
	}
	/**
	 * @param significantOthers the significantOthers to set
	 */
	public void setSignificantOthers(List<String> significantOthers) {
		this.significantOthers = significantOthers;
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
