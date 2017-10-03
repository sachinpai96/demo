package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.model.Company;
import com.springboot.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository cmprepository;
	
	public List<Company> getCompany() {		
		return cmprepository.findAll();

	}	
	public Company getCompanybyId( @PathVariable("id") int id) {
		return cmprepository.findOne(id);

	}
	public List<Company> createcmp(@RequestBody Company cmp) {
		cmprepository.save(cmp);
		return cmprepository.findAll();
		
	}
	
	public List<Company> updatecmp(@RequestBody Company cmp, @PathVariable("id") int id) {
		cmprepository.save(cmp);
		return cmprepository.findAll();	

	}
	public List<Company> deletecmp(@PathVariable("id") int id) {
		cmprepository.delete(id);
		return cmprepository.findAll();
	}
	public List<Company> findCompanybyId(@PathVariable("id") int id) {
		
		return cmprepository.findCompanybyId(id);
	}
	
	
}

