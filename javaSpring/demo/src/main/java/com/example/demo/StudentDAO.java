package com.example.demo;

import java.util.List;

public interface StudentDAO {
	
	public Student createNewStudent(Student theStudent);

	public List<Student> getAllStudent();

	public Student getStudentById(int id);

	public void deleteStudent(Student student);

	public Student updateStudent(Student student);

}
