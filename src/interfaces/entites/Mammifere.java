package interfaces.entites;

public class Mammifere extends Animal {

	public Mammifere(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public final void seReproduire() {
		System.out.println("Les mammifères se reproduisent tous de manière sexuée.");

	}

}
