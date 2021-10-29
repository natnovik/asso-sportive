package com.assosport.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assosport.model.Gymnases;
import com.assosport.service.GymInterfaceService;

@RestController
@RequestMapping("api/gymnases")
//@CrossOrigin(origins = "http://localhost:4200")
public class GymnasesController {
	@Autowired
	private GymInterfaceService gymnasesService;
//	private GymnasesServiceImp gymnasesService;
	
	@PostMapping("/add")
    public Gymnases addGymnase(@RequestBody Gymnases gymnase) {

		return gymnasesService.create(gymnase);
    }

    @GetMapping("/all")
	//we need port at we work in a development
    public List<Gymnases> getAllGymnases() {

        return gymnasesService.read();
    }
	
	  @PutMapping("/update")
	  public Gymnases updateGymnase(@RequestBody Gymnases gymnase) {

	  return gymnasesService.update(gymnase);
	}
	 
	  @DeleteMapping("/delete/{id}")
	  public Map<String, String> deleteGymnase(@PathVariable String id) {
	  
	  return gymnasesService.delete(id);
	}
	
}
