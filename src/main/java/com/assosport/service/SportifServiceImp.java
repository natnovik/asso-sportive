package com.assosport.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assosport.model.Sportif;
import com.assosport.repository.SportifRepository;

@Service
public class SportifServiceImp implements AssoSportInterfaceService{
	
	@Autowired
	private SportifRepository sRepository;

	@Override
	public List<Sportif> read() {
		return sRepository.findAll();
	}

}
