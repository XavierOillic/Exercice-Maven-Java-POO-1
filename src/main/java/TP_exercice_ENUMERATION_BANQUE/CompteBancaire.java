package TP_exercice_ENUMERATION_BANQUE;


public class CompteBancaire {
	 public TypeDeCompte EnumJeChoisiceMot; //Il faut d'abord nommer l'ENUM et ensuite inscrire son type.
	 public String firstName;
	 public int rate;
	 
	 CompteBancaire (TypeDeCompte EnumJeChoisiceMot, String firstNameParam, int rate) {
		 if (EnumJeChoisiceMot == null || firstNameParam == null) 
			 if (firstNameParam.isBlank()){
				 throw new IllegalArgumentException();
		 } 
		 if (rate < 0) {
			 throw new IllegalArgumentException();
		 }
		
		 this.EnumJeChoisiceMot= EnumJeChoisiceMot;
		 this.firstName = firstNameParam;
		 this.rate = rate;
	 }

	
}
