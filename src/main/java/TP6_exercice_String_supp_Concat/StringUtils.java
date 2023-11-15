package TP6_exercice_String_supp_Concat;

public class StringUtils {
// METHODE QUI CONCATNE TOUS LES MOTS De DIIFFERENTES STRING	
	public static String concateneSring (String... strings ) {
		System.out.println("Number of Args passed  ==> " + strings.length);
		String concatenee = ""; // J'initialise ma VAR qui contient ma future concatenation.
		for (String numbOfString : strings) {  // Mon nbstring remplace le i.
			concatenee += numbOfString + "";
// Sans le += elle ne s'additionne pas a elle meme
		}
		return concatenee ;
		
	}
// METHODE QUI COMMPTE LES MOTS D'UNE PHRASE.	
	public static  int compterMots (String phrase) {
		String [] words = phrase.split("\\s+");
		return words.length;
	}
//METHODE QUI COMPTE TOUT... ??	
	public static int compteTout (String phrase2) {
		String words = phrase2.trim();
		return words.length();
	}
// METHODE QUI SUPRIME TOUS LES ESPACES, grace à la REGEXP
	public static String supprimEspace (String phrase3) {
		String phraseModif = phrase3.trim().replaceAll("\\s+", "");
		return phraseModif;
	}
// METHODE QUI SUPPRIME LES ESPACES DE DEBUT ET DE FIN.	
	public static String suppSpaceDebutFin (String phrase4) {
		String phraseModif2 = phrase4.trim();
		return phraseModif2;
	}

}

