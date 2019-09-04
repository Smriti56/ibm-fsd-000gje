package oneToOneBidirectional.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import oneToOneBidirectional.entity.Instructor;
import oneToOneBidirectional.entity.InstructorDetail;

public class Test {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
	
		Session session= factory.getCurrentSession();
		
		
/*		Instructor instructor=new Instructor("Rohit","Verma","rohit@g.com");
		InstructorDetail id= new InstructorDetail("www.youtube.com/rohit","Guitar");
		instructor.setInstructorDetail(id);
		session.beginTransaction();
		session.save(instructor);
		session.getTransaction().commit();
		System.out.println("Done");
		
		*/
		
		
		/*
		int i=3;
		session.beginTransaction();
		InstructorDetail id=session.get(InstructorDetail.class, i);
		System.out.println(id.getHobby());
		//session.delete(id);
		
		
		int iD=1;
		Instructor it=session.get(Instructor.class, iD);
		session.delete(it);
		session.getTransaction().commit();
		System.out.println("Deleted");
		*/
		
		String name="Rahul";
		session.beginTransaction();
		Instructor id= session.get(Instructor.class, name);
		System.out.println(id.getLastname());
		
		
		
	}

}
