package tri;

import java.util.Objects;

import utils.StringUtils;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHabs;
	
	public Ville(String nom, int nbHabs) {
		super();
		this.nom = nom;
		this.nbHabs = nbHabs;
	}
	
	@Override
	public boolean equals(Object object) {
		
		// Si object est une instance de Ville, je teste l'égalité des attributs
		if (object instanceof Ville) {
			Ville autre = (Ville)object;
			return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.nbHabs, autre.getNbHabs());
		}
		return false;		
	}
	
	@Override
	public int compareTo(Ville autre) {
		return -this.nom.compareTo(autre.getNom());
	}
	
	@Override
	public String toString() {
		return StringUtils.toString("nom=", nom, " - nbHabs=", nbHabs);
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
