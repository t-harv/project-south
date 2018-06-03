package com.ghost.writing.character.domainobject.impl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CharacterProfileDependencyInjectionTest {


	public static void main(String[] args){
		try{    
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"beans.xml");
			BeanFactory factory = context;
			CharacterProfileDataObjects x = (CharacterProfileDataObjects) factory.getBean("characterProfileDataObject");
			x.initialize();
			System.out.println(((CharacterProfileImpl)x.getJala()).getFirstName());

		}catch(Exception ex){
			ex.printStackTrace();

		}
		System.out.println("BOOSH!");
	}
}
