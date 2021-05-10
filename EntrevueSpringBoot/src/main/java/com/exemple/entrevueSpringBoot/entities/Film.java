package com.exemple.entrevueSpringBoot.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film  implements Serializable {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String titre;
	private String description;
	private ArrayList<Acteur>acteurs;
	
	public Film() {
		super();
	}
	public Film( String titre,String description, ArrayList<Acteur> acteurs) {
		super();
		this.titre = titre;
		this.description = description;
		this.acteurs = acteurs;
	}
	
	public Film(long id, String titre, String description, ArrayList<Acteur> acteurs) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.acteurs = acteurs;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Acteur> getActeurs() {
		return acteurs;
	}
	public void setActeurs(ArrayList<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ",  description=" + description
				+ ", acteurs=" + acteurs + "]";
	}
	
}
