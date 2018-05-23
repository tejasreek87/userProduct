package org.firstProject.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
	public UserService() 
	{
		System.out.println(this.getClass().getSimpleName()+"created...");
	}
	
	@Autowired
	private UserDAO dao;
	String message=null;
	 public String userserviceMethod(UserDTO dto)
	 {
		 dao.save(dto);
		 message=" user details entered sucessfully..."
	 }

}
