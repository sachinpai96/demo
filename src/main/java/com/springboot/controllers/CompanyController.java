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

import com.springboot.model.Company;
import com.springboot.service.CompanyService;

@RestController
@RequestMapping(value = "SpringBootEmployee2/employees")
public class CompanyController {
	@Autowired
	CompanyService CompanyService;

	@GetMapping
	public List<Company> getCompany() {
		return CompanyService.getCompany();
	}	
	@GetMapping(value="{id}")
	public Company getCompanybyId( @PathVariable("id") int id) {
		return CompanyService.getCompanybyId(id);
	}
	@PostMapping
	public List<Company> createEmployee(@RequestBody Company user) {
		return CompanyService.createcmp(user);
		
	}
	@PutMapping(value = "{id}")
	public List<Company> updateEmployee(@RequestBody Company user, @PathVariable("id") int id) {
		return CompanyService.updatecmp(user,id);		
	}
	@DeleteMapping(value = "{id}")
	public List<Company> deleteCompany(@PathVariable("id") int id) {
		return CompanyService.deletecmp(id);
	}
	
	@GetMapping(value="getcompanyby/{id}")
	public List<Company> findCompanybyId(@PathVariable("id") int id) {
		return CompanyService.findCompanybyId(id);
	}
}
