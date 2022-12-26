package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.LivresDTO;
import com.univlittoral.projetback.dto.LivresSaveRequestDTO;
import com.univlittoral.projetback.entity.LivresEntity;
import com.univlittoral.projetback.mapper.LivresMapper;
import com.univlittoral.projetback.service.LivresService;

@RestController
@RequestMapping(value = "rest/bd/livres")
public class LivresController {

	 @Autowired
	 private LivresService service;
	 
	 @GetMapping("/{id}")
	 public LivresDTO getEmployeesById(@PathVariable Long id) {
		 return LivresMapper.map(service.findById(id));
	 }
	 
	 @GetMapping
	 public List<LivresDTO> findUsers(){
		return LivresMapper.map(service.findAll());
	 }
	 
	 @DeleteMapping("/{id}")
	 public void deleteEmployeesById(@PathVariable Long id) {
		 service.deleteById(id);
	 }
	 
	 @PostMapping
	 public void AddOne(@RequestBody LivresSaveRequestDTO livresDTO){
	      service.addOne(LivresMapper.entity(livresDTO));
	 }
	 
	 @PutMapping(value="/rest/bd/livres/{id}") 
	 public void modifyLivre(@RequestBody LivresSaveRequestDTO livreDTO, @PathVariable Long id) { 
	        LivresEntity livreUpdate = service.findById(id);
	        service.addOne(LivresMapper.mapEntityToEntity(livreUpdate, livreDTO));
	 }
}