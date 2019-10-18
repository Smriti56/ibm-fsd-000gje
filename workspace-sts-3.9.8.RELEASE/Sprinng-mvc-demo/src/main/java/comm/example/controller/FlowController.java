package comm.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FlowController {
	
	@RequestMapping("/showform")
	public String returnForm()
	{
		return "stu-form";
	}
	
	@RequestMapping("/view")
	public String displayPage()
	{
		return "display";
	}
	
	@RequestMapping("/viewOne")
	public String displayPageOne(HttpServletRequest req,Model theModel)
	{
		Student st=new Student(req.getParameter("firstname"),req.getParameter("lastname"),req.getParameter("email"));
		theModel.addAttribute("StudentDetails", st);
		return "display";
	}
	
//	@RequestMapping("/viewTwo")
//	public String displayPageTwo(@RequestParam("firstname") String param1,@RequestParam("lastname") String param2,@RequestParam("email") String param3,Model theModel)
//	{
//		Student st= new Student(param1,param2,param3);
//		theModel.addAttribute("StudentDetails", st);
//		return "display";
//	}

}
