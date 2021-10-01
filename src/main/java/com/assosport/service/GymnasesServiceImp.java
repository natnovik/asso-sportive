package com.assosport.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assosport.model.Gymnases;
import com.assosport.repository.GymnasesRepository;

@Service
public class GymnasesServiceImp implements GymInterfaceService{
	
	@Autowired
	private GymnasesRepository gymnasesRepository;
	
	@Override
	public Gymnases create(Gymnases gymnase) {
		return gymnasesRepository.insert(gymnase);
	}

	@Override
	public List<Gymnases> read() {
		return gymnasesRepository.findAll();
	}

	@Override
	public Gymnases update(Gymnases gymnase) {
		//object vide find by id 
		return gymnasesRepository.save(gymnase);
	}

	@Override
	public Map<String, String> delete(String id) {
		//Total count of data before delete
        long beforeDelete = gymnasesRepository.count();

        gymnasesRepository.deleteById(id);

        // Total count of data after delete
        long afterDelete = gymnasesRepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
	}

}
