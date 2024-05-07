package testinterfaces.entites;

import testinterfaces.interfaces.Chasseur;

public class Requin extends Poisson implements Chasseur {

	public Requin(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public void chasser() {
		System.out.println("Je chasse la nuit en solo");
		
	}

	@Override
	public void nager() {
		System.out.println("Je nage au moyen de ma queue puissante et de mes nageoires");
		
	}

	@Override
	public void respirer() {
		System.out.println("Je respire via des branchies.");
		
	}

}
