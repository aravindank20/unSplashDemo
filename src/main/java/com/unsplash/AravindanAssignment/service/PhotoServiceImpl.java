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
import com.unsplash.AravindanAssignment.model.Photo;

@Service
@Component("photoService")
public class PhotoServiceImpl implements FactoryService{


	@Autowired
	ConnectionManager connectionManager;
	public List<Photo> getList() {
		// TODO Auto-generated method stub
		List<Photo> photoList = new ArrayList<>();
		String response = connectionManager.callUnsplash("photos");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			photoList = mapper.readValue(response, new TypeReference<List<Photo>>() {});			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return photoList;
	}
	
	@Override
	public String addToList(String collection_id, String photo_id) {
		String response = null;
		response = connectionManager.addPhotoToCollection(collection_id, photo_id);
		return response;
	}

	
}
