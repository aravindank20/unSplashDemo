package com.unsplash.AravindanAssignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoUrls {
	
	@JsonProperty("regular")
	public String photoRegularUrl;
	
	@JsonProperty("thumb")
	public String photoThumbUrl;

	public String getPhotoRegularUrl() {
		return photoRegularUrl;
	}

	public void setPhotoRegularUrl(String photoRegularUrl) {
		this.photoRegularUrl = photoRegularUrl;
	}

	public String getPhotoThumbUrl() {
		return photoThumbUrl;
	}

	public void setPhotoThumbUrl(String photoThumbUrl) {
		this.photoThumbUrl = photoThumbUrl;
	}

}
