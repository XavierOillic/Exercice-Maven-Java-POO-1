package TP1_2_3_4_5_exercice_Voiture_moteur;

public class Vehicule {
	public String vtt ;
	public String marque;
	public int annee;
	public String type;
	
	public Motricite moteur; // Je crée un nouveau moteur sur le modele de motricite
	public Motricite moteur2Moto;
	
	Motricite moteurVae = new Motricite(); // Je cree un nouveau Moteur.
	Motricite moteurRoller = new Motricite();
	
	
	//Motricite moteurVae = new Motricite(); // Je cree un nouveau Moteur.
	//Motricite moteurRoller = new Motricite();
	
	
	public String getInfos () {
		return vtt+" ; "+" ; "+marque+" ; "+annee+" ; "+type;
	}

	
	
	
public Motricite moteur_Guibolles; // Je cree une INSTANCES de MOTRICITE, la ou je donne les vitesses et conditions.
	public boolean enRouteGuibolles;
	public int vitesseGuibolles;
	public int vitesseMaxGuibolles;
	
	public static String getInfosGuibolles (boolean enRouteGuibolles, int vitesseGuibolles, int vitesseMaxGuibolles) {
		return enRouteGuibolles+" ; "+vitesseGuibolles+" ; "+vitesseMaxGuibolles;
	}
	

	
}


