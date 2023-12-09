package Convertisseur_Alphabet;

public class Conversion_Alphabet{
	
	public Alphabet Langage;

	Conversion_Alphabet (Alphabet Langage) {
			if (Langage == null) {
				throw new IllegalArgumentException("This Langage cannot be NULL");
			}
			this.Langage = Langage;
	}
	
	public static float Convertir (float NbPagesAConvertir, Alphabet Langage) {
		NbPagesAConvertir = 100;
		
			switch (Langage) {
		
				case LATIN : {
						return NbPagesAConvertir * 1;
				}
				case ARABE : {
						return NbPagesAConvertir * 0.5f;
				}	
				case CYRILLIQUE : {
						return (float) (NbPagesAConvertir * 1.5);
				}	
				case IDEOGRAMME : {
						return NbPagesAConvertir * 2;
				}
				default :
					return 0.f;
						
			}
			
			
	}
	
}


