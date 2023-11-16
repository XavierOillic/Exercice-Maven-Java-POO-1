package TP1_exercice_BAGNOLLE;

import java.lang.reflect.UndeclaredThrowableException;

public class Moteurs {
	
	public boolean enRoute;
	public Integer vitesse;
	public Integer vitesseDouce;
	public Integer vitesseMax;
	
	Moteurs (boolean enRoute, Integer vitesse, Integer vitesseDouce, Integer vitesseMax) {
		this.enRoute = enRoute;
		this.vitesse = vitesse;
		this.vitesseDouce = vitesseDouce;
		this.vitesseMax = vitesseMax;
	}
	
	public void accelerer () {
		if (enRoute == true) {
			vitesse += 50;
				if (vitesse > vitesseMax) {
				throw new RuntimeException("Too Fast !");
				}
		}
	}
	
	public void decelerer () {
		if (enRoute == true) {
			vitesse -= 20;
				if (vitesse < vitesseDouce) {
					throw new RuntimeException("Too Slow !!!");
				}
		}
	}
	
	public void seTrainer () {
		if (enRoute == true) {
			vitesseDouce = 40;
			if (enRoute == true) {
				vitesseDouce = 70;
			} throw new RuntimeException("Passe la Seconde, Casse-Couille !");
		}
	}

}
