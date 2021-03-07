package com.unsplash.AravindanAssignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionCoverPhoto {
	
	@JsonProperty("urls")
	public CollectionUrls collectionUrl;

	public CollectionUrls getCollectionUrl() {
		return collectionUrl;
	}

	public void setCollectionUrl(CollectionUrls collectionUrl) {
		this.collectionUrl = collectionUrl;
	}
		
	

}
