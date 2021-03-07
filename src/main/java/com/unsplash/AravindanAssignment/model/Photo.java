package com.unsplash.AravindanAssignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Photo {
	
	@JsonProperty("id")
	public String photoId;
	
	@JsonProperty("description")
	public String photoDesc;
	
	@JsonProperty("alt_description")
	public String photoAltDesc;
	
	@JsonProperty("urls")
	public PhotoUrls photoUrls;

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getPhotoDesc() {
		return photoDesc;
	}

	public void setPhotoDesc(String photoDesc) {
		this.photoDesc = photoDesc;
	}

	public String getPhotoAltDesc() {
		return photoAltDesc;
	}

	public void setPhotoAltDesc(String photoAltDesc) {
		this.photoAltDesc = photoAltDesc;
	}

	public PhotoUrls getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(PhotoUrls photoUrls) {
		this.photoUrls = photoUrls;
	}

}
