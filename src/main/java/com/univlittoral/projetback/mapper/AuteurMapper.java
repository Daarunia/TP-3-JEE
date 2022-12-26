package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;
import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.entity.LivresEntity;

public class AuteurMapper {
	public static List<AuteurDTO> map(List<AuteurEntity> bookEntity){
		List<AuteurDTO> result = new ArrayList<AuteurDTO>();
		
		for(final AuteurEntity entity: bookEntity) {
			result.add(AuteurMapper.map(entity));
		}
		return result;
	}
	
	public static AuteurDTO map(AuteurEntity auteurEntity) {
		AuteurDTO result = new AuteurDTO();
        result.setId (auteurEntity.getId());
        result.setNom (auteurEntity.getNom());
        result.setPrenom (auteurEntity.getPrenom());
        result.setDate (auteurEntity.getDate());
        return result;
    }
}
