package com.boglia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boglia.services.CanzoniService;

@Controller
public class CanzoniMVC {

	@Autowired
	private CanzoniService service;
	
	@GetMapping("canzoni")
	@ResponseBody
	public String getAll() {
		System.out.println(service.getCanzoni());
		return "funziona";
	}
}
