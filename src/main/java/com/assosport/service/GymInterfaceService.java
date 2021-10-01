package com.assosport.service;

import java.util.List;
import java.util.Map;

import com.assosport.model.Gymnases;

//@Service
public interface GymInterfaceService {
	
	List<Gymnases> read();

	Gymnases create(Gymnases gymnase);
	
    Gymnases update(Gymnases gymnase);
	
	Map<String,String> delete(String id);
	
}
