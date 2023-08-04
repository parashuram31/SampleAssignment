package com.SangamOne.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.sample.Entity.States;

public interface StateRepo extends JpaRepository<States, Integer>{

}
