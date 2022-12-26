package com.univlittoral.projetback.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.univlittoral.projetback.entity.LivresEntity;
import com.univlittoral.projetback.repository.LivresRepository;


@Service
public class LivresService {
	
	@Autowired
	private LivresRepository repo;
	
	
	public List<LivresEntity> findAll() {
		List<LivresEntity> listeLivresEntity = new ArrayList<LivresEntity>(); 
		
		listeLivresEntity = repo.findAll();
		return listeLivresEntity;
	}
	
	public LivresEntity findById(Long id) {
		LivresEntity LivresEntity = new LivresEntity(); 
		
		LivresEntity = repo.findById(id).orElse(null);
		return LivresEntity;
	}
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	public void addOne(LivresEntity livres){
		repo.save(livres);
	}
}
