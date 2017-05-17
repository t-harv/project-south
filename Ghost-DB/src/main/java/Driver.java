import org.hibernate.Session;

import ghost.domain.draft.DraftDO;
import ghost.domain.hibernate.HibernateUtil;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DraftDO draft = new DraftDO(34, "First Draft!");


		session.save(draft);
		session.getTransaction().commit();
	}

}
