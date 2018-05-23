package org.firstProject.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	public ProductService() 
	{
		System.out.println(this.getClass().getSimpleName()+"created...");
	}
	
	@Autowired
	private ProductDAO dao;
	String message=null;
	 public String userserviceMethod(ProductDTO dto)
	 {
		 dao.save(dto);
		 message=" Product details entered sucessfully..."
	 }


}
