package TP6_exercice_BAGNOLLE_ENCAPSULATION;

public class Vehicule_Encapsule {
	
	private String marque;
	private String modele;
	
	private int annee;
	
	private int vitesseMax;
	
	Vehicule_Encapsule (String marque, String modele, int annee, int vitesseMax) {
		this.setMarque(marque);
		this.setModele(modele);
		this.setAnnee(annee);
		this.setVitesseMax(vitesseMax);
		
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		if (marque == null) {
			throw new IllegalArgumentException("This field cannot be empty !");
		}
		if (marque.isBlank()) {
			throw new IllegalArgumentException("This field cannot be empty !");
		}
		this.marque = marque;
	}
	
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		if (modele == null) {
			throw new IllegalArgumentException("This field cannot be empty !");
		}
		if (modele.isBlank()) {
			throw new IllegalArgumentException("This field cannot be empty !");
		}
		this.modele = modele;
	}
	
	
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		if (annee < 1950 || annee > 2050) {
			throw new IllegalArgumentException("This field have to be contains between thoses two years !");
		}
		this.annee = annee;
	}
	
	
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		if (vitesseMax <= 100 || vitesseMax >= 300) {
			throw new IllegalArgumentException("This field have to be contains between thoses two years !");
		}
		this.vitesseMax = vitesseMax;
	}
	
		
} 
