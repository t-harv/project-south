package com.ghost.writing.character.domainobject.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CharacterProfileImplHibernateTest {
	
	
	public static void main(String[] args){
		CharacterProfileDataObjects jala = new CharacterProfileDataObjects();

		try{
			
//			System.out.println(((CharacterProfileImpl)jala.getJala()).getOtherAddresses().size());
			
//			Configuration configuration = new Configuration();
//			configuration.addAnnotatedClass(CharacterArchImpl.class);
//			SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			try{
				session.beginTransaction();
				session.save(jala.getJala());
				session.getTransaction().commit();
			} catch(Exception ex){
				session.getTransaction().rollback();
				ex.printStackTrace();
			}
		}catch(Exception ex){
			ex.printStackTrace();

		}
		System.out.println("BOOSH!");
	}
}
