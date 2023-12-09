package Convertisseur_Alphabet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Convertisseur_Alphabet.Alphabet;
import Convertisseur_Alphabet.Conversion_Alphabet;

public class Conversion_Alphabet_tests {
	
	@Test
	public void latinTest ( ) {
		Conversion_Alphabet convertLatin = new Conversion_Alphabet(Alphabet.LATIN);
		assertEquals(100, Conversion_Alphabet.Convertir(100, Alphabet.LATIN));
	}
	
	@Test
	public void arabeTest ( ) {
		Conversion_Alphabet convertArabe = new Conversion_Alphabet(Alphabet.ARABE);
		assertEquals(50, Conversion_Alphabet.Convertir(100, Alphabet.ARABE));
		
	}
	
	@Test
	public void cyrilliqueTest ( ) {
		Conversion_Alphabet convertCyrillique = new Conversion_Alphabet(Alphabet.CYRILLIQUE);
		assertEquals(150, Conversion_Alphabet.Convertir(100, Alphabet.CYRILLIQUE));
		
	}
	
	@Test
	public void ideogrammeTest ( ) {
		Conversion_Alphabet convertIdeogramme = new Conversion_Alphabet(Alphabet.IDEOGRAMME);
		assertEquals(200, Conversion_Alphabet.Convertir(100, Alphabet.IDEOGRAMME));
		
	}

}
