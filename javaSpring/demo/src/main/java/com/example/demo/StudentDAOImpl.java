package com.example.demo;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

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
@PostConstruct
public void init()
{
	session=em.unwrap(Session.class);
}



	@Override
	public Student createNewStudent(Student theStudent) {
		// TODO Auto-generated method stub
		return null;
	}

}
