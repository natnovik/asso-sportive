package com.assosport.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Sport {
	
	@Field(name ="Jouer")
	private String[]sportJouer;
	
	@Field(name ="Arbitrer")
	private String[]sportArbitrer;
	
	@Field(name ="Entrainer")
	private String[]sportEntrainer;
	
	public Sport() {
		
	}

	public String[] getSportJouer() {
		return sportJouer;
	}

	public void setSportJouer(String[] sportJouer) {
		this.sportJouer = sportJouer;
	}

	public String[] getSportArbitrer() {
		return sportArbitrer;
	}

	public void setSportArbitrer(String[] sportArbitrer) {
		this.sportArbitrer = sportArbitrer;
	}

	public String[] getSportEntrainer() {
		return sportEntrainer;
	}

	public void setSportEntrainer(String[] sportEntrainer) {
		this.sportEntrainer = sportEntrainer;
	}
	
}
