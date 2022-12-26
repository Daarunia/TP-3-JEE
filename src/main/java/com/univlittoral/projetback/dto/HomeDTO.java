package com.univlittoral.projetback.dto;

import java.util.ArrayList;
import java.util.List;

public class HomeDTO {
	private List<LivresDTO> livres = new ArrayList<LivresDTO>();
	private IndicateurDTO indicateurs;
	
	public List<LivresDTO> getLivres() {
		return livres;
	}
	public void setLivres(List<LivresDTO> livres) {
		this.livres = livres;
	}
	public IndicateurDTO getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateurDTO indicateurs) {
		this.indicateurs = indicateurs;
	}
}
