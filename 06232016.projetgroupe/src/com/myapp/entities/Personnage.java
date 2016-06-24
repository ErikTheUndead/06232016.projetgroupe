package com.myapp.entities;

public class Personnage {
	
	private Long idPersonnage;
	private String nomPersonnage;
	private int niveauPersonnage;
	private double experience;
	private double mana;
	private double vie;
	public Long getIdPersonnage() {
		return idPersonnage;
	}
	public void setIdPersonnage(Long idPersonnage) {
		this.idPersonnage = idPersonnage;
	}
	public String getNomPersonnage() {
		return nomPersonnage;
	}
	public void setNomPersonnage(String nomPersonnage) {
		this.nomPersonnage = nomPersonnage;
	}
	public int getNiveauPersonnage() {
		return niveauPersonnage;
	}
	public void setNiveauPersonnage(int niveauPersonnage) {
		this.niveauPersonnage = niveauPersonnage;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getVie() {
		return vie;
	}
	public void setVie(double vie) {
		this.vie = vie;
	}
	public Personnage() {
		super();
	}
	public Personnage(String nomPersonnage, int niveauPersonnage, double experience, double mana, double vie) {
		super();
		this.nomPersonnage = nomPersonnage;
		this.niveauPersonnage = niveauPersonnage;
		this.experience = experience;
		this.mana = mana;
		this.vie = vie;
	}
	

}
