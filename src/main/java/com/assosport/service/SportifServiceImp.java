package com.assosport.service;

import java.util.HashMap;
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
		return sRepository.save(s);
	}

	@Override
	public Sportif update(Sportif s) {
		
		return sRepository.save(s);
	}

	@Override
	public Map<String, String> delete(String id) {
		//Total count of data before delete
        long beforeDelete = sRepository.count();

        sRepository.deleteById(id);

        // Total count of data after delete
        long afterDelete = sRepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
	}
		
}