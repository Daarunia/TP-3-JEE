package com.univlittoral.projetback.dto;

import java.sql.Date;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.enums.GenresEnum;

public class LivresSaveRequestDTO {
	private Long id;
	private Date date;
	private String editeur;
	@Enumerated(EnumType.STRING)
	private GenresEnum genre;
	private String lieu;
	private Integer nbPages;
	private String nom;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public GenresEnum getGenre() {
		return genre;
	}
	public void setGenre(GenresEnum genre) {
		this.genre = genre;
	}
}
