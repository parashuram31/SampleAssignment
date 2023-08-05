package com.SangamOne.sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.sample.Entity.Holidays;
import com.SangamOne.sample.repository.HolidaysRepo;

@RestController
@RequestMapping(value="/holidays")
public class HolidaysController {

	@Autowired
	HolidaysRepo holidaysRepo;


	@PostMapping("/addHolidays")
	public String addStudent1(@RequestBody Holidays holidays  ) {
		holidaysRepo.save(holidays);
		return "Inserted";
	}

	@GetMapping("/viewHolidays")
	public List<Holidays> getAllStudents() {
		return holidaysRepo.findAll();		
	}
}
