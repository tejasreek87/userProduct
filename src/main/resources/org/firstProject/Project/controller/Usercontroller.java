import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class Usercontroller
{
	public Usercontroller() 
	{
		System.out.println(this.getClass().getSimpleName()+"created....");
	}
	
     @Autowired
     private UserService service;
     @RequestMapping(value = "/index.jsp", method = RequestMethod.POST)
     public ModelAndView uderDetailsUpdate(UserDTO dto)
     {
    	 String message=service.userserviceMethod(dto);
    	  if(message!=null)
    	  {
    	 return new ModelAndview("Product.jsp","msg","message");
    	  }
    	  else
    	  {
    		  return new ModelAndView("index.jsp","msg","details not entered sucessfully");
    	  }
    	 
     }
}
