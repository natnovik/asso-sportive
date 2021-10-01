package com.assosport.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assosport.model.Sportif;

@Service
public interface SportifInterfaceService {
	
	List<Sportif> read();
	
	Sportif create(Sportif s);
	
	Sportif update(Sportif s);
	
	Map<String,String> delete(String id);
	

}
