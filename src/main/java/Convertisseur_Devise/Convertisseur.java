package Convertisseur_Devise;

public class Convertisseur {
	public Devise Monnaie;
	
	Convertisseur (Devise Monnaie) {
		if (Monnaie == null) {
			throw new IllegalArgumentException("Monnaie ne doit pas être NULL.");
		}
		this.Monnaie = Monnaie;
	}
	
	public double Convertit (double dollar) {
		
		double tauxEur = 0.9188, tauxJpy =  0.0068, tauxLivre = 1.2702, tauxUsd = 1;
		double devise = 0;
		
			switch (Monnaie) {
			
			case LIVRE : devise = tauxLivre;
				break;
			case JPY : devise = tauxJpy;
				break;
			case EUR : devise = tauxEur;
				break;
			case USD : devise = tauxUsd;
				break;
			}
		return  dollar * devise;
//String.valueOf(dollar);
// Le String.ValueOf() me permet de transformer la valeur INT en STRING.
		
	}
	
}

