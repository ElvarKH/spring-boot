package com.company.social.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.social.models.Location;
import com.company.social.services.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.findAll();
	}

	@GetMapping("/locations/{id}")
	public Optional<Location> getLocationById(@PathVariable Integer id) {
		return locationService.findById(id);
	}
	
	@PostMapping("/locations")
	public void addLocation(@RequestBody Location location) {
	    locationService.addLocation(location);
	}
	
	@PutMapping("/locations/{id}")
	public void updateLocation(@RequestBody Location location, @PathVariable Integer id) {
	    locationService.updateLocation(location);
	}
	
	@DeleteMapping("/locations/{id}")
	public void deleteLocation(@PathVariable Integer id) {
	     locationService.deleteLocation(id);
	}
}
