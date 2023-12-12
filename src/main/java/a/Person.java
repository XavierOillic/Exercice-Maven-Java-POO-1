package a;

public class Person {
	private String prenom;
	private String nom;
	private int age;
	
	Person (String prenom, String nom, int age ){
		this.setPrenom(nom);
		this.setNom(nom);
		this.setAge(age);
	}
	

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		if(prenom == null) {
			throw new IllegalArgumentException("");
		}
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if(nom == null) {
			throw new IllegalArgumentException("");
		}
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("");
		}
		this.age = age;
	}

}
