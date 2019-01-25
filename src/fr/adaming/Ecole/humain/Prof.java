package fr.adaming.Ecole.humain;

public class Prof extends Humain {

	int salaire;
	String diplome;
	
/*constructeur using file source clique droit*/
	
	public Prof(int salaire, String diplome) {
		super();
		this.salaire = salaire;
		this.diplome = diplome;
		
	}

	public Prof(int salaire) {
		super();
		this.salaire = salaire;
	}

	public Prof() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void enseigner() {
	System.out.println("J'enseigne");
	
	}

	@Override
	public String toString() {
		return "Prof [salaire=" + salaire + ", diplome=" + diplome + ", nom=" + nom + ", prénom=" + prénom + ", age="
				+ age + ", adresse=" + adresse + ", sex=" + sex + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}