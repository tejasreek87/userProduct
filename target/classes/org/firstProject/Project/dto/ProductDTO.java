package org.firstProject.Project.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product")
public class ProductDTO implements Serializable
{
	public ProductDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created..");
	}
	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	@Column(name="p_id")
	private int id;
	@Column(name="p_product type")
	private String ptype;
	@Column(name="p_product name")
	private String pname;

}
