package org.firstProject.Project.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="user")
public class UserDTO implements Serializable
{
	public UserDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"Created...");
	}
	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	@Column(name="u_id")
	private int id;
	@Column(name="u_Username")
	private String username;
	@Column(name="u_Email")
	private String email;
	@column(name="u_MobileNumber")
	private long mnumber;
	
	
	
}
