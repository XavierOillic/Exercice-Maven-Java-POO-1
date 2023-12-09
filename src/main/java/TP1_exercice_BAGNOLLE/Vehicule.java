package TP1_exercice_BAGNOLLE;

public class Vehicule {

	public Boolean on;
	public Boolean electric;
	public String marque;
	public String couleur;
	public int annee;
	public int portes;
	public int roues;
	//ATTTRIBUTS ou CARACTERISTIQUES
	public Moteur moteur; //= new Moteur(true, 10, 20, 200);// j'entre dans les attributs de vehicule la CLAS MOTEUR 
	// IL N'Y A QU'UN MOTEUR dans lon vehicule.
	
	// ET parce qu'il y a une moteur dans les attributs, je peux le mettre dans le CONSTRUCTEUR.
	Vehicule(Moteur moteur){
		if (moteur == null) {
			throw new IllegalArgumentException();
		}
		this.moteur = moteur;
	}
	Vehicule (Moteur moteur, boolean on) {
		this(moteur);
		this.on = on;
	}
	
	Vehicule (Moteur moteur, boolean on, boolean electric) {
		this(moteur, on);
		this.electric = on;
	}
	
	Vehicule (Moteur moteur, boolean on, boolean electric, String marque, String couleur) {
		this(moteur, on, on);
			if (marque == null || couleur == null) {
				if (marque.isBlank() || couleur.isBlank()) {
				throw new IllegalArgumentException(marque);
				}
			}
		this.marque = marque;
		this.couleur = couleur;
	}
	
	Vehicule (Moteur moteur, boolean on, boolean electric, String marque, String couleur, Integer annee, Integer portes, Integer roues) {
		this(moteur, on, on, marque, couleur);
			if (annee == null || portes == null || roues == null) {
				if (annee < 0 || portes < 0 || roues < 0) {
					throw new IllegalArgumentException();
				}
			}
		this.annee = annee;
		this.roues = roues;
		this.portes = portes;
	}
	

	
	public String getInfos () {
		if (moteur != null) {
	return moteur.vitesse+" ; "+moteur.vitesseMax+" ; "+moteur.vitesseDouce+" ; "+marque+" ; "+couleur+" ; "+" ; "+annee+" ; "+" ; portes :"+portes;
	} else {
		return marque+" ; "+couleur+" ; "+" ; "+annee+" ; "+" ; portes :"+portes;
		}
	}
	
	
}

	
  
