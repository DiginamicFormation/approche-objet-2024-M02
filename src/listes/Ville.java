package listes;

import java.util.Objects;

public class Ville {

	private String nom;
	private int nbHabs;
	public Ville(String nom, int nbHabs) {
		super();
		this.nom = nom;
		this.nbHabs = nbHabs;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// Je teste et je caste en une seule ligne (Java 17)
		if (obj instanceof Ville autre) {
			
			return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.nbHabs, autre.getNbHabs());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabs=" + nbHabs + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbHabs() {
		return nbHabs;
	}
	public void setNbHabs(int nbHabs) {
		this.nbHabs = nbHabs;
	}
	
}
