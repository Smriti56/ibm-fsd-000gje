package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/add.view" }, 
		initParams = { 
				@WebInitParam(name = "Country", value = "India,UK,Australia,China,America")
		})
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String sList;	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		sList=config.getInitParameter("Country");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		

		@SuppressWarnings("unchecked")
		List<String> err=(List<String>) request.getAttribute("ERROR");
		if(err!=null)
		{
			for(String s:err)
			{
				out.println("<font color='red'>"+s+"</font><br/>");
			}
		}
		
		
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Add Employee</title>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>Add New Employee</h1>\r\n" + 
				"<form name=\"Details\" id=\"form-1\" method=\"post\" action=\"controller.view\">\r\n" + 
				"\r\n" + 
				"  <div class=\"form-group row\">\r\n" + 
				"    <label for=\"colFormLabelLg\" class=\"col-sm-2 col-form-label col-form-label-lg\">Name</label>\r\n" + 
				"    <div class=\"col-sm-10\">\r\n" + 
				"      <input type=\"text\" class=\"form-control\" id=\"colFormLabel\" name=\"name\">\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"form-group row\">\r\n" + 
				"    <label for=\"colFormLabelLg\" class=\"col-sm-2 col-form-label col-form-label-lg\">Email</label>\r\n" + 
				"    <div class=\"col-sm-10\">\r\n" + 
				"      <input type=\"email\" class=\"form-control\" id=\"colFormLabel\" name=\"email\">\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"form-group row\">\r\n" + 
				"    <label for=\"colFormLabelLg\" class=\"col-sm-2 col-form-label col-form-label-lg\">Password</label>\r\n" + 
				"    <div class=\"col-sm-10\">\r\n" + 
				"      <input type=\"password\" class=\"form-control\" id=\"colFormLabel\" name=\"password\" >\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"  \r\n" + 
				"  <div class=\"form-group row\">\r\n" + 
				"  <label for=\"colFormLabelLg\" class=\"col-sm-2 col-form-label col-form-label-lg\">Country</label>\r\n" + 
				"\r\n" + 
				"<div class=\"col-sm-10\">\r\n" + 
				"     <select id=\"inputState\" class=\"form-control\" id=\"colFormLabel\" name=\"country\">\r\n" + 
				"        <option value=\"unknown\">Select</option>\r\n" + 
				"        <option value=\"India\">India</option>\r\n" + 
				"        <option value=\"UK\">UK</option>\r\n" + 
				"        <option value=\"China\">China</option>\r\n" + 
				"        <option value=\"America\">America</option>\r\n" + 
				"      </select>\r\n" + 
				"    </div>\r\n" + 
				"      \r\n" + 
				"    </div>\r\n" + 
				"  <button type=\"submit\" class=\"btn btn-primary\">Add</button>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
			
	}

}
