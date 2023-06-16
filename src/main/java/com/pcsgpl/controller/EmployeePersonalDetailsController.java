package com.pcsgpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.pcsgpl.entity.EmployeePersonalDetails;
import com.pcsgpl.service.EmployeePersonalDetailsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/emp")
public class EmployeePersonalDetailsController {
	@Autowired
	private EmployeePersonalDetailsService Service;

	@GetMapping("/personal")
	public List<EmployeePersonalDetails> getAllEmployeePesonalDetails() {
		System.out.println("inside get controller");
		return Service.getAllEmployeePesonalDetails();
	}
	
	@PostMapping("/personal")
	ResponseEntity<EmployeePersonalDetails>  savePersonalDetails(@RequestBody EmployeePersonalDetails employeePersonalDetails) {
		return new ResponseEntity <EmployeePersonalDetails> (Service.savePersonalDetails(employeePersonalDetails),HttpStatus.CREATED);
	}

	@PutMapping("/personal/{userId}")
	public EmployeePersonalDetails updatePersonalDetailsById(@PathVariable Integer userId,@RequestBody EmployeePersonalDetails employeePersonalDetails) {
		employeePersonalDetails.setUserId(userId);
      return  Service.updatePersonalDetailsById(employeePersonalDetails);
	}
	@DeleteMapping("/personal/{userId}")
	public void  deleteEmployeePersonalDetailsById(@PathVariable("userId") int userId) {
		
	       Service.deleteEmployeePersonalDetailsById(userId);
	       System.out.println("employee record deleted sucessfully");
		}
}


