package fr.adaming.Ecole.humain;

public class Eleve extends Humain {

	String classe;
	int niveau; 

	
	
	public void apprendre() {
		System.out.println("J'apprends mes cours");
	}



	@Override
	public String toString() {
		return "Eleve [classe=" + classe + ", niveau=" + niveau + ", nom=" + nom + ", pr�nom=" + pr�nom + ", age=" + age
				+ ", adresse=" + adresse + ", sex=" + sex + "]";
	}
	
	
}
