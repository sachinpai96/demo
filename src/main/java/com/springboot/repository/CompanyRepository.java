
package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.model.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer>  {
	/*CompanyRepository company = CompanyRepository.company;
	JPQLQuery query = new HibernateQuery (session);
	Company Synerzip = query.from(company)
	  .where(company.comp_Name.eq("Synerzip"))
	  .uniqueResult(company); */
	
	@Query(value = "SELECT c FROM Company c WHERE comp_id = ?1")
	   List<Company> findCompanybyId(int comp_id);
}







