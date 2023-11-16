package TP1_exercice_BAGNOLLE;

public class Vehicule {

	public Boolean on;
	public Boolean electric;
	public String marque;
	public String couleur;
	public int annee;
	public int portes;
	public int roues;
	
	public Moteurs moto; // Dans vehicule, je crée une INSTANCE de MOTEUR dans VEHICULE.
	public Moteurs camion; // Dans vehicule, je crée une INSTANCE de MOTEUR dans VEHICULE.
	
	public Moteurs mobylette;
	Moteurs mobyletteTest = new Moteurs(on, 10, 30, 35);
	
	Vehicule (boolean on, boolean electric, String marque, String couleur, int annee, int portes, int roues ) {
		this.on = on;
		this.electric = electric;
		this.marque = marque;
		this.couleur = couleur;
		this.annee = annee;
		this.roues = portes;
		this.portes = roues;
	}	
	
	public String getInfos () {
		return " ===> "+on+" ; "+electric+" ; "+marque+" ; "+couleur+" ; "+annee+" ; "+portes+" ; "+roues;
	}
	
	public static String getinfosMob(boolean enRoute, Integer vitesse, Integer vitesseDouce, Integer vitesseMax) {
		return "===> "+enRoute+" ; "+12+" ; "+6+" ; "+20;
		
	}
	
}

	
  
