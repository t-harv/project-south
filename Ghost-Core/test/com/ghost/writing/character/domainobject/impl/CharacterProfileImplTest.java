package com.ghost.writing.character.domainobject.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ghost.writing.character.domainobject.CharacterArch;
import com.ghost.writing.character.domainobject.CharacterProfile;
import com.ghost.writing.character.domainobject.EmotionalCharacteristics;
import com.ghost.writing.character.domainobject.IntellectualCharacteristics;
import com.ghost.writing.character.domainobject.PhysicalCharacteristics;
import com.ghost.writing.character.domainobject.SpiritualCharacteristics;
import com.ghost.writing.components.Nationality.Race;

public class CharacterProfileImplTest {
	private CharacterProfile joyce;
	private CharacterProfile langston;
	

	@Before
	public void setupJoyce() {
		joyce = new CharacterProfileImpl();
		
		((CharacterProfileImpl)joyce).setBirthOrder(3);
		List<String> joyceChildren = new ArrayList<String>();
		joyceChildren.add("Langston Harvey");
		((CharacterProfileImpl)joyce).setChildren(joyceChildren); //Langston & Toyce
		((CharacterProfileImpl)joyce).setCurrentAddress("14306 Sunset View Dr, Bowie MD 20720");
		((CharacterProfileImpl)joyce).setFirstName("Joyce");
		List<String> joyceGrandChildren = new ArrayList<String>();
		((CharacterProfileImpl)joyce).setGrandChildren(joyceGrandChildren);
		List<String> joyceGrandParents = new ArrayList<String>();
		joyceGrandParents.add("Grandma JJ");
		joyceGrandParents.add("Grandpa JJ");
		((CharacterProfileImpl)joyce).setGrandParents(joyceGrandParents);
		((CharacterProfileImpl)joyce).setHomeTown("Japan Okinawa");
		((CharacterProfileImpl)joyce).setIncome("400k");
		((CharacterProfileImpl)joyce).setLastName("Harvey");
		((CharacterProfileImpl)joyce).setName("Joyce Minksy Harvey");
		((CharacterProfileImpl)joyce).setNat(Race.BLACK);
		((CharacterProfileImpl)joyce).setOccupation("Software Developer");
		List<String> joyceOtherAddresses = new ArrayList<String>();				
		((CharacterProfileImpl)joyce).setOtherAddresses(joyceOtherAddresses);
		((CharacterProfileImpl)joyce).setSalary("400k");
		List<String> joyceSiblings = new ArrayList<String>();
		joyceSiblings.add("DeeDee Paterson");
		joyceSiblings.add("Winston Curry");
		((CharacterProfileImpl)joyce).setSiblings(joyceSiblings);
		List<String> joyceSignificantOthers = new ArrayList<String>();
		joyceSignificantOthers.add("Toyan Harvey");
		((CharacterProfileImpl)joyce).setSignificantOthers(joyceSignificantOthers);
		List<String> joyceSkills = new ArrayList<String>();
		joyceSkills.add("Mommy Skills");
		((CharacterProfileImpl)joyce).setSkills(joyceSkills);
		((CharacterProfileImpl)joyce).setSocioeconomicLevelAsAChild("Middle Class");
		((CharacterProfileImpl)joyce).setSocioeconomicLevelAsAnAdult("Middle Class");
		((CharacterProfileImpl)joyce).setSpouse("Toyan Harvey");
		List<String> joyceTalents = new ArrayList<String>();
		joyceTalents.add("Tap Dancing");
		((CharacterProfileImpl)joyce).setTalents(joyceTalents);
		
		
		
		
		
//		Spiritual Characteristics
		SpiritualCharacteristics sc = new SpiritualCharacteristicsImpl();
		((SpiritualCharacteristicsImpl)sc).setBelieve(true);
		((SpiritualCharacteristicsImpl)sc).setRole("Everything");
		((SpiritualCharacteristicsImpl)sc).setSpiritual(true);
		List<String> joyceSpiritualBeliefs = new ArrayList<String>();
		joyceSpiritualBeliefs.add("Guidance");
		((SpiritualCharacteristicsImpl)sc).setSpiritualBeliefs(joyceSpiritualBeliefs);
		((CharacterProfileImpl)joyce).setSc(sc);
		
		
		
//		Physical Characteristics
		PhysicalCharacteristics pc = new PhysicalCharacteristicsImpl();
		((PhysicalCharacteristicsImpl)pc).setBestQuality("Smart");
		((PhysicalCharacteristicsImpl)pc).setContactLenses(false);
		List<String> joyceDisabilities = new ArrayList<String>();
		((PhysicalCharacteristicsImpl)pc).setDisabilities(joyceDisabilities);
		List<String> joyceDistinguishingFeatures = new ArrayList<String>();
		joyceDistinguishingFeatures.add("Nose Mole");
		joyceDistinguishingFeatures.add("Tounge Birthmark");
		((PhysicalCharacteristicsImpl)pc).setDistinguishingFeatures(joyceDistinguishingFeatures);
		((PhysicalCharacteristicsImpl)pc).setDressCode("Casual");
		((PhysicalCharacteristicsImpl)pc).setEyeColor("Brown");
		((PhysicalCharacteristicsImpl)pc).setFavoriteSaying("Kick Rocks");
		((PhysicalCharacteristicsImpl)pc).setGlasse(true);
		((PhysicalCharacteristicsImpl)pc).setGreatestFlaw("Temper");
		List<String> joyceHabits = new ArrayList<String>();
		joyceHabits.add("Worry");
		joyceHabits.add("Reading articles");
		((PhysicalCharacteristicsImpl)pc).setHabits(joyceHabits);
		((PhysicalCharacteristicsImpl)pc).setHairColor("Black");
		List<String> joyceHealth = new ArrayList<String>();
		joyceHealth.add("Healthy");
		((PhysicalCharacteristicsImpl)pc).setHealth(joyceHealth);
		((PhysicalCharacteristicsImpl)pc).setHight(6);
		List<String> joyceHobbies = new ArrayList<String>();
		joyceHobbies.add("Reading");
		((PhysicalCharacteristicsImpl)pc).setHobbies(joyceHobbies);
		((PhysicalCharacteristicsImpl)pc).setMannerisms("Well");
		((PhysicalCharacteristicsImpl)pc).setRace(Race.BLACK);
		((PhysicalCharacteristicsImpl)pc).setShapeOfFace("Oval");
		((PhysicalCharacteristicsImpl)pc).setSkinColor("Black");
		((PhysicalCharacteristicsImpl)pc).setSpeachPatterns("Perfact Grammar and English");
		((PhysicalCharacteristicsImpl)pc).setStyle("What's popular");
		((PhysicalCharacteristicsImpl)pc).setWeight(185);
		((CharacterProfileImpl)joyce).setPc(pc);
		
		
		
//		Intellectual Characteristics
		IntellectualCharacteristics ic = new IntellectualCharacteristicsImpl();
		List<String> joyceEducation = new ArrayList<String>();
		joyceEducation.add("Bacholers");
		joyceEducation.add("Masters");
		((IntellectualCharacteristicsImpl)ic).setEducation(joyceEducation);
		((IntellectualCharacteristicsImpl)ic).setEmbarrassment("Comments towards self");
		((IntellectualCharacteristicsImpl)ic).setEmotional(true);
		((IntellectualCharacteristicsImpl)ic).setIntelligenceLevel("High");
		List<String> joyceLearningExperiences = new ArrayList<String>();
		joyceLearningExperiences.add("Life");
		((IntellectualCharacteristicsImpl)ic).setLearningExperiences(joyceLearningExperiences);
		List<String> joyceLongTermGoals = new ArrayList<String>();
		joyceLongTermGoals.add("Christianity");
		((IntellectualCharacteristicsImpl)ic).setLongTermGoals(joyceLongTermGoals);
		List<String> joyceMentalIllnesses = new ArrayList<String>();
		((IntellectualCharacteristicsImpl)ic).setMentalIllnesses(joyceMentalIllnesses);
		((IntellectualCharacteristicsImpl)ic).setPerception("Positive");
		((IntellectualCharacteristicsImpl)ic).setSelfConfident(true);
		((IntellectualCharacteristicsImpl)ic).setSelfViewPoint("High");
		List<String> joyceShortTermGoals = new ArrayList<String>();
		joyceShortTermGoals.add("Another Baby");
		((IntellectualCharacteristicsImpl)ic).setShortTermGoals(joyceShortTermGoals);
		((CharacterProfileImpl)joyce).setIc(ic);
		
		//Emotional Characteristics
		EmotionalCharacteristics ec = new EmotionalCharacteristicsImpl();
		((EmotionalCharacteristicsImpl)ec).setAngerManagement("Needs it");
		((EmotionalCharacteristicsImpl)ec).setChangeManagement("50/50 resistant to change");
		((EmotionalCharacteristicsImpl)ec).setConflictManagement("None!  Very angry");
		((EmotionalCharacteristicsImpl)ec).setFrightens("Very afraid of random stuff");
		((EmotionalCharacteristicsImpl)ec).setHappy("50/50");
		((EmotionalCharacteristicsImpl)ec).setJudgmental(true);
		((EmotionalCharacteristicsImpl)ec).setLossManagement("Unknown");
		List<String> joyceMotivations = new ArrayList<String>();
		joyceMotivations.add("Langston");
		joyceMotivations.add("God");
		((EmotionalCharacteristicsImpl)ec).setMotivations(joyceMotivations);
		((EmotionalCharacteristicsImpl)ec).setPolite(true);
		((EmotionalCharacteristicsImpl)ec).setRude(false);
		((EmotionalCharacteristicsImpl)ec).setSadManagement("Not good");
		List<String> joyceStrengths = new ArrayList<String>();
		joyceStrengths.add("Herself");
		((EmotionalCharacteristicsImpl)ec).setStrengths(joyceStrengths);
		((EmotionalCharacteristicsImpl)ec).setWantOutOfLife("Happiness");
		List<String> joyceWeaknesses = new ArrayList<String>();
		joyceWeaknesses.add("Food!");
		((EmotionalCharacteristicsImpl)ec).setWeaknesses(joyceWeaknesses);
		((CharacterProfileImpl)joyce).setEc(ec);
		
		
		//character arch
		CharacterArch ca = new CharacterArchImpl();
		((CharacterArchImpl)ca).setCharacterRole("Unknown");
		((CharacterArchImpl)ca).setFinale("Unknown");
		((CharacterArchImpl)ca).setFirstAppearance("2013, Washington DC");
		List<CharacterProfile> joyceRelationships = new ArrayList<CharacterProfile>();
		((CharacterArchImpl)ca).setRelationships(joyceRelationships);
		((CharacterProfileImpl)joyce).setCa(ca);
	}
	
	@Test
	public void compareTest() {
		Assert.assertEquals(((CharacterProfileImpl)getJoyce()).getFirstName(), "Joyce");
		
	}

	/**
	 * @return the joyce
	 */
	public CharacterProfile getJoyce() {
		return joyce;
	}

	/**
	 * @param joyce the joyce to set
	 */
	public void setJoyce(CharacterProfile joyce) {
		joyce = joyce;
	}

	/**
	 * @return the langston
	 */
	public CharacterProfile getLangston() {
		return langston;
	}

	/**
	 * @param langston the langston to set
	 */
	public void setLangston(CharacterProfile langston) {
		langston = langston;
	}
	

}
