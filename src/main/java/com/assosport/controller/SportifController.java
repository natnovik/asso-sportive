package com.assosport.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assosport.model.Sportif;
import com.assosport.service.SportifInterfaceService;

@RestController
@RequestMapping("api/sportif")
public class SportifController {
	@Autowired
	private SportifInterfaceService sportifService;
//	private SportifServiceImp sportifService;
	
	@GetMapping("/all")
	public List<Sportif> getAllSportifs() {
		return sportifService.read();
	}
	
	@PostMapping("/add")
	public Sportif addSportif(@RequestBody Sportif s) {
		return sportifService.create(s);
	}

	@PutMapping("/update")
	public Sportif updateSportif(@RequestBody Sportif s) {
		return sportifService.update(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public Map<String, String>  deleteSportif(@PathVariable String id){
		return sportifService.delete(id);
	}
}
