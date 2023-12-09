package TP6_exercice_String_supp_Concat;

public class StringUtils {
	
// METHODE QUI CONCATNE TOUS LES MOTS De DIIFFERENTES STRING	
	public static String concateneString (String... iciJeChoisi ) {
		String result = "";               // J'initialise ma VAR qui contient ma future concatenation.
		for (String concatStr : iciJeChoisi) {  // Mon nbstring remplace le i.
			result += concatStr;         // Sans le += elle ne s'additionne pas a elle meme
		}
		return result ;
		
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
	
// METHODE QUI SUPPRIME TOUS LES ESPACES, grace à la REGEXP
	public static String supprimEspace (String phrase3) {
		String phraseModif = phrase3.trim().replaceAll("\\s+", "");
		return phraseModif;
	}
	
// METHODE QUI SUPPRIME LES ESPACES DE DEBUT ET DE FIN ====> STRIP()
	public static String suppSpaceDebutFin (String str1) {
		String result = "";
		result = str1.strip();
		return result;
	}

	
// METHODE QUI SUPPRIME LES ESPACES DE DEBUT ET DE FIN ===> TRIM()
	public static String suppSpaceDebutFin2 (String str2) {
		String result = "";
		result = str2.trim();
		return result;
	}
	

}

