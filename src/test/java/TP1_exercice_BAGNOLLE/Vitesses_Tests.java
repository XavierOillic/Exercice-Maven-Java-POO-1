package TP1_exercice_BAGNOLLE;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

public class Vitesses_Tests {
	
	@Test
	void speedToo () {
		Moteurs moteur1 = new Moteurs(true, 20, 30, 190);
		//assertEquals(130, moteur1.vitesseMax);
		assertThrows(RuntimeException.class, () -> {
			moteur1.accelerer();
		});
	}
	
	@Test
	void tooSlow() {
		Moteurs moteur2 = new Moteurs(true, 0, 30, 120);
		moteur2.decelerer();
		assertThrows(RuntimeException.class, ()-> {
			moteur2.decelerer();
		});
	}
	
	@Test
	void sloooooow () {
		Moteurs moteur3 = new Moteurs(true, 0, 5, 80);
		moteur3.seTrainer();
		assertEquals(0, moteur3.vitesseDouce);
	}
	

}

