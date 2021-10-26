package com.assosport.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

public class Sport {
	
	@Field(name ="Jouer")
//	private String[]sportJouer;
	private List<String> sportJouer;
	
	@Field(name ="Arbitrer")
//	private String[]sportArbitrer;
	private List<String> sportArbitrer;
	
	@Field(name ="Entrainer")
//	private String[]sportEntrainer;
	private List<String> sportEntrainer;
	
	public Sport() {
		
	}

	public List<String> getSportJouer() {
		return sportJouer;
	}

	public void setSportJouer(List<String> sportJouer) {
		this.sportJouer = sportJouer;
	}

	public List<String> getSportArbitrer() {
		return sportArbitrer;
	}

	public void setSportArbitrer(List<String> sportArbitrer) {
		this.sportArbitrer = sportArbitrer;
	}

	public List<String> getSportEntrainer() {
		return sportEntrainer;
	}

	public void setSportEntrainer(List<String> sportEntrainer) {
		this.sportEntrainer = sportEntrainer;
	}
	
}
