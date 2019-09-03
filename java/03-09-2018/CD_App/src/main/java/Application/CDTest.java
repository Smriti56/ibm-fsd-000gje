package Application;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.beans.container.internal.CdiBasedBeanContainer;

public class CDTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
					addAnnotatedClass(CdiBasedBeanContainer.class).addAnnotatedClass(InternationalCD.class).
					addAnnotatedClass(SpecialEditionCD.class).buildSessionFactory();
			Session session=factory.openSession();
			CD cd = new CD("Grace Under Pressure", "Rush", new Date(), 9.99);
			SpecialEditionCD secd = new SpecialEditionCD("Grace Under Pressure", "Rush", new Date(), 9.99,
					"Widescreen");
			InternationalCD icd = new InternationalCD("Grace Under Pressure", "Rush", new Date(), 9.99, "Spanish", 4);
			session.getTransaction().begin();
			session.save(cd);
			session.save(secd);
			session.save(icd);
			session.getTransaction().commit();
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}