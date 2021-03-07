package com.unsplash.AravindanAssignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Collection {
	
	@JsonProperty("id")
	public String collectionId;
	
	@JsonProperty("title")
	public String collectionTitle;
	
	@JsonProperty("cover_photo")
	public CollectionCoverPhoto collectionCoverPhoto;

	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public String getCollectionTitle() {
		return collectionTitle;
	}

	public void setCollectionTitle(String collectionTitle) {
		this.collectionTitle = collectionTitle;
	}

	public CollectionCoverPhoto getCollectionCoverPhoto() {
		return collectionCoverPhoto;
	}

	public void setCollectionCoverPhoto(CollectionCoverPhoto collectionCoverPhoto) {
		this.collectionCoverPhoto = collectionCoverPhoto;
	}

	

}
