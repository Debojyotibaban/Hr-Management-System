package com.pcsgpl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.pcsgpl.entity.EmployeeUserProfile;


public interface EmployeeUserProfileService {
	
	
	
    EmployeeUserProfile addEmployee(EmployeeUserProfile employee);
	
	public String removeEmployee(int userId);
	
	public Optional<EmployeeUserProfile> findEmpById(int userId);
	
    public List<EmployeeUserProfile> getAllEmployee();
	
	public String updateEmployee(EmployeeUserProfile employee, int userId);

}
