package TP1_2_3_4_5_exercice_Voiture_moteur;

import org.junit.jupiter.api.Test;

import TP1_2_3_4_5_exercice_Voiture_moteur.Motricite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.jupiter.api.Assertions;

public class TestsVitesse {
	
	
	@Test
	public void test_speedSlow () {
		
		Motricite moteur1 = new Motricite();
		moteur1.enRoute = true;
		moteur1.vitesse = 20;
		moteur1.vitesseMax = 40;
		
		moteur1.accelerer();
		
        assertEquals(30, moteur1.vitesse);	
	}
	
	@Test
	public void test_speedToo () {
		Motricite moteur1 = new Motricite();
		moteur1.enRoute = true;
		moteur1.vitesse = 40;
		moteur1.vitesseMax = 40;
		
		assertThrows(RuntimeException.class, () -> {
			//vehicule.vitesseMax = 40;
			moteur1.accelerer();
		});
	};
	
	@Test
	public void test_speed_camion () {
		Motricite moteurCamion = new Motricite();
		moteurCamion.enRoute = true;
		moteurCamion.vitesse = 100;
		moteurCamion.vitesseMax = 200;
		
		moteurCamion.arreter();
		
		assertThrows(RuntimeException.class, ()-> {
			moteurCamion.arreter();
		});
	};

}
	

