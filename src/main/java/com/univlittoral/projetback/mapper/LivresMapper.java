package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.LivresDTO;
import com.univlittoral.projetback.dto.LivresSaveRequestDTO;
import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.entity.LivresEntity;

public class LivresMapper {
	
	public static LivresDTO map(LivresEntity livreEntity) {
        LivresDTO result = new LivresDTO();
        result.setId (livreEntity.getId());
        result.setNom (livreEntity.getNom());
        result.setEditeur (livreEntity.getEditeur());
        result.setNbPages (livreEntity.getNbPages());
        result.setLieuParution (livreEntity.getLieuParution());
        result.setDateParution (livreEntity.getDateParution());
        result.setGenre (livreEntity.getGenre());
        return result;
    }
	
	public static List<LivresDTO> map(List<LivresEntity> bookEntity){
		List<LivresDTO> result = new ArrayList<LivresDTO>();
		
		for(final LivresEntity entity: bookEntity) {
			result.add(LivresMapper.map(entity));
		}
		return result;
	}
	
	public static LivresEntity entity(LivresSaveRequestDTO livresDTO) {
		LivresEntity result = new LivresEntity();
		
		if(livresDTO.getId() != null) {
			result.setId (livresDTO.getId());
		}
        result.setNom (livresDTO.getNom());
        result.setEditeur(livresDTO.getEditeur());
        result.setNbPages (livresDTO.getNbPages());
        result.setDateParution (livresDTO.getDate());
        result.setLieuParution(livresDTO.getLieu());
        result.setGenre(livresDTO.getGenre());
        return result;
    }
	
	public static LivresEntity mapEntityToEntity(LivresEntity myEntity, LivresSaveRequestDTO livresDTO) { 
        
        myEntity.setId (livresDTO.getId());
        myEntity.setNom (livresDTO.getNom());
        myEntity.setEditeur (livresDTO.getEditeur());
        myEntity.setNbPages (livresDTO.getNbPages());
        myEntity.setDateParution (livresDTO.getDate());
        myEntity.setLieuParution (livresDTO.getLieu());
        myEntity.setGenre (livresDTO.getGenre());

        return myEntity;
        }
}
