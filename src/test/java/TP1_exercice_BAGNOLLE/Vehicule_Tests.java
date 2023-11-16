package TP1_exercice_BAGNOLLE;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Vehicule_Tests {
	
	@Test
	void testVehicule () {
		Vehicule vehiculeNew = new Vehicule(true, true, "Coccinelle", "rouge", 1970, 6, 4);
		// en declarant les THIS dans la CLASS, je n'ai plus à la faire ici.		
		/*vehiculeNew.on = true;
		vehiculeNew.electric = true;
		vehiculeNew.marque = "Coccinelle";
		vehiculeNew.couleur = "Rouge";
		vehiculeNew.annee = 1980;
		vehiculeNew.portes = 6;
		vehiculeNew.roues = 4;*/
		
		String expected = " ====> "+vehiculeNew.on+" ; "+vehiculeNew.electric+" ; "+vehiculeNew.marque+" ; "+vehiculeNew.couleur+" ; "+vehiculeNew.annee+" ; "+vehiculeNew.portes+" ; "+vehiculeNew.roues+" <==== ";
		
		assertEquals(expected, vehiculeNew.getInfos());
		
	}
	
	@Test
	void testMotoCamion () {
// en declarant les THIS dans la CLASS, je n'ai plus à la faire ici.
		Vehicule moto = new Vehicule(true, true, "Coccinelle", "rouge", 1970, 6, 4);
		Moteurs motoMoteur = new Moteurs(true, 120, 20, 230);
		
		Vehicule camion = new Vehicule(true, true, "Coccinelle", "rouge", 1970, 6, 4);
		Moteurs camionMoteur = new Moteurs(true, 80, 20, 110);
		
		System.out.print("NIA NIA NIA !!!");
		
		}
 }

