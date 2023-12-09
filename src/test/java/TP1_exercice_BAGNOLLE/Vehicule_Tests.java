package TP1_exercice_BAGNOLLE;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Vehicule_Tests {
	
	@Test
	void testVehicule () {
		Moteur moteurTest = new Moteur(true, 20, 50, 130);
		Vehicule vehiculeNew = new Vehicule(moteurTest, true, true, "Coccinelle", "rouge", 1970, 6, 4);
		
		String expected = moteurTest.vitesse+" ; "+moteurTest.vitesseMax+" ; "+moteurTest.vitesseDouce+" ; "+true+" ; "+true+" ; "+"Coccinelle"+" ; "+"rouge"+"; "+1970+" ; "+6+" ; "+4+" .";
		
		assertEquals(expected, vehiculeNew.getInfos());
		
	}
	
	@Test
	void testMotoCamion () {
// En déclarant le MOTEUR dans les ATTRIBUTS, ET dans son CONSTRUCTEUR, je peux le déclarer ici grace à une Nouvelle INSTANCE.
		Moteur moteurTestMotoCamion = new Moteur(true, 80, 20, 280); //Le new moteur me permet de donner des valeurs distinctes aux deux tests.
		
		Vehicule moto = new Vehicule(moteurTestMotoCamion, true, true, "Harley", "Noire", 1989, 0, 2);
		moto.moteur.accelerer();// C'est la meme Instanciation de moteur que pour le camion
		
		Vehicule camion = new Vehicule(moteurTestMotoCamion, true, true, "Truck", "Verte", 2000, 4, 8);
		camion.moteur.accelerer(); //C'est la meme Instanciation de moteur que pour le camion
		
		System.out.print("NIA NIA NIA !!!");
		
		}
	
	@Test
	void testMoteur2vehicule() {
		Moteur moteurTrottF1 = new Moteur(true, 90, 20, 230); // Une SEULE INSTANCE MOTEUR POUR LES DEUX F1 et TROTT
		
		Vehicule trottinette = new Vehicule(moteurTrottF1, true, true, "Trott","Arc-en-ciel", 2020, 0, 2);
		Vehicule f1 = new Vehicule(moteurTrottF1, true, true, "Formule 1", "Rouge", 2023, 0, 4);
		
		//Moteur moteurTest = new Moteur(true, 20, 10, 25);
		
		trottinette.moteur.accelerer();
		f1.moteur.accelerer();
		
		 System.out.println("Les deux vehicule F1 et Trott partagent le même moteur.");
 	}
	@Test
	void testMoteurMoteur() {
		Vehicule vtt = new Vehicule(new Moteur(true, 15, 30, 40), true, true, "bla", "blabla", 10, 20, 30);
		Vehicule gravel = new Vehicule(new Moteur(true, 10, 15, 30), true, true, "bla", "blabla", 10, 20, 30);
		
		gravel.moteur.accelerer(); // une instance MOTEUR
		vtt.moteur.accelerer(); // une AUTRE INSTANCE MOTEUR.
		
	}
	
	@Test 
	void getInfosTest () {
		Vehicule vehiculeTestInfo = new Vehicule (new Moteur(true, 10, 10, 20), true, true, "blabla", "blabla", 1970, 6, 4);
		String expected = vehiculeTestInfo.getInfos();
		assertEquals(expected, vehiculeTestInfo.getInfos());
	
	}
	
	
 }

