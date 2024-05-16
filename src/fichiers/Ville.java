package fichiers;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

import utils.Csv;
import utils.StringUtils;

/**
 * Cette classe représente le concept de Ville
 */
public class Ville implements Comparable<Ville> {

	/** Nom de la région */
	private String nomRegion;
	
	/** Code département */
	@Csv(colonne = "Code département")
	private String codeDept;
	
	/** Nom de la commune */
	@Csv(colonne = "Nom de la commune")
	private String nom;

	/** Population */
	@Csv(colonne = "Pop")
	private int pop;
	
	/** 
	 * Nombre de régions
	 */
	public static final int NB_REGIONS = 17;

	/** Constructeur
	 * @param nomRegion nom de la région
	 * @param codeDept code du département
	 * @param nom nom de la commune
	 * @param pop population
	 */
	public Ville(String nomRegion, String codeDept, String nom, int pop) {
		super();
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.nom = nom;
		this.pop = pop;
	}

	@Override
	public int compareTo(Ville o) {
		
		Collator collatorFr = Collator.getInstance(Locale.FRANCE);
		return collatorFr.compare(this.nom, o.getNom());
	}
	
	@Override
	public String toString() {
		return StringUtils.toString("nomRegion=", nomRegion, " - codeDept=", codeDept, " - nom=", nom, " - pop=", pop);
	}
	
	@Override
	public boolean equals(Object object) {
		
		// Si object n'est pas une Ville, je retourne false
		if (!(object instanceof Ville)) {
			return false;
		}
		
		// Cast permet de transformer object en Ville
		Ville autre = (Ville)object;		
		return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.pop, autre.getPop());
	}

	/** Désormais, merci d'utiliser la classe CsvUtils pour générer cette ligne.
	 * Cette méthode sera supprimée dans la version 1.2 de l'application
	 * @return String
	 */
	@Deprecated
	public String toCsv() {
		return nomRegion+";"+codeDept+";"+nom+";"+pop;
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

	/** Getter pour pop
	 * @return the pop
	 */
	public int getPop() {
		return pop;
	}

	/** Setter pour pop
	 * @param pop the pop to set
	 */
	public void setPop(int pop) {
		this.pop = pop;
	}
}
