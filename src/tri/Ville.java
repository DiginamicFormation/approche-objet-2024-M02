package tri;

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
