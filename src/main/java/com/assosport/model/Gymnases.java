package com.assosport.model;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
//@Primary
@Document("Gymnases")
//in case if the name of the collection in mongo is dif of the name of the class
public class Gymnases {

	@Id
	private String id;
	
	@Field(name = "IdGymnase")
    private int idGymnase;
	
	@Field(name = "NomGymnase")
    private String nomGymnase;
	
	@Field(name = "Adresse")
    private String adresse;
	
	@Field(name = "Ville")
    private String ville;
	
	@Field(name = "Surface")
    private int surface;
	
	@Field(name = "Seances")
    private List<Seance> seances; //better for collections vs. ArrayList
    
    public Gymnases() {
   	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdGymnase() {
		return idGymnase;
	}

	public void setIdGymnase(int idGymnase) {
		this.idGymnase = idGymnase;
	}

	public String getNomGymnase() {
		return nomGymnase;
	}

	public void setNomGymnase(String nomGymnase) {
		this.nomGymnase = nomGymnase;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
    
}
