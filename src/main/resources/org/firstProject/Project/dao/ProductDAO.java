package org.firstProjct.Project.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO 
{
	public ProductDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created...");
	}
	
	@Autowired
	private SessionFactory factory;
	 Public void save(ProductDTO dto)
	 {
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 session.save(dto);
		 tx.commit();
		 session.close();
		 
	 }

}
