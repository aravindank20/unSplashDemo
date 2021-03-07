package com.unsplash.AravindanAssignment.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsplash.AravindanAssignment.utils.ConfigInstance;

@Service
public class ConnectionManager {
	
	@Autowired
	ConfigInstance configInstance;
	
	public String callUnsplash(String category) {		
		String urlStr = configInstance.getUnsplashURL() + category + "/";		
	    String responseString = getConnection("GET", urlStr);	    	
		return responseString;
	}
	
	
	public String getConnection(String httpMethod,String urlStr) {
		String responseString=null;
		try {			
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet(urlStr);
			httpGet.setHeader("Authorization", "Client-ID " + configInstance.getAuthorisationKey());
			CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
			StatusLine statusLine = httpResponse.getStatusLine();			
			
			BufferedReader in=  new BufferedReader( new InputStreamReader(httpResponse.getEntity().getContent()));
			 String inputLine;
   	        StringBuffer responseBuffer = new StringBuffer();
			 while ( ( inputLine = in.readLine() ) != null ) {
   	            responseBuffer.append( inputLine );
   	        }
			  responseString = responseBuffer.toString();
			  //System.out.println("Response -->"+ responseString);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseString;
		
	}


	public String createCollection(String title, String description) {
		String response = null;
		String urlStr = configInstance.getUnsplashURL() + "collections";
		response = postToUnsplash("collections", title, description, urlStr);		
		return response;				
	}
	
	public String addPhotoToCollection(String collection_id, String photo_id) {
		String response = null;
		String urlStr = configInstance.getUnsplashURL() + "collections/" + collection_id +"/add" ;
		response = postToUnsplash("photos", collection_id, photo_id, urlStr);		
		return response;				
	}
	
	public String postToUnsplash(String category, String var1, String var2, String urlStr) {
		String responseString=null;
		try {			
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost httpPost = new HttpPost(urlStr);
			
			if (category.equalsIgnoreCase("collections")) {
				try {
					URI uri = new URIBuilder(httpPost.getURI())
							.addParameter("title", var1)
							.addParameter("description", var2)
							.build();
					httpPost.setURI(uri);
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (category.equalsIgnoreCase("photos")) {
				try {
					URI uri = new URIBuilder(httpPost.getURI())
							.addParameter("collection_id", var1)
							.addParameter("photo_id", var2)
							.build();
					httpPost.setURI(uri);
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			httpPost.setHeader("Authorization", "Bearer " + configInstance.getBearerKey());
			
			
			CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
			StatusLine statusLine = httpResponse.getStatusLine();			
			
			BufferedReader in=  new BufferedReader( new InputStreamReader(httpResponse.getEntity().getContent()));
			 String inputLine;
   	        StringBuffer responseBuffer = new StringBuffer();
			 while ( ( inputLine = in.readLine() ) != null ) {
   	            responseBuffer.append( inputLine );
   	        }
			  responseString = responseBuffer.toString();			  
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseString;
		
	}

}
