package com.assosport.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assosport.model.Sportif;
import com.assosport.repository.SportifRepository;

@Service
public class SportifServiceImp implements SportifInterfaceService {
	
	@Autowired
	private SportifRepository sRepository;

	@Override
	public List<Sportif> read() {
		return sRepository.findAll();
	}
	
	@Override
	public Sportif create(Sportif s) {
		return sRepository.insert(s);
	}

	@Override
	public Sportif update(Sportif s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}