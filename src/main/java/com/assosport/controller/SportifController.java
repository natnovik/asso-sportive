package com.assosport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
