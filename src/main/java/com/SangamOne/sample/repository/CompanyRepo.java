package com.SangamOne.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.sample.Entity.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
