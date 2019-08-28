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
		
		out.println("<html><body>");
		
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>) request.getAttribute("ERROR");
		if(err!=null)
		{
			for(String s:err)
			{
				out.println("<font color='red'>"+s+"</font><br/>");
			}
		}
		
		out.println("<form action='controller.view' method='post'>");
		out.println("Name<input type='text' name='name'><br/>");
		out.println("Email<input type='text' name='email'><br/>");
		out.println("Password<input type='text' name='password'><br/>");
		out.println("Country");
		//String sList=getServletConfig().getInitParameter("season-list");
		String arrSList[]=sList.split(",");
		out.println("<select name='country'><option value='unknown'>Country</option>");
		for(String str:arrSList)
		{  
			out.println("<option value='"+str+"'"+">"+str+"</option>");
		}
		
		out.println("</select><br/><input type='submit' value='add'></form>");
		
		out.println("<br/><a href='login.view'>LIST</body></html>");
		
			
	}

}
