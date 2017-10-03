package com.springboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.EmployeeDetails;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping(value = "SpringBootEmployee2/companies")
public class EmployeeController {
	ue = "{comp_Id}/employees/{id}")
	public List<EmployeeDetails> updateEmployee(@RequestBody EmployeeDetails user, @PathVariable("id") int id) {
		return employeeService.updateemp(user,id);		
	}
	@DeleteMapping(value = "{id}")
	public List<EmployeeDetails> deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteemp(id);
	}
	
	@GetMapping(value="{id}/getemployees/{id}")
	public List<EmployeeDetails> findCompanybyId(@PathVariable("id") int id) {
		return employeeService.findCompanybyId(id);
	}
}

