package Enumeration_Bibliotheque;

public class Bibliotheque {
	public GenreLitteraire EnumGenreLitt;
	public int tomes;
	public String auteurs;
	
	Bibliotheque (GenreLitteraire EnumGenreLitt, String auteurs, int tomes){
		if (EnumGenreLitt == null || auteurs == null) {
			if (auteurs.isBlank()){
				throw new IllegalArgumentException();
			}
		}
		if (tomes <= 0) {
			throw new IllegalArgumentException();
		} 	
		
		this.EnumGenreLitt = EnumGenreLitt;
		this.tomes = tomes;
		this.auteurs = auteurs;
		
	}
}
