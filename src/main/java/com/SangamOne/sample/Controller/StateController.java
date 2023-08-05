package com.SangamOne.sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.sample.Entity.States;
import com.SangamOne.sample.repository.StateRepo;

@RestController
@RequestMapping(value="/states")
public class StateController {

	@Autowired
	StateRepo stateRepo;


	@PostMapping("/addStates")
	public String addStudent1(@RequestBody States states  ) {
		stateRepo.save(states);
		return "Inserted";
	}

	@GetMapping("/viewStates")
	public List<States> getAllStudents() {
		return stateRepo.findAll();		
	}
}
