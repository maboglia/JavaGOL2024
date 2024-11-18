package com.boglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Canzone;
import com.boglia.services.CanzoniService;

@RestController
public class CanzoniREST {

	@Autowired
	private CanzoniService service;
	
	@GetMapping("api/canzoni")
	public List<Canzone> getCanzoni(){
		return service.getCanzoni();
	}
	
	@PostMapping("api/canzoni")
	public Canzone addCanzone(@RequestBody  Canzone c) {
		return service.addCanzone(c);
	}
	
}
