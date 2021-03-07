package com.unsplash.AravindanAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unsplash.AravindanAssignment.service.FactoryService;

@RestController
public class ActionRestController {
	
	@Autowired
	FactoryService photoService;
	
	@Autowired
	FactoryService collectionsService;	
	
	@PostMapping(
			  value = "/collections", produces = "application/json")
	public String collectionCreate(@RequestParam String title, @RequestParam String description) {
	    String response = null;
	    response = collectionsService.addToList(title, description);
		return response;
	}
	
	@PostMapping(
			  value = "/collections/{id}/add", produces = "application/json")
	public String addPhotosToCollection(@RequestParam String collection_id, @RequestParam String photo_id, @PathVariable String id) {
		String response = "Not added / already added in collections";
	    response = photoService.addToList(collection_id, photo_id);
		return response;
	}

}
