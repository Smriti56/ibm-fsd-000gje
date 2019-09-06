package comm.example.controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import comm.example.model.Student;
import comm.example.model.StudentConfig;
import comm.example.model.StudentDao;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/form")
	public String viewform(Model theModel)
	{
		Student student= new Student();
		theModel.addAttribute("student", student);
		theModel.addAttribute("student1", student);
		return "Student-form";
	}

	@PostMapping("/processform")
	public String processform(@ModelAttribute("student") Student theStudent,Model theModel) throws SQLException
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao emp=context.getBean("stud",StudentDao.class);
		emp.createEmployee(theStudent);
		List<Student> studentList=emp.getAllEmployee();
		
		theModel.addAttribute("studentList", studentList);
		return "display";
	}
	@RequestMapping("/list")
	public String list(Model theModel) throws SQLException
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao emp=context.getBean("stud",StudentDao.class);
		List<Student> studentList=emp.getAllEmployee();
		theModel.addAttribute("studentList", studentList);
		return "displayList";
	}
	
	@RequestMapping("/search")
	public String delete(@ModelAttribute("student1") Student theStudent1,Model theModel) throws SQLException
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao emp=context.getBean("stud",StudentDao.class);
		List<Student> stulist=emp.searchEmployee(theStudent1.getValue(),theStudent1.getType());
		theModel.addAttribute("Details", stulist);
		return "displayStudent";
	}
}
