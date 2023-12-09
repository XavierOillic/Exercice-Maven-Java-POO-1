package TP1_exercice_BAGNOLLE;

import java.lang.reflect.UndeclaredThrowableException;

public class Moteur {
	
	public boolean enRoute;
	public Integer vitesse;
	public Integer vitesseDouce;
	public Integer vitesseMax;
	public Moteur moteur;
	
	//public Moteur motoMoteur;
	//public Moteur camionMoteur;
	public Moteur (Moteur moteur) {
		if (moteur == null) {
			throw new IllegalArgumentException();
		}
		this.moteur = moteur;
	}
	
	public Moteur (boolean enRoute) {
		this.enRoute = enRoute;
	}
	
	public Moteur(boolean enRoute, Integer vitesse) {
		this(enRoute);
		this.vitesse = vitesse;
	}
	
	public Moteur(boolean enRoute, Integer vitesse, Integer vitesseDouce) {
		this(enRoute, vitesse);
		this.vitesseDouce = vitesseDouce;
	}
	
	public Moteur (boolean enRoute, Integer vitesse, Integer vitesseDouce, Integer vitesseMax) {
		this(enRoute, vitesse, vitesseDouce);
		
		if (vitesse < 0 || vitesseDouce < 0 || vitesseMax < 0 ) {
			throw new IllegalArgumentException();
		}	// Je vérifie que mes Arguments n'ont pas de mauvaises valeurs, en tout de debut de declarations pour une nouvelle instanciation
		
		this.vitesseMax = vitesseMax;

	}

	
	// En VERT, les METHODES. Des actions a faire pour les classes qui les appelent.
	public void accelerer () {
		if (enRoute == true) {
			if (vitesse > vitesseMax) {
				throw new RuntimeException("Too Fast !");
				}
			vitesse += 30; //sinon...vitesse + 10
				
		}
	}
	
	public void decelerer () {
		if (enRoute == true) {
			if (vitesse < vitesseDouce) {
				throw new RuntimeException("Too Slow !!!");
			}
			vitesse -= 30; //sinon vitesse -10.
				
		}
	}
	
	
	public void seTrainer () {
		if (enRoute == true) {
			vitesseDouce = 40;
			if (enRoute == true) {
				if (vitesseDouce <= 70) {
					throw new RuntimeException("Passe la Seconde, Casse-Couille !");
				}
			} 
		}
	}
	
	

}
