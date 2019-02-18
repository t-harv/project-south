package com.ghost.domainobject.impl;


import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.ghost.domainobject.ICharacterProfile;
import com.ghost.writing.components.Address;
import com.ghost.writing.components.Nationality.Race;
/**
 * 
 * @author toyan
 * Character Profile!
 * 
 * 
 * Notes
 * I want to reduce the amount of collection tables being generated. A lot of these collections can be merged together.
 *
 */
@Entity
@Table(name="CharacterProfile")
public class CharacterProfileImpl implements ICharacterProfile{
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
	@CollectionTable(name="Address" , joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")  //investigate what this means
	@CollectionId(columns = { @Column(name="address_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<Address> listofAddresses;  //try to spring load this object instead of creating a new object here
	
	
	
//	@Embedded
//	private EmbeddedAddressTest otherAddresses;
	private String occupation;
	private String income;
	@ElementCollection
	@CollectionTable(name="Talents", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="talent_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> talents;
	
	@ElementCollection
	@CollectionTable(name="Skills", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="skill_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> skills;
	private String salary;
	private Integer birthOrder;
	@ElementCollection
	@CollectionTable(name="Siblings", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="sibling_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> siblings;
	private String spouse;
	@ElementCollection
	@CollectionTable(name="Children", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="children_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> children;
	@ElementCollection
	@CollectionTable(name="GrandParents", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="grand_parent_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> grandParents;
	@ElementCollection
	@CollectionTable(name="GrandChildren", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="grand_children_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> grandChildren;
	@ElementCollection
	@CollectionTable(name="Significant_Other", joinColumns=@JoinColumn(name="character_profile_id"))
	@GenericGenerator(name="sequence-gen", strategy="sequence")
	@CollectionId(columns = { @Column(name="significant_other_id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<String> significantOthers;
	
	
//	@ElementCollection
//	@CollectionTable(name="Emotional_Characteristics" , joinColumns=@JoinColumn(name="character_profile_id"))
//	@GenericGenerator(name="sequence-gen", strategy="sequence")  //investigate what this means
//	@CollectionId(columns = { @Column(name="emotional_char_id") }, generator = "sequence-gen", type = @Type(type="long"))
//	@Embedded
//	private EmotionalCharacteristics ec;
//	private IIntellectualCharacteristics ic;
//	private PhysicalCharacteristics pc;
//	private SpiritualCharacteristics sc;
//	private CharacterArch ca;
	
	
	public CharacterProfileImpl() {
		System.out.println("Hi!");
	}
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
	/**
	 * @return the talents
	 */
	public Collection<String> getTalents() {
		return talents;
	}
	/**
	 * @param talents the talents to set
	 */
	public void setTalents(Collection<String> talents) {
		this.talents = talents;
	}
	/**
	 * @return the skills
	 */
	public Collection<String> getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(Collection<String> skills) {
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
//	/**
//	 * @return the ec
//	 */
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
//	public IIntellectualCharacteristics getIc() {
//		return ic;
//	}
//	/**
//	 * @param ic the ic to set
//	 */
//	public void setIc(IIntellectualCharacteristics ic) {
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
	public Collection<Address> getListofAddresses() {
		return listofAddresses;
	}
	/**
	 * @param listofAddresses the listofAddresses to set
	 */
	public void setListofAddresses(Collection<Address> listofAddresses) {
		this.listofAddresses = listofAddresses;
	}
	
	public void setBirthOrder(int x) {
		// TODO Auto-generated method stub
		
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
	 * @return the significantOthers
	 */
	public Collection<String> getSignificantOthers() {
		return significantOthers;
	}
	/**
	 * @param significantOthers the significantOthers to set
	 */
	public void setSignificantOthers(Collection<String> significantOthers) {
		this.significantOthers = significantOthers;
	}
	/**
	 * @param grandParents the grandParents to set
	 */
	public void setGrandParents(Collection<String> grandParents) {
		this.grandParents = grandParents;
	}
}
