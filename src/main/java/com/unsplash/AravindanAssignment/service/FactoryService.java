package com.unsplash.AravindanAssignment.service;

import java.util.List;

public interface FactoryService {
	
	public <T> List<T> getList();
	
	public String addToList(String var1, String var2);

}
