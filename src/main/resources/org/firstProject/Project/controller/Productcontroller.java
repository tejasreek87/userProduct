package org.firstProject.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@controller
@RequestMapping("/")
public class Productcontroller 
{
	
public Productcontroller() 
{
	System.out.println(this.getClass().getSimpleName()+"created...");
}

@Autowired
private ProductService service;
@RequestMapping(value = "/Product.jsp", method = RequestMethod.POST)
public ModelAndView uderDetailsUpdate(ProductDTO dto)
{
	 String message=service.productserviceMethod(dto);
	  if(message!=null)
	  {
	 return new ModelAndview("Login.jsp","msg","message");
	  }
	  else
	  {
		  return new ModelAndView("Product.jsp","msg","details not entered sucessfully");
	  }
	 
}
}
