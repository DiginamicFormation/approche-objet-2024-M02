package interfaces.entites;

public class Poisson extends Animal {

	public Poisson(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public void seReproduire() {
		System.out.println("Les poissons se reproduisent en général de manière sexuée.");

	}

}
