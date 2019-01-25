package fr.adaming.Ecole.humain;

public class Ecole {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Eleve leMeilleur = new Eleve(); 
	Eleve lePire = new Eleve(); 
	Eleve leTricheur = new Eleve(); 
	
	Prof leProf = new Prof(); 
	Prof leProfMaths = new Prof(2500, "Master de mathematiques"); 
	Prof leProfTechno = new Prof(2100); 
	
	leProfMaths.adresse="24 rue des Multiplications";
	leProfMaths.age=26;
	leProfMaths.nom="Herbert";
	leProfMaths.prénom="Lucien"; 
	leProfMaths.sex='M';
	leProfMaths.enseigner();
	leMeilleur.apprendre();
	
		
	System.out.println(leProfMaths.toString());
	System.out.println(leMeilleur.toString());
	
	}
}