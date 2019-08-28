package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;
import comm.example.service.*;
import comm.example.dao.*;



@WebServlet("/controller.view")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String ResultSet = null;
	
	private String name,email,password,country;
	private List<String> errMsgs;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		errMsgs=new LinkedList<String>();
		
		country=request.getParameter("country");

		
		name=request.getParameter("name");
	
		email=request.getParameter("email");
		
		
		password=request.getParameter("password");

		
		
		if(errMsgs.isEmpty())
		{
			EmployeeService service=new EmployeeServiceImpl();
			
			EmployeeDao serv=new EmployeeDaoImpl();
			
			Employee emp =new Employee(name,email,password,country);
			out.println(emp);
			serv.createEmployee(emp);
			request.setAttribute("SUCCESS", emp);
			RequestDispatcher  view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		else {
			
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view=request.getRequestDispatcher("/AddLeague.view");
			view.forward(request, response);
		}
		
	}

   

}
