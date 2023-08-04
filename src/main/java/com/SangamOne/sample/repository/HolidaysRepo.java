package com.SangamOne.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.sample.Entity.Holidays;

public interface HolidaysRepo extends JpaRepository<Holidays, Integer>{

}
