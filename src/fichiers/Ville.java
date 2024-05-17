package fichiers;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

import annotations.Column;
import annotations.Table;
import utils.StringUtils;

/**
 * Cette classe représente le concept de Ville
 */
@Table(name="VILLES")
public class Ville implements Comparable<Ville> {

	/** Nom de la région */
	@Column(name = "NOM_REGION", length=3)
	private String nomRegion;
	
	/** Code département */
	@Column(name = "NOM_REGION")
	private String codeDept;
	
	/** Nom de la commune */
	@Column(name = "NOM")
	private String nom;

	/** Population */
	@Column(name = "POP")
	private int population;
	
	/** 
	 * Nombre de régions
	 */
	public static final int NB_REGIONS = 17;

	/** Constructeur
	 * @param nomRegion nom de la région
	 * @param codeDept code du département
	 * @param nom nom de la commune
	 * @param population population
	 */
	public Ville(String nomRegion, String codeDept, String nom, int population) {
		super();
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.nom = nom;
		this.population = population;
	}
	
	/** Désormais, merci d'utiliser la classe CsvUtils pour générer cette ligne.
	 * Cette méthode sera supprimée dans la version 1.2 de l'application
	 * @return String
	 */
	public String toCsv() {
		return nomRegion+";"+codeDept+";"+nom+";"+population;
	}

	@Override
	public int compareTo(Ville o) {
		
		Collator collatorFr = Collator.getInstance(Locale.FRANCE);
		return collatorFr.compare(this.nom, o.getNom());
	}
	
	@Override
	public String toString() {
		return StringUtils.toString("nomRegion=", nomRegion, " - codeDept=", codeDept, " - nom=", nom, " - population=", population);
	}
	
	@Override
	public boolean equals(Object object) {
		
		// Si object n'est pas une Ville, je retourne false
		if (!(object instanceof Ville)) {
			return false;
		}
		
		// Cast permet de transformer object en Ville
		Ville autre = (Ville)object;		
		return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.population, autre.getPopulation());
	}

	/** Getter pour nomRegion
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter pour nomRegion
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter pour codeDept
	 * @return the codeDept
	 */
	public String getCodeDept() {
		return codeDept;
	}

	/** Setter pour codeDept
	 * @param codeDept the codeDept to set
	 */
	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour population
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter pour population
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
}
