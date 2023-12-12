package TP6_exercice_BAGNOLLE_ENCAPSULATION;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Vehicule_Encapsule_tests {
	
	@Test
	void vehicule_encapsule_test_marque () {
		assertThrows (IllegalArgumentException.class, () -> {
			
			new Vehicule_Encapsule("toyota", "nianiania", 1960, 120);
		});
	}
	
	@Test
	void vehicule_encapsule_test_modele () {
         assertThrows (IllegalArgumentException.class, () -> {
			
			new Vehicule_Encapsule("j", "k", 1970, 200);
		});
	}
	
	@Test
	void vehicule_encapsule_test_annee () {
         assertThrows (IllegalArgumentException.class, () -> {
			
			new Vehicule_Encapsule("k", "Coccinelle", 1960, 140);
		});
	}
	
	@Test
	void vehicule_encapsule_test_vitesseMax () {
         assertThrows (IllegalArgumentException.class, () -> {
			
			new Vehicule_Encapsule("Volkswagen", "j", 1960, 300);
		});
	}
	

}
