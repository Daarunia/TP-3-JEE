package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.IndicateurDTO;
import com.univlittoral.projetback.dto.LivresDTO;
import com.univlittoral.projetback.dto.LivresSaveRequestDTO;
import com.univlittoral.projetback.entity.LivresEntity;
import com.univlittoral.projetback.enums.GenresEnum;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.mapper.LivresMapper;
import com.univlittoral.projetback.service.AuteurService;
import com.univlittoral.projetback.service.LivresService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "rest/bd/home/")
public class HomeController {

	 @Autowired
	 private LivresService livresService;
	 
	 @Autowired
	 private AuteurService auteurService;
	 
	 @GetMapping
	 public HomeDTO findUsers(){
		 // list genres 
		 List<GenresEnum> listGenre = new ArrayList<GenresEnum>();

         for(LivresEntity livres : livresService.findAll()) {
             if(!listGenre.contains(livres.getGenre())) {
                 listGenre.add(livres.getGenre());
             }
         }
		 // list des auteurs 
		 List<AuteurDTO> auteurdto = AuteurMapper.map(auteurService.findAll());
		 // list qui contient tout les books 
		 List<LivresDTO> livredto = LivresMapper.map(livresService.findAll());
	     // remplissage des indicateurs à partir de la taille de la liste  
		 IndicateurDTO indicateurs = new IndicateurDTO();
		 indicateurs.setNbGenres(listGenre.size());
		 indicateurs.setNbLivres(livredto.size());
		 indicateurs.setNbAuteurs(auteurdto.size());
		 HomeDTO homedto = new HomeDTO();
		 homedto.setLivres(LivresMapper.map(livresService.findAll()));
		 homedto.setIndicateurs(indicateurs);
		 return homedto;
	 }
}
