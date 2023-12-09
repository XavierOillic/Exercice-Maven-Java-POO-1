package Enumeration_Bibliotheque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Bibliotheque_test {

	@Test
	void biblioTest() {
		List <Bibliotheque> ListGenre = new ArrayList <> ();
		
		ListGenre.add(new Bibliotheque(GenreLitteraire.BIOGRAPHIE, "Monet", 10));
		ListGenre.add(new Bibliotheque(GenreLitteraire.FANTASTIQUE, "Tolkien", 6));
		ListGenre.add(new Bibliotheque(GenreLitteraire.MEDIEVAL_FANTASTIQUE, "Tolkien", 8));
		ListGenre.add(new Bibliotheque(GenreLitteraire.POLICIER, "Christie", 12));
		ListGenre.add(new Bibliotheque(GenreLitteraire.SCIENCE_FICTION, "Clarke", 3));
		ListGenre.add(new Bibliotheque(GenreLitteraire.SCIENCE_FICTION, "Barjavel", 4));
		ListGenre.add(new Bibliotheque(GenreLitteraire.SCIENCE_FICTION, "Lovecraft", 6));
		ListGenre.add(new Bibliotheque(GenreLitteraire.BIOGRAPHIE, "Hamon", 1));
		ListGenre.add(new Bibliotheque(GenreLitteraire.PHILOSOPHIE, "Gaarder", 1));
		ListGenre.add(new Bibliotheque(GenreLitteraire.PHILOSOPHIE, "Sartre", 5));
	
		int bioNb = 0, fantNb = 0, medFanNb = 0, polNb = 0, sfNb = 0, philNb = 0 ;
		
		for (Bibliotheque indexGenre : ListGenre) {
		
			switch (indexGenre.EnumGenreLitt) {
				case BIOGRAPHIE : bioNb++;
					break;
				case FANTASTIQUE : fantNb++;
					break;
				case MEDIEVAL_FANTASTIQUE : medFanNb++;
					break;
				case PHILOSOPHIE : philNb++;
					break;
				case POLICIER : polNb++;
					break;
				case SCIENCE_FICTION : sfNb++;
					break;
					
			}
		}		
		assertEquals(2, bioNb);
		assertEquals(1, fantNb);
		assertEquals(1, medFanNb);
		assertEquals(1, polNb);
		assertEquals(3, sfNb);
		assertEquals(2, philNb);
		
	}
}
