package com.SangamOne.sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.sample.Entity.Company;
import com.SangamOne.sample.repository.CompanyRepo;

@RestController
@RequestMapping(value="/company")
public class CompanyController {
	
	@Autowired
	CompanyRepo companyRepo;


	@PostMapping("/addCompany")
	public String addStudent1(@RequestBody Company company ) {
		companyRepo.save(company);
		return "Inserted";
	}

	@GetMapping("/viewCompany")
	public List<Company> getAllStudents() {
		return companyRepo.findAll();		
	}
}
