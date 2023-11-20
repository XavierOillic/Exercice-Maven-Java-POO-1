package TP1_exercice_BAGNOLLE;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

public class Vitesses_Tests {
	
	@Test
	void speedToo () {
		Moteur moteur1 = new Moteur(true, 20, 30, 190);
		//assertEquals(130, moteur1.vitesseMax);
		assertThrows(RuntimeException.class, () -> {
			moteur1.accelerer();
		});
	}
	
	@Test
	void tooSlow() {
		Moteur moteur2 = new Moteur(true, 0, 30, 120);
		moteur2.decelerer();
		assertThrows(RuntimeException.class, ()-> {
			moteur2.decelerer();
		});
	}
	
	@Test
	void sloooooow () {
		Moteur moteur3 = new Moteur(true, 0, 5, 80);
		moteur3.seTrainer();
		assertEquals(0, moteur3.vitesseDouce);
	}
	@Test
	void moteurOn () {
		Moteur moteur4 = new Moteur(true, 20, 30, 200);
		moteur4.accelerer();
		assertThrows(RuntimeException.class, () -> {
			moteur4.enRoute = false;
		}); // Je teste si le moteur est allumé.
	}
	@Test
	void testMoteurAccelerer() {
		Moteur moteur5 = new Moteur(true, 70, 40, 90);
		moteur5.accelerer();
		assertEquals(100, moteur5.vitesseMax);
	}

}

