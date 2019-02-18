package ghost.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.ghost.domainobject.ICharacterProfile;

import ghost.domain.hibernate.HibernateUtil;

public class HiberDriver {
	private String mapping;
	
	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}

	public HiberDriver() {
	}
	
	public HiberDriver(String mapping) {
		this.mapping = mapping;
	}
	
	public void remove(ICharacterProfile object) {
		
	}
	/*
	 * Notes - can i pass in any ICharacterProfile sub object and this class know what the specific class is without any extra information?
	 */
	/**
	 * 
	 * @param object
	 */
	public void add(ICharacterProfile object) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		System.out.println(object.getClass().toString());
		
		
		session.getTransaction().commit();
		session.close();		
	}
	
	public void update(ICharacterProfile object) {
		
	}
	
	public ICharacterProfile get(String name) {
		return null;
		
	}
	
	public List<ICharacterProfile> getAll() {
		return null;
		
	}

}
