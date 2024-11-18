package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Canzone;
import com.boglia.repos.CanzoneDAO;

@Service
public class CanzoniServiceImpl implements CanzoniService {

	@Autowired
	private CanzoneDAO dao;
	
	@Override
	public Canzone addCanzone(Canzone c) {
		return dao.save(c);
	}

	@Override
	public List<Canzone> getCanzoni() {
		
		return dao.findAll();
	}

	@Override
	public List<Canzone> getCanzoniBiCantante(String cantante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canzone getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canzone getCanzoneByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canzone updateCanzone(Canzone c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCanzoneById(int id) {
		// TODO Auto-generated method stub

	}

}
