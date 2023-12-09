package TP_exercice_ENUMERATION_BANQUE;

//import org.junit.platform.commons.JUnitException;
import org.junit.jupiter.api.*;

import TP_exercice_ENUMERATION_BANQUE.CompteBancaire;
import TP_exercice_ENUMERATION_BANQUE.TypeDeCompte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class Comptes_Bancaire_Test {
	

		@Test
		void comptATester() {
			List<CompteBancaire> listCompte = new ArrayList<>(); // C'est une collection
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTECOURANT, "Xavier", 3));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTECOURANT, "Marie", 3 ));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTECOURANT, "Arthur", 3 ));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTECOURANT, "Ewen", 3 ));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTEEPARGNE, "Xavier", 5));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTEEPARGNE, "Marie", 5));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTEEPARGNE, "Arthur", 5));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTEEPARGNE, "Ewen", 5));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.COMPTEEPARGNE, "Morgane", 5));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.LIVRETA, "Xavier", 12));
			
			listCompte.add(new CompteBancaire(TypeDeCompte.RETRAITE, "Marie", 30));
			
			int compteurCourant = 0, compteurEpargne = 0, compteurLivret = 0, compteurRetraite = 0; // JE PEUX DECLARER TROIX VARIABLES AVEC LE MEME INT.
			
			for (CompteBancaire indexCompteur : listCompte ) {
				
				switch (indexCompteur.EnumJeChoisiceMot) {
				
				case COMPTECOURANT : compteurCourant++;
					break;
				case COMPTEEPARGNE : compteurEpargne++;
					break;
				case LIVRETA : compteurLivret++;
					break;
				case RETRAITE : compteurRetraite++;
					break;
			}
			

		} // FIN COMPTER A TESTER ======> OK. Avec un Compte définit.
			assertEquals(4, compteurCourant);
			assertEquals(5, compteurEpargne);
			assertEquals(1, compteurLivret);
			assertEquals(1, compteurRetraite);

	}
		
		
		
		
		
} // FIN DE CLASS