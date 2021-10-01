package com.assosport.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assosport.model.Gymnases;
import com.assosport.model.Sport;

//@Service
public interface AssoSportInterfaceService <T> {
	
//	Gymnases create(Gymnases gymnase);
//	Sport create(Sport s);
	
	List<T> read();
	
//	Gymnases update(Gymnases gymnase);
//	
//	Map<String,String> delete(String id);
	
}
