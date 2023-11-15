package TP1_2_3_4_5_exercice_Voiture_moteur;

import org.junit.jupiter.api.Test;

import TP1_2_3_4_5_exercice_Voiture_moteur.Motricite;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsVehicule {
@Test
void testAttributs(){
	Vehicule vehicule = new Vehicule();
	
	vehicule.vtt = "VTT";
	vehicule.marque = "Giant";
	vehicule.annee = 2013;
	vehicule.type = ("Tout terrain");
	
	String expected = vehicule.vtt+" ; "+" ; "+vehicule.marque+" ; "+vehicule.annee+" ; "+vehicule.type;
	
	assertEquals(expected, vehicule.getInfos());
	//assertEquals(1830, false, oeuvreArt2.getInfos());
	
	}

@Test
void  testGuibolles() {
	Motricite moteurGuibolles = new Motricite();
	
	moteurGuibolles.enRoute = true;
	moteurGuibolles.vitesse = 20;
	moteurGuibolles.vitesseMax = 40;
	
	String expectedGuibolles = moteurGuibolles.enRoute+"; "+moteurGuibolles.vitesse+" ; "+moteurGuibolles.vitesseMax;
	
	assertEquals(expectedGuibolles, Vehicule.getInfosGuibolles(true, 20, 40));

}

@Test
void testMoteurMotorise () {
	
	Motricite moteurMachine = new Motricite(); 

	// je crée un moteur sur le modele de motricite qui est valable pour les deux vehicules.	
	Vehicule vehiculeCamion = new Vehicule();
	// Je crée un nouveau Vehicule sur le modele de VEHICULE.
	vehiculeCamion.moteur = moteurMachine;
	vehiculeCamion.moteur.enRoute = true;
	vehiculeCamion.moteur.vitesse = 120;
	vehiculeCamion.moteur.vitesseMax = 130;
	
	Vehicule vehiculeMoto = new Vehicule();
	// Je crée un nouveau Vehicule sur le modele de VEHICULE.
	vehiculeMoto.moteur2Moto = moteurMachine;
	vehiculeMoto.moteur2Moto.enRoute = true;
	vehiculeMoto.moteur2Moto.vitesse = 140;
	vehiculeMoto.moteur2Moto.vitesseMax = 200;
	
	System.out.println("NIA NIA NIA");
	
	
}

@Test
void testMoteurElec () {

	Vehicule vehiculeVae = new Vehicule();
	// je crée un nouveau Vehicule sur le modele VEHICULE.
	vehiculeVae.moteurVae.enRoute = true;
	vehiculeVae.moteurVae.vitesse = 15;
	vehiculeVae.moteurVae.vitesseMax = 30;
	
	Vehicule vehiculeRoller = new Vehicule();
	//Je crée une nouveau vehicule sur le modele de vehicule
	vehiculeRoller.moteurRoller.enRoute = true;
	vehiculeRoller.moteurRoller.vitesse = 15;
	vehiculeRoller.moteurRoller.vitesseMax = 25;
	
	System.out.println("NIA NIA NIA");
	
	}
	
}

