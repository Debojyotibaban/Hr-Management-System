package com.pcsgpl.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

import com.pcsgpl.entity.EmployeeEducation;
import com.pcsgpl.repository.EmployeeEducationRepository;

@Service
public class EmployeeEducationServuiceImp implements EmployeeEducationService{

	public static Logger logger=LoggerFactory.getLogger(EmployeeEducationService.class);
	
	@Autowired
	private EmployeeEducationRepository educationRepository;
	
	public String insertEmployeeEducationDetails(EmployeeEducation education) {
		
		
		//EmployeeEducation exitEmp=educationRepository.findById(education.getEmployeeId()).orElse(null);
		
		
			
			educationRepository.save(education);
			return "Employee Education Details Added Successfully";
			
			//throw new EmployeeEducationAlreadyException("Employee Education Details Already Exist");
		
	}
	
	public  List<EmployeeEducation> getAllEmployeeEducation(){
		return educationRepository.findAll();
	}

	public String updateEmployeeEducationById(Integer id,EmployeeEducation education) {
		// TODO Auto-generated method stub
		HttpHeaders headers=new HttpHeaders();
		
		EmployeeEducation existEmp=educationRepository.findById(id).orElse(null);
		if(existEmp!=null) {
			//existEmp.setEmployeeId(education.getEmployeeId());
			existEmp.setUgQualification(education.getUgQualification());
			existEmp.setUgSpecialization(education.getUgSpecialization());
			existEmp.setUgUniversity(education.getUgUniversity());
			existEmp.setUgYearOfPassout(education.getUgYearOfPassout());
			existEmp.setPgQualification(education.getPgQualification());
			existEmp.setPgSpecialization(education.getPgSpecialization());
			existEmp.setPgUniversity(education.getPgUniversity());
			existEmp.setPgYearOfPassout(education.getPgYearOfPassout());
			
//			existEmp.setUgQual(education.getUgQual());
//			existEmp.setUniversity(education.getUniversity());
//			existEmp.setSpecialization(education.getSpecialization());
//			
//			existEmp.setPgQualification2(education.getPgQualification2());
//			existEmp.setPgSpecialization2(education.getPgSpecialization2());
//			existEmp.setPgUniversity2(education.getPgUniversity2());
			
			educationRepository.save(existEmp);
			return "Employee Education Details updated successfully "+HttpStatus.OK;
		}else {
			return "Employee Id doesn't exist "+HttpStatus.NOT_FOUND;
		}
	}


}
