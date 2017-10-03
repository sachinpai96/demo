
package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@Column(name = "comp_Id")
	private int comp_Id;
	@Column(name = "comp_Name")
	private String comp_Name;

	public Company() {
	}

	public Company(int comp_Id, String comp_Name) {
		super();
		this.comp_Id = comp_Id;
		this.comp_Name = comp_Name;
	}

	public int getComp_Id() {
		return comp_Id;
	}

	public void setComp_Id(int comp_Id) {
		this.comp_Id = comp_Id;
	}

	public String getComp_Name() {
		return comp_Name;
	}

	public void setComp_Name(String comp_Name) {
		this.comp_Name = comp_Name;
	}

}
