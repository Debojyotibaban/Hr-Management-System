package com.pcsgpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcsgpl.entity.PgQualification;
import com.pcsgpl.entity.PgSpecialization;
import com.pcsgpl.entity.PgUniversity;
import com.pcsgpl.entity.UgQualification;
import com.pcsgpl.entity.UgSpecialization;
import com.pcsgpl.entity.UgUniversity;
import com.pcsgpl.repository.PgQualificationRepository;
import com.pcsgpl.repository.PgSpecializationRepository;
import com.pcsgpl.repository.PgUniversityRepository;
import com.pcsgpl.repository.UgQualificationRepository;
import com.pcsgpl.repository.UgSpecializationRepository;
import com.pcsgpl.repository.UgUniversityRepository;

@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/qualification")
	public class EmployeeEducationDropdownController {
		
		@Autowired
		private UgQualificationRepository ugQualification;
		@Autowired
		private UgSpecializationRepository ugSpecialization;
		@Autowired
		private UgUniversityRepository ugUniversity;
		@Autowired
		private PgQualificationRepository pgQualification;
		@Autowired
		private PgSpecializationRepository pgSpecialization;
		@Autowired
		private PgUniversityRepository pgUniversity;
		
		@GetMapping("/ugQualification")
		public List<UgQualification> getAllUgQualification(){
			return ugQualification.findAll();
		}
		
		@GetMapping("/ugSpecialization")
		public List<UgSpecialization> getAllUgSpecialization(){
			return ugSpecialization.findAll();
		}
		
		@GetMapping("/ugUniversity")
		public List<UgUniversity> getAllUgUniversity(){
			return ugUniversity.findAll();
		}
		
		@GetMapping("/pgQualification")
		public List<PgQualification> getAllPgQualification(){
			return pgQualification.findAll();
		}
		
		@GetMapping("/pgSpecialization")
		public List<PgSpecialization> getAllPgSpecialization(){
			return pgSpecialization.findAll();
		}
		
		@GetMapping("/pgUniversity")
		public List<PgUniversity> getAllPgUniversity(){
			return pgUniversity.findAll();
		}

	}

