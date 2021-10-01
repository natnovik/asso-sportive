package com.assosport.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Sportifs")
public class Sportif {
	
	@Id
	private String id;
	
	@Field(name = "IdSportif")
	private int idSportif;
	
	@Field(name = "Nom")
	private String nom;
	
	@Field(name = "Prenom")
	private String prenom;
	
	@Field(name = "Sexe")
	private String sexe;
	
	@Field(name = "Age")
	private int age;

	@Field(name = "IdSportifConseiller")
	private int idSportifConseiller;
	
	@Field(name = "Sports")
	private List<Sport> sport;
	
	public Sportif() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdSportif() {
		return idSportif;
	}

	public void setIdSportif(int idSportif) {
		this.idSportif = idSportif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIdSportifConseiller() {
		return idSportifConseiller;
	}

	public void setIdSportifConseiller(int idSportifConseiller) {
		this.idSportifConseiller = idSportifConseiller;
	}

	public List<Sport> getSport() {
		return sport;
	}

	public void setSport(List<Sport> sport) {
		this.sport = sport;
	}
	
}
