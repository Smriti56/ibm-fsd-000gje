package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAOImpl implements StudentDAO {
	

	private EntityManager em;
	private Session session;
	@Autowired
	public StudentDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
	



	@Override
	public Student createNewStudent(Student theStudent) {
		session=em.unwrap(Session.class);
		session.save(theStudent);
		return theStudent;
	}




	@Override
	public List<Student> getAllStudent() {
		session=em.unwrap(Session.class);
		Query query=session.createQuery("from Student",Student.class);
		List<Student> theStudent=query.getResultList();
		return theStudent;
	}




	@Override
	public Student getStudentById(int id) {
		session=em.unwrap(Session.class);
		Student st=session.get(Student.class, id);
		return st;
	}




	@Override
	public void deleteStudent(Student student) {
		this.session=em.unwrap(Session.class);
		System.out.println(student);
		session.delete(student);
	}




	@Override
	public Student updateStudent(Student student) {
		session=em.unwrap(Session.class);
		session.merge(student);
		return student;
	}
	
	

}
