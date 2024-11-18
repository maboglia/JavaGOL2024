package com.boglia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boglia.services.CanzoniService;

@Controller
public class CanzoniMVC {

	@Autowired
	private CanzoniService service;
	
	@GetMapping("canzoni")
	public String getAll(Model model) {
		model.addAttribute("titolo", "Le prime 1000 canzoni");
		model.addAttribute("lista", service.getCanzoni());
		return "lista_canzoni";
	}
	
	@GetMapping("canzoni/{cantante}")
	public String getAllByCantante(@PathVariable String cantante, Model model) {
		model.addAttribute("titolo", "Tutti i successi di " + cantante);
		model.addAttribute("lista", service.getCanzoniBiCantante(cantante));
		return "lista_canzoni";
	}



}
