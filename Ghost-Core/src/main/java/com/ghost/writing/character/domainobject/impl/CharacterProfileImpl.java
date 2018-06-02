package com.ghost.writing.character.domainobject.impl;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.ghost.writing.character.domainobject.CharacterProfile;
import com.ghost.writing.components.Address;
import com.ghost.writing.components.EmbeddedAddressTest;
import com.ghost.writing.components.Nationality.Race;

@Entity
@Table(name="CharacterProfile")
public class CharacterProfileImpl implements CharacterProfile{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String firstName;
	private String lastName;
	private Race nat;
	private String socioeconomicLevelAsAChild;
	private String socioeconomicLevelAsAnAdult;
	private String homeTown;
	private String currentAddress;
	
	@ElementCollection
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "controlRuleAttribPK.controlRuleId")
//	@Cascade(CascadeType.ALL)
	@CollectionTable(name="Address")
	private Set<Address> listofAddresses = new HashSet<Address>();  //try to spring load this object instead of creating a new object here
	
	
//	@ElementCollection
	
//	private List<Address> otherAddresses;
//	@Embedded
//	private EmbeddedAddressTest otherAddresses;
	private String occupation;
	private String income;
//	private List<String> talents;
//	private List<String> skills;
	private String salary;
	private Integer birthOrder;
//	private List<String> siblings;
	private String spouse;
//	private List<String> children;
//	private List<String> grandParents;
//	private List<String> grandChildren;
//	private List<String> significantOthers;
	
	
//	private EmotionalCharacteristics ec;
//	private IntellectualCharacteristics ic;
//	private PhysicalCharacteristics pc;
//	private SpiritualCharacteristics sc;
//	private CharacterArch ca;
	
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
	public Race getNat() {
		return nat;
	}
	/**
	 * @param nat the nat to set
	 */
	public void setNat(Race nat) {
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
//	/**
//	 * @return the otherAddresses
//	 */
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CharacterProfile")
//	@Cascade({CascadeType.SAVE_UPDATE})
//	public List<Address> getOtherAddresses() {
//		return otherAddresses;
//	}
//	/**
//	 * @param otherAddresses the otherAddresses to set
//	 */
//	public void setOtherAddresses(List<Address> otherAddresses) {
//		this.otherAddresses = otherAddresses;
//	}
	
//	
//	/**
//	 * @return the otherAddresses
//	 */
//	public EmbeddedAddressTest getOtherAddresses() {
//		return otherAddresses;
//	}
//	/**
//	 * @param otherAddresses the otherAddresses to set
//	 */
//	public void setOtherAddresses(EmbeddedAddressTest otherAddresses) {
//		this.otherAddresses = otherAddresses;
//	}
	
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
//	/**
//	 * @return the talents
//	 */
//	public List<String> getTalents() {
//		return talents;
//	}
//	/**
//	 * @param talents the talents to set
//	 */
//	public void setTalents(List<String> talents) {
//		this.talents = talents;
//	}
//	/**
//	 * @return the skills
//	 */
//	public List<String> getSkills() {
//		return skills;
//	}
//	/**
//	 * @param skills the skills to set
//	 */
//	public void setSkills(List<String> skills) {
//		this.skills = skills;
//	}
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
//	/**
//	 * @return the siblings
//	 */
//	public List<String> getSiblings() {
//		return siblings;
//	}
//	/**
//	 * @param siblings the siblings to set
//	 */
//	public void setSiblings(List<String> siblings) {
//		this.siblings = siblings;
//	}
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
//	/**
//	 * @return the children
//	 */
//	public List<String> getChildren() {
//		return children;
//	}
//	/**
//	 * @param children the children to set
//	 */
//	public void setChildren(List<String> children) {
//		this.children = children;
//	}
//	/**
//	 * @return the grandParents
//	 */
//	public List<String> getGrandParents() {
//		return grandParents;
//	}
	/**
	 * @return the ec
	 */
//	public EmotionalCharacteristics getEc() {
//		return ec;
//	}
//	/**
//	 * @param ec the ec to set
//	 */
//	public void setEc(EmotionalCharacteristics ec) {
//		this.ec = ec;
//	}
//	/**
//	 * @return the ic
//	 */
//	public IntellectualCharacteristics getIc() {
//		return ic;
//	}
//	/**
//	 * @param ic the ic to set
//	 */
//	public void setIc(IntellectualCharacteristics ic) {
//		this.ic = ic;
//	}
//	/**
//	 * @return the pc
//	 */
//	public PhysicalCharacteristics getPc() {
//		return pc;
//	}
//	/**
//	 * @param pc the pc to set
//	 */
//	public void setPc(PhysicalCharacteristics pc) {
//		this.pc = pc;
//	}
//	/**
//	 * @return the sc
//	 */
//	public SpiritualCharacteristics getSc() {
//		return sc;
//	}
//	/**
//	 * @param sc the sc to set
//	 */
//	public void setSc(SpiritualCharacteristics sc) {
//		this.sc = sc;
//	}
//	/**
//	 * @return the ca
//	 */
//	public CharacterArch getCa() {
//		return ca;
//	}
//	/**
//	 * @param ca the ca to set
//	 */
//	public void setCa(CharacterArch ca) {
//		this.ca = ca;
//	}
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
	 * @return the listofAddresses
	 */
	public Set<Address> getListofAddresses() {
		return listofAddresses;
	}
	/**
	 * @param listofAddresses the listofAddresses to set
	 */
	public void setListofAddresses(Set<Address> listofAddresses) {
		this.listofAddresses = listofAddresses;
	}
}
