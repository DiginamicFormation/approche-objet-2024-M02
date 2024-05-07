package testinterfaces.entites;

public class Oiseau extends Animal {

	public Oiseau(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public final void seReproduire() {
		System.out.println("Les oiseaux se reproduisent tous de manière sexuée.");

	}

}
