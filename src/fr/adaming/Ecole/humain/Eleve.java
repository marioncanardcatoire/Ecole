package fr.adaming.Ecole.humain;

public class Eleve extends Humain {

	String classe;
	int niveau; 

	
	
	public void apprendre() {
		System.out.println("J'apprends mes cours");
	}



	@Override
	public String toString() {
		return "Eleve [classe=" + classe + ", niveau=" + niveau + ", nom=" + nom + ", prénom=" + prénom + ", age=" + age
				+ ", adresse=" + adresse + ", sex=" + sex + "]";
	}
	
	
}
