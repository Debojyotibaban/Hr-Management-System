package com.pcsgpl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcsgpl.entity.EmployeePersonalDetails;
import com.pcsgpl.repository.EmployeePersonalDetailsRepository;

@Service
public class EmployeePersonalDetailsService {
	@Autowired
	private EmployeePersonalDetailsRepository Repository;

	public List<EmployeePersonalDetails> getAllEmployeePesonalDetails() {
		return Repository.findAll();
		
	}

	public EmployeePersonalDetails savePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
		// TODO Auto-generated method stub
		return Repository.save(employeePersonalDetails);
	}

	public EmployeePersonalDetails updatePersonalDetailsById(EmployeePersonalDetails employeePersonalDetails) {
		// TODO Auto-generated method stub
		
		return Repository.save(employeePersonalDetails);
		
	}

	public void deleteEmployeePersonalDetailsById(int employee_id) {
		
		Repository.deleteById(employee_id); 
	}


}
