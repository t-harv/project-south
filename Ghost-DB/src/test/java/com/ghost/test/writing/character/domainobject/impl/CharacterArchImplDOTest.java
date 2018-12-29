package com.ghost.test.writing.character.domainobject.impl;

import org.hibernate.Session;

import com.ghost.writing.character.domainobject.CharacterArch;
import com.ghost.writing.character.domainobject.impl.CharacterArchImpl;

import ghost.domain.hibernate.HibernateUtil;

public class CharacterArchImplDOTest {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Derby");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
//		DraftDO draft = new DraftDO(1, "First Draft!");
//		EditDO edit = new EditDO(1, "First Edit!");
//		PlanDO plan = new PlanDO(1, "First Plan!");
//		ProofReadDO proofRead = new ProofReadDO(1, "First ProofRead!");
//		ReviseDO revise = new ReviseDO(1, "First Revise!");
//		ShapeDO shape = new ShapeDO(1, "First Shape!");
		CharacterArch CharacterArchObject = new CharacterArchImpl("Side Chick","Mexico", "Fame");
		



		//add to db
		session.save(CharacterArchObject);

		//		//remove from db
//		session.delete(CharacterArchObject);
		
		
		session.getTransaction().commit();
	}

}
