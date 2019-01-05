package com.ghost.writing.character.domainobject.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.ghost.writing.character.domainobject.ICharacterArch;
import com.ghost.writing.character.domainobject.ICharacterProfile;
import com.ghost.writing.character.domainobject.IEmotionalCharacteristics;
import com.ghost.writing.character.domainobject.IIntellectualCharacteristics;
import com.ghost.writing.character.domainobject.IPhysicalCharacteristics;
import com.ghost.writing.character.domainobject.ISpiritualCharacteristics;
import com.ghost.writing.components.Address;
import com.ghost.writing.components.EmbeddedAddressTest;
import com.ghost.writing.components.Nationality.Race;

public class CharacterProfileDataObjects {
	
	private ICharacterProfile jala;
//	private CharacterProfile babyL;

	public CharacterProfileDataObjects() {

	}

	/**
	 * @return the jala
	 */
	public ICharacterProfile getJala() {
		return jala;
	}

	/**
	 * @param jala the jala to set
	 */
	public void setJala(ICharacterProfile jala) {
		this.jala = jala;
	}
	
	public void initialize() {
		// TODO Auto-generated constructor stub

//		jala = new CharacterProfileImpl();

//		((CharacterProfileImpl)jala).setBirthOrder(3);
		((CharacterProfileImpl) jala).setBirthOrder(3);
		Collection<String> jalaChildren = new ArrayList<String>();
		jalaChildren.add("BabyL Haley");
		((CharacterProfileImpl)jala).setChildren(jalaChildren); //BabyL & Toyce
		((CharacterProfileImpl)jala).setCurrentAddress("14306 Sunset View Dr, Bowie MD 20720");
		((CharacterProfileImpl)jala).setFirstName("Jala");
		Collection<String> jalaGrandChildren = new ArrayList<String>();
		((CharacterProfileImpl)jala).setGrandChildren(jalaGrandChildren);
		Collection<String> jalaGrandParents = new ArrayList<String>();
		jalaGrandParents.add("Grandma JJ");
		jalaGrandParents.add("Grandpa JJ");
		((CharacterProfileImpl)jala).setGrandParents(jalaGrandParents);
		((CharacterProfileImpl)jala).setHomeTown("Japan Okinawa");
		((CharacterProfileImpl)jala).setIncome("400k");
		((CharacterProfileImpl)jala).setLastName("Haley");
		((CharacterProfileImpl)jala).setName("Jala Minksy Haley");
		((CharacterProfileImpl)jala).setNat(Race.BLACK);
		((CharacterProfileImpl)jala).setOccupation("Software Developer");
//		Collection<Address> jalaOtherAddresses = new ArrayList<Address>();
		EmbeddedAddressTest jalaOtherAddresses = new EmbeddedAddressTest();
		
		Address address1 = new Address();
		Address address2 = new Address();
		
		((CharacterProfileImpl)jala).getListofAddresses().add(address1);
		((CharacterProfileImpl)jala).getListofAddresses().add(address2);
		
		
		
//		Address address1 = new Address();
//		jalaOtherAddresses.add(address1);
//		((CharacterProfileImpl)jala).setOtherAddresses(jalaOtherAddresses);
//		((CharacterProfileImpl)jala).setOtherAddresses(jalaOtherAddresses);
		((CharacterProfileImpl)jala).setSalary("400k");
		Collection<String> jalaSiblings = new ArrayList<String>();
		jalaSiblings.add("TeeGee Yolk");
		jalaSiblings.add("Wins Gary");
//		((CharacterProfileImpl)jala).setSiblings(jalaSiblings);
		Collection<String> jalaSignificantOthers = new ArrayList<String>();
		jalaSignificantOthers.add("Toyan Haley");
//		((CharacterProfileImpl)jala).setSignificantOthers(jalaSignificantOthers);
		Collection<String> jalaSkills = new ArrayList<String>();
		jalaSkills.add("Mommy Skills");
//		((CharacterProfileImpl)jala).setSkills(jalaSkills);
		((CharacterProfileImpl)jala).setSocioeconomicLevelAsAChild("Middle Class");
		((CharacterProfileImpl)jala).setSocioeconomicLevelAsAnAdult("Middle Class");
		((CharacterProfileImpl)jala).setSpouse("Toyan Haley");
		Collection<String> jalaTalents = new ArrayList<String>();
		jalaTalents.add("Tap Dancing");
		((CharacterProfileImpl)jala).setTalents(jalaTalents);





		//	Spiritual Characteristics
		ISpiritualCharacteristics sc = new SpiritualCharacteristicsImpl();
		((SpiritualCharacteristicsImpl)sc).setBelieve(true);
		((SpiritualCharacteristicsImpl)sc).setRole("Everything");
		((SpiritualCharacteristicsImpl)sc).setSpiritual(true);
		Collection<String> jalaSpiritualBeliefs = new ArrayList<String>();
		jalaSpiritualBeliefs.add("Guidance");
		((SpiritualCharacteristicsImpl)sc).setSpiritualBeliefs(jalaSpiritualBeliefs);
//		((CharacterProfileImpl)jala).setSc(sc);



		//	Physical Characteristics
		IPhysicalCharacteristics pc = new PhysicalCharacteristicsImpl();
		((PhysicalCharacteristicsImpl)pc).setBestQuality("Smart");
		((PhysicalCharacteristicsImpl)pc).setContactLenses(false);
		Collection<String> jalaDisabilities = new ArrayList<String>();
		((PhysicalCharacteristicsImpl)pc).setDisabilities(jalaDisabilities);
		Collection<String> jalaDistinguishingFeatures = new ArrayList<String>();
		jalaDistinguishingFeatures.add("Nose Mole");
		jalaDistinguishingFeatures.add("Tounge Birthmark");
		((PhysicalCharacteristicsImpl)pc).setDistinguishingFeatures(jalaDistinguishingFeatures);
		((PhysicalCharacteristicsImpl)pc).setDressCode("Casual");
		((PhysicalCharacteristicsImpl)pc).setEyeColor("Brown");
		((PhysicalCharacteristicsImpl)pc).setFavoriteSaying("Kick Rocks");
		((PhysicalCharacteristicsImpl)pc).setGlasse(true);
		((PhysicalCharacteristicsImpl)pc).setGreatestFlaw("Temper");
		Collection<String> jalaHabits = new ArrayList<String>();
		jalaHabits.add("Worry");
		jalaHabits.add("Reading articles");
		((PhysicalCharacteristicsImpl)pc).setHabits(jalaHabits);
		((PhysicalCharacteristicsImpl)pc).setHairColor("Black");
		Collection<String> jalaHealth = new ArrayList<String>();
		jalaHealth.add("Healthy");
		((PhysicalCharacteristicsImpl)pc).setHealth(jalaHealth);
		((PhysicalCharacteristicsImpl)pc).setHight(6);
		Collection<String> jalaHobbies = new ArrayList<String>();
		jalaHobbies.add("Reading");
		((PhysicalCharacteristicsImpl)pc).setHobbies(jalaHobbies);
		((PhysicalCharacteristicsImpl)pc).setMannerisms("Well");
		((PhysicalCharacteristicsImpl)pc).setRace(Race.BLACK);
		((PhysicalCharacteristicsImpl)pc).setShapeOfFace("Oval");
		((PhysicalCharacteristicsImpl)pc).setSkinColor("Black");
		((PhysicalCharacteristicsImpl)pc).setSpeachPatterns("Perfact Grammar and English");
		((PhysicalCharacteristicsImpl)pc).setStyle("What's popular");
		((PhysicalCharacteristicsImpl)pc).setWeight(185);
//		((CharacterProfileImpl)jala).setPc(pc);



		//	Intellectual Characteristics
		IIntellectualCharacteristics ic = new IntellectualCharacteristicsImpl();
		Collection<String> jalaEducation = new ArrayList<String>();
		jalaEducation.add("Bacholers");
		jalaEducation.add("Masters");
		((IntellectualCharacteristicsImpl)ic).setEducation(jalaEducation);
		((IntellectualCharacteristicsImpl)ic).setEmbarrassment("Comments towards self");
		((IntellectualCharacteristicsImpl)ic).setEmotional(true);
		((IntellectualCharacteristicsImpl)ic).setIntelligenceLevel("High");
		Collection<String> jalaLearningExperiences = new ArrayList<String>();
		jalaLearningExperiences.add("Life");
		((IntellectualCharacteristicsImpl)ic).setLearningExperiences(jalaLearningExperiences);
		Collection<String> jalaLongTermGoals = new ArrayList<String>();
		jalaLongTermGoals.add("Christianity");
		((IntellectualCharacteristicsImpl)ic).setLongTermGoals(jalaLongTermGoals);
		Collection<String> jalaMentalIllnesses = new ArrayList<String>();
		((IntellectualCharacteristicsImpl)ic).setMentalIllnesses(jalaMentalIllnesses);
		((IntellectualCharacteristicsImpl)ic).setPerception("Positive");
		((IntellectualCharacteristicsImpl)ic).setSelfConfident(true);
		((IntellectualCharacteristicsImpl)ic).setSelfViewPoint("High");
		Collection<String> jalaShortTermGoals = new ArrayList<String>();
		jalaShortTermGoals.add("Another Baby");
		((IntellectualCharacteristicsImpl)ic).setShortTermGoals(jalaShortTermGoals);
//		((CharacterProfileImpl)jala).setIc(ic);

		//Emotional Characteristics
		IEmotionalCharacteristics ec = new EmotionalCharacteristicsImpl();
		((EmotionalCharacteristicsImpl)ec).setAngerManagement("Needs it");
		((EmotionalCharacteristicsImpl)ec).setChangeManagement("50/50 resistant to change");
		((EmotionalCharacteristicsImpl)ec).setConflictManagement("None!  Very angry");
		((EmotionalCharacteristicsImpl)ec).setFrightens("Very afraid of random stuff");
		((EmotionalCharacteristicsImpl)ec).setHappy("50/50");
		((EmotionalCharacteristicsImpl)ec).setJudgmental(true);
		((EmotionalCharacteristicsImpl)ec).setLossManagement("Unknown");
		Collection<String> jalaMotivations = new ArrayList<String>();
		jalaMotivations.add("BabyL");
		jalaMotivations.add("God");
		((EmotionalCharacteristicsImpl)ec).setMotivations(jalaMotivations);
		((EmotionalCharacteristicsImpl)ec).setPolite(true);
		((EmotionalCharacteristicsImpl)ec).setRude(false);
		((EmotionalCharacteristicsImpl)ec).setSadManagement("Not good");
		Collection<String> jalaStrengths = new ArrayList<String>();
		jalaStrengths.add("Herself");
		((EmotionalCharacteristicsImpl)ec).setStrengths(jalaStrengths);
		((EmotionalCharacteristicsImpl)ec).setWantOutOfLife("Happiness");
		Collection<String> jalaWeaknesses = new ArrayList<String>();
		jalaWeaknesses.add("Food!");
		((EmotionalCharacteristicsImpl)ec).setWeaknesses(jalaWeaknesses);
		((CharacterProfileImpl)jala).setEc(ec);


		//character arch
		ICharacterArch ca = new CharacterArchImpl();
		((CharacterArchImpl)ca).setCharacterRole("Unknown");
		((CharacterArchImpl)ca).setFinale("Unknown");
		((CharacterArchImpl)ca).setFirstAppearance("2013, Washington DC");
		Collection<ICharacterProfile> jalaRelationships = new ArrayList<ICharacterProfile>();
//		((CharacterArchImpl)ca).setRelationships(jalaRelationships);
//		((CharacterProfileImpl)jala).setCa(ca);
	}

}
