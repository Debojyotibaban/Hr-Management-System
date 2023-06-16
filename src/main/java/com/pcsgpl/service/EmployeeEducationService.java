package com.pcsgpl.service;


import java.util.List;

import com.pcsgpl.entity.EmployeeEducation;

public interface EmployeeEducationService {

	public String insertEmployeeEducationDetails(EmployeeEducation education);
	
	public List<EmployeeEducation> getAllEmployeeEducation();
	
	public String updateEmployeeEducationById(Integer id,EmployeeEducation education);
	
}
