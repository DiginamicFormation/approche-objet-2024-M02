package testinterfaces.entites;

import testinterfaces.interfaces.Aquatique;

public abstract class Poisson extends Animal implements Aquatique {

	public Poisson(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public void seReproduire() {
		System.out.println("Les poissons se reproduisent en général de manière sexuée.");

	}

}
