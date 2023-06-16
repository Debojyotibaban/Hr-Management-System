package com.pcsgpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcsgpl.entity.EmployeeEducation;
import com.pcsgpl.repository.EmployeeEducationRepository;
import com.pcsgpl.service.EmployeeEducationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeEducationController  {

	@Autowired
	private EmployeeEducationService educationService;
	
	@Autowired
	private EmployeeEducationRepository educationRepository;
	

	
	@GetMapping("/education")
	public List<EmployeeEducation> getAllEmployee(){
		return educationService.getAllEmployeeEducation();
	}
	
	@PostMapping("/education")
	public String addEmployeeEducation(@RequestBody EmployeeEducation education) {
		return educationService.insertEmployeeEducationDetails(education);
	}
	
	
	@GetMapping("/education/{userId}")
	public ResponseEntity<?> getByEmployeeId(@PathVariable("userId") Integer userId ) {
	
		HttpHeaders headers= new HttpHeaders();
		
		if(educationRepository.findById(userId).isPresent()) {
			headers.add("Project-Name","Employee Education Details");
			return new ResponseEntity<EmployeeEducation>(educationRepository.findById(userId).get(),headers,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Employee Id doesn't exist..try agaian",headers,HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/education/{userId}")
	public String updateEmployeeEducation(@PathVariable("userId") Integer userId,@RequestBody EmployeeEducation education) {
		return educationService.updateEmployeeEducationById(userId,education);
	}

	@DeleteMapping("/education/{userId}")
	public ResponseEntity<?> deleteEmployeeEducationById(@PathVariable("userId")Integer userId) {
		HttpHeaders headers=new HttpHeaders();
		EmployeeEducation education=educationRepository.findById(userId).orElse(null);
		if(education!=null) {
			headers.add("project-name","Employee Eduction Details");
			educationRepository.deleteById(userId);
			return new ResponseEntity<String>("Employee Education Details Deteleted Successfully",headers,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Employee Id doesn't exist",headers,HttpStatus.NOT_FOUND);
		}
	}
}