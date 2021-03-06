package com.ghost.domainobject.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ghost.domainobject.ICharacterArch;
import com.ghost.domainobject.ICharacterProfile;
import com.ghost.domainobject.IEmotionalCharacteristics;
import com.ghost.domainobject.IIntellectualCharacteristics;
import com.ghost.domainobject.IPhysicalCharacteristics;
import com.ghost.domainobject.ISpiritualCharacteristics;
import com.ghost.writing.components.EmbeddedAddressTest;
import com.ghost.writing.components.Nationality.Race;

public class CharacterProfileImplTest {
	private ICharacterProfile jala;
	private ICharacterProfile babyL;
	

	@Before
	public void setupJala() {
		jala = new CharacterProfileImpl();
		
		((CharacterProfileImpl)jala).setBirthOrder(3);
		List<String> jalaChildren = new ArrayList<String>();
		jalaChildren.add("BabyL Haley");
//		((CharacterProfileImpl)jala).setChildren(jalaChildren); //BabyL & Toyce
		((CharacterProfileImpl)jala).setCurrentAddress("14306 Sunset View Dr, Bowie MD 20720");
		((CharacterProfileImpl)jala).setFirstName("Jala");
		List<String> jalaGrandChildren = new ArrayList<String>();
//		((CharacterProfileImpl)jala).setGrandChildren(jalaGrandChildren);
		List<String> jalaGrandParents = new ArrayList<String>();
		jalaGrandParents.add("Grandma JJ");
		jalaGrandParents.add("Grandpa JJ");
//		((CharacterProfileImpl)jala).setGrandParents(jalaGrandParents);
		((CharacterProfileImpl)jala).setHomeTown("Japan Okinawa");
		((CharacterProfileImpl)jala).setIncome("400k");
		((CharacterProfileImpl)jala).setLastName("Haley");
		((CharacterProfileImpl)jala).setName("Jala Minksy Haley");
		((CharacterProfileImpl)jala).setNat(Race.BLACK);
		((CharacterProfileImpl)jala).setOccupation("Software Developer");
		List<EmbeddedAddressTest> jalaOtherAddresses = new ArrayList<EmbeddedAddressTest>();				
//		((CharacterProfileImpl)jala).setOtherAddresses(jalaOtherAddresses);
		((CharacterProfileImpl)jala).setSalary("400k");
		List<String> jalaSiblings = new ArrayList<String>();
		jalaSiblings.add("DeeDee Paterson");
		jalaSiblings.add("Winston Curry");
//		((CharacterProfileImpl)jala).setSiblings(jalaSiblings);
		List<String> jalaSignificantOthers = new ArrayList<String>();
		jalaSignificantOthers.add("Toyan Haley");
//		((CharacterProfileImpl)jala).setSignificantOthers(jalaSignificantOthers);
		List<String> jalaSkills = new ArrayList<String>();
		jalaSkills.add("Mommy Skills");
//		((CharacterProfileImpl)jala).setSkills(jalaSkills);
		((CharacterProfileImpl)jala).setSocioeconomicLevelAsAChild("Middle Class");
		((CharacterProfileImpl)jala).setSocioeconomicLevelAsAnAdult("Middle Class");
		((CharacterProfileImpl)jala).setSpouse("Toyan Haley");
		List<String> jalaTalents = new ArrayList<String>();
		jalaTalents.add("Tap Dancing");
//		((CharacterProfileImpl)jala).setTalents(jalaTalents);
		
		
		
		
		
//		Spiritual Characteristics
		ISpiritualCharacteristics sc = new SpiritualCharacteristicsImpl();
		((SpiritualCharacteristicsImpl)sc).setBelieve(true);
		((SpiritualCharacteristicsImpl)sc).setRole("Everything");
		((SpiritualCharacteristicsImpl)sc).setSpiritual(true);
		List<String> jalaSpiritualBeliefs = new ArrayList<String>();
		jalaSpiritualBeliefs.add("Guidance");
		((SpiritualCharacteristicsImpl)sc).setSpiritualBeliefs(jalaSpiritualBeliefs);
//		((CharacterProfileImpl)jala).setSc(sc);
		
		
		
//		Physical Characteristics
		IPhysicalCharacteristics pc = new PhysicalCharacteristicsImpl();
		((PhysicalCharacteristicsImpl)pc).setBestQuality("Smart");
		((PhysicalCharacteristicsImpl)pc).setContactLenses(false);
		List<String> jalaDisabilities = new ArrayList<String>();
		((PhysicalCharacteristicsImpl)pc).setDisabilities(jalaDisabilities);
		List<String> jalaDistinguishingFeatures = new ArrayList<String>();
		jalaDistinguishingFeatures.add("Nose Mole");
		jalaDistinguishingFeatures.add("Tounge Birthmark");
		((PhysicalCharacteristicsImpl)pc).setDistinguishingFeatures(jalaDistinguishingFeatures);
		((PhysicalCharacteristicsImpl)pc).setDressCode("Casual");
		((PhysicalCharacteristicsImpl)pc).setEyeColor("Brown");
		((PhysicalCharacteristicsImpl)pc).setFavoriteSaying("Kick Rocks");
		((PhysicalCharacteristicsImpl)pc).setGlasse(true);
		((PhysicalCharacteristicsImpl)pc).setGreatestFlaw("Temper");
		List<String> jalaHabits = new ArrayList<String>();
		jalaHabits.add("Worry");
		jalaHabits.add("Reading articles");
		((PhysicalCharacteristicsImpl)pc).setHabits(jalaHabits);
		((PhysicalCharacteristicsImpl)pc).setHairColor("Black");
		List<String> jalaHealth = new ArrayList<String>();
		jalaHealth.add("Healthy");
		((PhysicalCharacteristicsImpl)pc).setHealth(jalaHealth);
		((PhysicalCharacteristicsImpl)pc).setHight(6);
		List<String> jalaHobbies = new ArrayList<String>();
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
		
		
		
//		Intellectual Characteristics
		IIntellectualCharacteristics ic = new IntellectualCharacteristicsImpl();
		List<String> jalaEducation = new ArrayList<String>();
		jalaEducation.add("Bacholers");
		jalaEducation.add("Masters");
		((IntellectualCharacteristicsImpl)ic).setEducation(jalaEducation);
		((IntellectualCharacteristicsImpl)ic).setEmbarrassment("Comments towards self");
		((IntellectualCharacteristicsImpl)ic).setEmotional(true);
		((IntellectualCharacteristicsImpl)ic).setIntelligenceLevel("High");
		List<String> jalaLearningExperiences = new ArrayList<String>();
		jalaLearningExperiences.add("Life");
		((IntellectualCharacteristicsImpl)ic).setLearningExperiences(jalaLearningExperiences);
		List<String> jalaLongTermGoals = new ArrayList<String>();
		jalaLongTermGoals.add("Christianity");
		((IntellectualCharacteristicsImpl)ic).setLongTermGoals(jalaLongTermGoals);
		List<String> jalaMentalIllnesses = new ArrayList<String>();
		((IntellectualCharacteristicsImpl)ic).setMentalIllnesses(jalaMentalIllnesses);
		((IntellectualCharacteristicsImpl)ic).setPerception("Positive");
		((IntellectualCharacteristicsImpl)ic).setSelfConfident(true);
		((IntellectualCharacteristicsImpl)ic).setSelfViewPoint("High");
		List<String> jalaShortTermGoals = new ArrayList<String>();
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
		List<String> jalaMotivations = new ArrayList<String>();
		jalaMotivations.add("BabyL");
		jalaMotivations.add("God");
//		((EmotionalCharacteristicsImpl)ec).setMotivations(jalaMotivations);
		((EmotionalCharacteristicsImpl)ec).setPolite(true);
		((EmotionalCharacteristicsImpl)ec).setRude(false);
		((EmotionalCharacteristicsImpl)ec).setSadManagement("Not good");
		List<String> jalaStrengths = new ArrayList<String>();
		jalaStrengths.add("Herself");
//		((EmotionalCharacteristicsImpl)ec).setStrengths(jalaStrengths);
		((EmotionalCharacteristicsImpl)ec).setWantOutOfLife("Happiness");
		List<String> jalaWeaknesses = new ArrayList<String>();
		jalaWeaknesses.add("Food!");
//		((EmotionalCharacteristicsImpl)ec).setWeaknesses(jalaWeaknesses);
//		((CharacterProfileImpl)jala).setEc(ec);
		
		
		//character arch
		ICharacterArch ca = new CharacterArchImpl();
		((CharacterArchImpl)ca).setCharacterRole("Unknown");
		((CharacterArchImpl)ca).setFinale("Unknown");
		((CharacterArchImpl)ca).setFirstAppearance("2013, Washington DC");
		List<ICharacterProfile> jalaRelationships = new ArrayList<ICharacterProfile>();
//		((CharacterArchImpl)ca).setRelationships(jalaRelationships);
//		((CharacterProfileImpl)jala).setCa(ca);
	}
	
	@Test
	public void compareTest() {
		Assert.assertEquals(((CharacterProfileImpl)getJala()).getFirstName(), "Jala");
		
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
		jala = jala;
	}

	/**
	 * @return the babyL
	 */
	public ICharacterProfile getBabyL() {
		return babyL;
	}

	/**
	 * @param babyL the babyL to set
	 */
	public void setBabyL(ICharacterProfile babyL) {
		babyL = babyL;
	}
	

}
