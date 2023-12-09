package TP6_exercice_String_supp_Concat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;



public class StringUtils_tests {
	@Test
	void concatString() {
		assertEquals("ChienChat", StringUtils.concateneString("Chien", "Chat"));
	}
	
	@Test
	void comptageMots() {
		assertEquals(3, StringUtils.compterMots("I love You") );
	}
	
	@Test
	void supprimEspaceTest () {
		assertEquals("iloveyou", StringUtils.supprimEspace("   i   love  you   "));
	}
	
	@Test
	void supprimEspaceDebutFin () {
		assertEquals("I love you", StringUtils.suppSpaceDebutFin(" I love you "));
	}
	
	@Test
	void supprimEspaceDebutFin2 () {
		assertEquals("I love you", StringUtils.suppSpaceDebutFin2("  I love you  "));
	}
	
	@Test
	void compteTout () {
		assertEquals(10, StringUtils.compteTout("I love you"));
	}
}

	
