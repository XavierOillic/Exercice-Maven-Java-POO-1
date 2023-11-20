package TP6_exercice_String_supp_Concat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;



public class StringUtils_tests {
	@Test
	void concatString() {
		assertEquals("ChienChat", StringUtils.concateneString("Chien", "Chat"));
	}
}
