package com.unsplash.AravindanAssignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unsplash.AravindanAssignment.model.Collection;
import com.unsplash.AravindanAssignment.model.Photo;
import com.unsplash.AravindanAssignment.service.FactoryService;

@Controller
public class ActionController {
	
	@Autowired
	FactoryService photoService;
	
	@Autowired
	FactoryService collectionsService;
	
	
	@RequestMapping(value="/photos", method = RequestMethod.GET)
	public String photoList(ModelMap model) {
		List<Photo> photoList = new ArrayList<>();
		photoList = photoService.getList();
		model.put("photoList", photoList);
		return "listPhotos";
	}
	
	@RequestMapping(value="/collections", method = RequestMethod.GET)
	public String collectionsList(ModelMap model) {
		List<Collection> collectionList = new ArrayList<>();
		collectionList = collectionsService.getList();
		model.put("collectionList", collectionList);
		return "listCollections";
	}		

}
