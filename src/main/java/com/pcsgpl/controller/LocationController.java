package com.pcsgpl.controller;


	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.pcsgpl.entity.Location;

import com.pcsgpl.repository.Location_Repository;

	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/location")
	public class LocationController {
		
		@Autowired
		private Location_Repository locationRepository;

		@GetMapping("/locations")
		public List<Location> getAllLocations(){
			return locationRepository.findAll();
		}
	}


