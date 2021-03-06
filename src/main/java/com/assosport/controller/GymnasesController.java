package com.assosport.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assosport.model.Gymnases;
import com.assosport.service.AssoSportInterfaceService;
import com.assosport.service.GymnasesServiceImp;

@RestController
@RequestMapping("api/gymnases")
public class GymnasesController {
	@Autowired
//	private AssoSportInterfaceService gymnasesService;
	private GymnasesServiceImp gymnasesService;
	
//	@PostMapping("/add")
//    public Gymnases saveGymnase(@RequestBody Gymnases gymnase) {
//
//       
//	return gymnasesService.create(gymnase);
//    }

    @GetMapping("/all")
    public List<Gymnases> getAllGymnases() {

        return gymnasesService.read();
    }
	
//	  @PutMapping("/update") public Gymnases updateGymnase(@RequestBody
//	  Gymnases gymnase) {
//	 
//	  return gymnasesService.update(gymnase); }
//	 
//	  @DeleteMapping("/{id}") public Map<String, String>
//	  deleteGymnase(@PathVariable String id) {
//	  
//	  return gymnasesService.delete(id); }
	
}
