package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.model.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

	@Query(value = "SELECT e FROM EmployeeDetails e WHERE comp_id = ?1")
	List<EmployeeDetails> findCompanybyId(int id);
	
	
}




