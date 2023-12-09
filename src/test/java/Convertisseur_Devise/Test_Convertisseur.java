package Convertisseur_Devise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Convertisseur_Devise.Devise;

public class Test_Convertisseur {
	
	
	@Test
	void testConvertLivre() {
		Convertisseur convertisseurLivre = new Convertisseur(Devise.LIVRE);
		assertEquals(1270.2, convertisseurLivre.Convertit(1000));
	}
	
	@Test
	void testConvertEur() {
		Convertisseur convertisseurEur = new Convertisseur(Devise.EUR);
		assertEquals(918.8, convertisseurEur.Convertit(1000));
	}
	
	@Test
	void testConvertJpy() {
		Convertisseur convertisseurJpy = new Convertisseur(Devise.JPY);
		assertEquals(6.8, convertisseurJpy.Convertit(1000));
	}
	
	@Test
	void testConvertUsd() {
		Convertisseur convertisseurUsd = new Convertisseur(Devise.USD);
		assertEquals(1000, convertisseurUsd.Convertit(1000));
	}

}
