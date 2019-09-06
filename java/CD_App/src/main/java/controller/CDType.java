package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Application.CD;
import Application.SpecialEditionCD;


public class CDType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title=request.getParameter("title");
		String artist=request.getParameter("artist");
		double cost=Double.parseDouble(request.getParameter("cost"));
		String cdtype=request.getParameter("cdtype");
		
		HttpSession session= request.getSession();
		session.setAttribute("SE", new CD(title,artist,new Date(),cost));
		
		if(cdtype.equals("special_edition_cd"))
		{
			
			RequestDispatcher view=request.getRequestDispatcher("special.jsp");
			view.include(request, response);
			
			
		}
		if(cdtype.equals("international_cd"))
		{
			RequestDispatcher view=request.getRequestDispatcher("international.jsp");
			view.include(request, response);
		}
	}

}