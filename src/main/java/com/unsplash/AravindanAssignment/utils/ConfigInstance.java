package com.unsplash.AravindanAssignment.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ConfigInstance {

	private String authorisationKey;
	private String unsplashURL;
	private String bearerKey;
	
	
	public String getAuthorisationKey() {
		return authorisationKey;
	}
	public void setAuthorisationKey(String authorisationKey) {
		this.authorisationKey = authorisationKey;
	}
	public String getUnsplashURL() {
		return unsplashURL;
	}
	public void setUnsplashURL(String unsplashURL) {
		this.unsplashURL = unsplashURL;
	}
	public String getBearerKey() {
		return bearerKey;
	}
	public void setBearerKey(String bearerKey) {
		this.bearerKey = bearerKey;
	}
}
