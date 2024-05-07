package testinterfaces.entites;

import testinterfaces.interfaces.Aquatique;
import testinterfaces.interfaces.Chasseur;

/**
 * 
 */
public class Dauphin extends Mammifere implements Chasseur, Aquatique {

	/** 
	 * @param poids
	 * @param nom
	 */
	public Dauphin(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public void chasser() {
		System.out.println("Je chasse des bancs de poissons en groupe.");
	}

	@Override
	public void nager() {
		System.out.println("Je nage avec ma queue puissante et des nageoires.");
	}

	@Override
	public void respirer() {
		System.out.println("Je dois reprendre ma respiration régulièrement à la surface grâce à un event situé sur le dessus de mon crane.");
	}
}
