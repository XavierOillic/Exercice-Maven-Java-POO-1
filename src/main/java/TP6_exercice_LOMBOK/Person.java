package TP6_exercice_LOMBOK;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@Getter
@Setter

public class Person {
	

	
	Person (){
		/*setPrenom(prenom);
		setNom(nom);
		setAge(age);
		setTaille(taille);
		setPoid(poid);*/
		
	}
	
	 private String prenom = "Xavier";
	 private String nom = "Oillic";
	 private int age = 43;
	 private int taille = 186;
	 private int poid = 89;
	 private Boolean enVie = true;
	
}
