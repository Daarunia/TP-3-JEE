package com.univlittoral.projetback.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.repository.AuteurRepository;

@Service
public class AuteurService {
	@Autowired
	private AuteurRepository repo;
	
	
	public List< AuteurEntity> findAll() {
		List< AuteurEntity> listeAuteurEntity = new ArrayList< AuteurEntity>(); 
		
		listeAuteurEntity = repo.findAll();
		return listeAuteurEntity;
	}
	
	public  AuteurEntity findById(Long id) {
		 AuteurEntity AuteurEntity = new  AuteurEntity(); 
		
		AuteurEntity = repo.findById(id).orElse(null);
		return AuteurEntity;
	}
}
