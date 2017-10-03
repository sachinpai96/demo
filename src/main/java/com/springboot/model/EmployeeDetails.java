package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeDetails {
	@Id
	@Column(name="emp_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emp_Id;
	@Column(name="emp_Name")
	private String emp_Name;
	@ManyToOne
	@JoinColumn(name="comp_Id")
	private Company company;
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
}	
	
	
	
	
	
	
	
	
	
	


