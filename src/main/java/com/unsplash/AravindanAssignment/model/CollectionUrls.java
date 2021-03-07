package com.unsplash.AravindanAssignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionUrls {
	
	@JsonProperty("regular")
	public String collectionRegularUrl;
	
	@JsonProperty("thumb")
	public String collectionThumbUrl;

	public String getCollectionRegularUrl() {
		return collectionRegularUrl;
	}

	public void setCollectionRegularUrl(String collectionRegularUrl) {
		this.collectionRegularUrl = collectionRegularUrl;
	}

	public String getCollectionThumbUrl() {
		return collectionThumbUrl;
	}

	public void setCollectionThumbUrl(String collectionThumbUrl) {
		this.collectionThumbUrl = collectionThumbUrl;
	}

	

}
