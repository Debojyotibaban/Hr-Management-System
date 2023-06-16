package com.pcsgpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcsgpl.entity.UserRole;
import com.pcsgpl.repository.UserRoleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/role")
public class UserRoleController {
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@GetMapping("/roles")
	public List<UserRole> getAllRoles(){
		return userRoleRepository.findAll();
	}

}