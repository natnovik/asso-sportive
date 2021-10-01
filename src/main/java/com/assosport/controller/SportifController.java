package com.assosport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assosport.model.Sportif;
import com.assosport.service.AssoSportInterfaceService;
import com.assosport.service.SportifServiceImp;

@RestController
@RequestMapping("api/sportif")
public class SportifController {
	@Autowired
//	private AssoSportInterfaceService sportifService;
	private SportifServiceImp sportifService;
	
	@GetMapping("/all")
	public List<Sportif> getAllSportifs(){
		return sportifService.read();
	}
}
