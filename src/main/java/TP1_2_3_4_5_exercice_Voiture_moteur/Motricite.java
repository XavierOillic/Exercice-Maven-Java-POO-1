package TP1_2_3_4_5_exercice_Voiture_moteur;

public class Motricite {
	
	public Boolean enRoute;
	public Integer vitesse;
	public Integer vitesseMax; //Le INT devenu INTEGER fait qu'il n'est plus primitif.
	
	public void accelerer () {
		if (enRoute == true) {
			vitesse+=10;
			if (vitesse > vitesseMax) {
				throw new RuntimeException("Too fast !");
				
			}
		}
	}
	
	public void decelerer () {
		if (enRoute == true) {
			vitesse -= 10;
			if (vitesse < 0) {
				throw new RuntimeException("Too slow!");
			}
		}
	}
	public void arreter () {
		if (enRoute == false) {
			vitesse += 100;
			if (vitesse > 0 ) {
				throw new RuntimeException("Moteur BBOOOOOMMMMM!");
			}
		}
	}
}
