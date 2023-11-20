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
	
	Vehicule (Moteur moteur, boolean on, boolean electric, String marque, String couleur, int annee, int portes, int roues ) {
		if (marque != null || couleur != null) {
			if (marque == "" || couleur == "") {
				throw new IllegalArgumentException(marque);
			}
		}
		this.on = on;
		this.electric = electric;
		this.marque = marque;
		this.couleur = couleur;
		this.annee = annee;
		this.roues = roues;
		this.portes = portes;
		this.moteur = moteur;
	}
	
	public String getInfos () {
		if (moteur != null) {
	return moteur.vitesse+" ; "+moteur.vitesseMax+" ; "+moteur.vitesseDouce+" ; "+marque+" ; "+couleur+" ; "+" ; "+annee+" ; "+" ; portes :"+portes;
	} else {
		return marque+" ; "+couleur+" ; "+" ; "+annee+" ; "+" ; portes :"+portes;
		}
	}
	
	
}

	
  
