package com.pcsgpl.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcsgpl.dto.OfficeDetailsDto;
import com.pcsgpl.entity.OfficeDetails;
import com.pcsgpl.service.OfficeDetailsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path="/api/employee")
public class OfficeDetailsController {
	@Autowired
	private OfficeDetailsService officeDetailsService;
	
	@PostMapping(path="/save")
	public OfficeDetails saveOfficeDetails(@RequestBody OfficeDetails officeDetails) {
		 //DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		log.debug("saveOfficeDetails in controller");
		return officeDetailsService.saveEmployeeOfficeDetails(officeDetails);
	}
	
	@PutMapping(path="/edit/{userId}")
	public String updateOfficeDetails(@RequestBody OfficeDetailsDto officeDetailsDto, @PathVariable(name="userId") Integer userId) {
		log.debug("updateOfficeDetails in controller");
		return officeDetailsService.updateEmployeeOfficeDetails(officeDetailsDto, userId);
	}
	
	@GetMapping(path="/view")
	public List<OfficeDetails> getEmployees(){
		return officeDetailsService.fetchEmployees();
	}
	
	@GetMapping(path="/viewemployee/{userId}")
	public OfficeDetails findByEmployeeId(@PathVariable(name="userId") Integer userId) {
		return officeDetailsService.fetchByEmployeeId(userId);
	}

}
