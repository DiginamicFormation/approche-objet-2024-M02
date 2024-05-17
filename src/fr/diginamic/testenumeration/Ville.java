package fr.diginamic.testenumeration;

import java.util.Objects;

import utils.StringUtils;

public class Ville {

	private String nom;
	private double nbHabs;
	private Continent continent;
	
	public Ville(String nom, double nbHabs, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabs = nbHabs;
		this.continent = continent;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// Je teste et je caste en une seule ligne (Java 17)
		if (obj instanceof Ville autre) {
			
			return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.nbHabs, autre.getNbHabs()) && Objects.equals(this.continent, autre.getContinent());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return StringUtils.toString(" ", nom, nbHabs, continent);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNbHabs() {
		return nbHabs;
	}
	public void setNbHabs(double nbHabs) {
		this.nbHabs = nbHabs;
	}

	/** Getter pour continent
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/** Setter pour continent
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
}
