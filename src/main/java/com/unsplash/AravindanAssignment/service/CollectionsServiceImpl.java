package com.unsplash.AravindanAssignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unsplash.AravindanAssignment.connection.ConnectionManager;
import com.unsplash.AravindanAssignment.model.Collection;

@Service
@Component("collectionsService")
public class CollectionsServiceImpl implements FactoryService{


	@Autowired
	ConnectionManager connectionManager;
	
	public List<Collection> getList() {
		// TODO Auto-generated method stub
		List<Collection> collectionList = new ArrayList<>();
		String response = connectionManager.callUnsplash("collections");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			collectionList = mapper.readValue(response, new TypeReference<List<Collection>>() {});
			//photoList.forEach(x -> System.out.println(x.getPhotoId()));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return collectionList;
	}
	
	public String addToList(String title, String description) {
		String response = null;
		response = connectionManager.createCollection(title, description);
		return response;
	}

	
}
