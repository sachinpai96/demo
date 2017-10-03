package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.model.EmployeeDetails;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService  {

	@Autowired
	EmployeeRepository emprepository;
	
	public List<EmployeeDetails> getEmployee() {		
		return emprepository.findAll();

	}	
	public EmployeeDetails getEmployeebyId( @PathVariable("id") int id) {
		return emprepository.findOne(id);

	}
	public List<EmployeeDetails> createemp(@RequestBody EmployeeDetails emp) {
		emprepository.save(emp);
		return emprepository.findAll();
		
	}
	
	public List<EmployeeDetails> updateemp(@RequestBody EmployeeDetails emp, @PathVariable("id") int uid) {
		emprepository.save(emp);
		return emprepository.findAll();	

	}
	public List<EmployeeDetails> deleteemp(@PathVariable("id") int id) {
		emprepository.delete(id);
		return emprepository.findAll();
	}
	public List<EmployeeDetails> findCompanybyId(@PathVariable("id") int id) {
		return emprepository.findCompanybyId(id);
	}
}

