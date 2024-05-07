package testinterfaces.entites;

public abstract class Animal {

	private int poids;
	private String nom;
	
	public Animal(int poids, String nom) {
		super();
		this.poids = poids;
		this.nom = nom;
	}
	
	public abstract void seReproduire();
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
