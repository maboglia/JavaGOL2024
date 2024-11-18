package com.boglia.services;

import java.util.List;

import com.boglia.entities.Canzone;

public interface CanzoniService {

	//CRUD
	
	//CREATE
	Canzone addCanzone(Canzone c);
	
	//READ 
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniBiCantante(String cantante);
	Canzone getCanzoneById(int id);
	Canzone getCanzoneByTitolo(String titolo);
	
	//UPDATE
	Canzone updateCanzone(Canzone c);
	
	//DELETE
	void deleteCanzone(Canzone c);
	void deleteCanzoneById(int id);
}
