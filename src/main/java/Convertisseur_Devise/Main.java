package Convertisseur_Devise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Convertisseur convertisseur = new Convertisseur(Devise.USD);

		
		System.out.print(convertisseur.Convertit(1000));
		
	}
	
}
