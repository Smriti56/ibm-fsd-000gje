package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.beans.container.internal.CdiBasedBeanContainer;

import Application.CD;
import Application.InternationalCD;
import Application.SpecialEditionCD;


public class Inter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doProcess(request, response);
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			doProcess(request, response);
		}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int region=Integer.parseInt(request.getParameter("region"));
			String lang=request.getParameter("lang");
			
			HttpSession session1=request.getSession();
			
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
			addAnnotatedClass(CdiBasedBeanContainer.class).addAnnotatedClass(InternationalCD.class).
			addAnnotatedClass(SpecialEditionCD.class).buildSessionFactory();
			
			Session session=factory.openSession();
			session.getTransaction().begin();
			CD cd= (CD) session1.getAttribute("SE");
			InternationalCD icd = new InternationalCD(cd.getTitle(),cd.getArtist(),new Date(),cd.getCost(),lang,region);
			session.save(icd);
			
			session.getTransaction().commit();
			System.out.println("success inter");
			
			
			
		}

}
