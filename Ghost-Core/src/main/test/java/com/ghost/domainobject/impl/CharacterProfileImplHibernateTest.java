package com.ghost.domainobject.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CharacterProfileImplHibernateTest {
	
	
	public static void main(String[] args){
		CharacterProfileDataObjects jala;

		try{
			
//			System.out.println(((CharacterProfileImpl)jala.getJala()).getOtherAddresses().size());
			
//			Configuration configuration = new Configuration();
//			configuration.addAnnotatedClass(CharacterArchImpl.class);
//			SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"beans.xml");
			BeanFactory factory = context;
			
			jala = (CharacterProfileDataObjects) factory.getBean("characterProfileDataObject");
			
			try{
				jala.initialize();
				session.beginTransaction();
				session.save(jala.getJala());
				session.getTransaction().commit();
			} catch(Exception ex){
				session.getTransaction().rollback();
				ex.printStackTrace();
			}
			session.close();
			
		}catch(Exception ex){
			ex.printStackTrace();

		}
		
		System.out.println("BOOSH!");
	}
}
