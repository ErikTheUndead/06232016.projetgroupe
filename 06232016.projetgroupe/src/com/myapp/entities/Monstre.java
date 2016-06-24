package com.myapp.entities;

public class Monstre {
	
	private Long idMonstre;
	private String nomMonstre;
	private double puissance;
	private double vie;
	private double mana;
	public Long getIdMonstre() {
		return idMonstre;
	}
	public void setIdMonstre(Long idMonstre) {
		this.idMonstre = idMonstre;
	}
	public String getNomMonstre() {
		return nomMonstre;
	}
	public void setNomMonstre(String nomMonstre) {
		this.nomMonstre = nomMonstre;
	}
	public double getPuissance() {
		return puissance;
	}
	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}
	public double getVie() {
		return vie;
	}
	public void setVie(double vie) {
		this.vie = vie;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public Monstre() {
		super();
	}
	public Monstre(String nomMonstre, double puissance, double vie, double mana) {
		super();
		this.nomMonstre = nomMonstre;
		this.puissance = puissance;
		this.vie = vie;
		this.mana = mana;
	}
	
	

}
