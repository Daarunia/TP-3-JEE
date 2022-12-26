package com.univlittoral.projetback.dto;

import java.sql.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.enums.GenresEnum;

public class LivresDTO {
	private long id;
	private String nom;
	private String editeur;
	private int nbPages;
	private String lieuParution;
	private Date dateParution;
	@Enumerated(EnumType.STRING)
	private GenresEnum genre;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	public String getLieuParution() {
		return lieuParution;
	}
	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public GenresEnum getGenre() {
		return genre;
	}
	public void setGenre(GenresEnum genre) {
		this.genre = genre;
	}
}
