package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@Autowired
	StudentDAO dao;

	@RequestMapping("/")
	public String getHome()
	{

		return "welcome to spring boot! its break time";
	}
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student theStudent)
	{
		Student st=dao.createNewStudent(theStudent);
		return st;
	}
	
	
	@GetMapping("/student")
	public List<Student> getStudents(@RequestBody Student theStudent)
	{
		List<Student> studentlist=dao.getAllStudent();
		return studentlist;
	}
	
	@Transactional
	@DeleteMapping("/student/{id}")
	public Student deleteStudents(@PathVariable int id)
	{
		Student student=dao.getStudentById(id);
		dao.deleteStudent(student);
		return student;
	}
	
	@Transactional
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student theStudent)
	{
		dao.updateStudent(theStudent);
		return theStudent;
	}
	
}
