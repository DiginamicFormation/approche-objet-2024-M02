package fichiers;

import fichiers.csv.Csv;
import utils.StringUtils;

public class Ville implements Comparable<Ville> {

	@Csv(enteteColonne = "Nom de la région")
	private String nomRegion;
	
	private String codeDept;
	
	@Csv(enteteColonne = "Nom de la commune")
	private String nom;
	
	@Csv(enteteColonne = "Pop")
	private int pop;
	
	public Ville(String nomRegion, String codeDept, String nom, int pop) {
		super();
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.nom = nom;
		this.pop = pop;
	}

	@Override
	public int compareTo(Ville o) {
		return this.nom.compareTo(o.getNom());
	}
	
	@Override
	public String toString() {
		return StringUtils.toString("nomRegion=", nomRegion, " - codeDept=", codeDept, " - nom=", nom, " - pop=", pop);
	}

	/** Désormais, merci d'utiliser la classe CsvUtils pour générer cette ligne.
	 * Cette méthode sera supprimée dans la version 1.2 de l'application
	 * @return String
	 */
	@Deprecated
	public String toCsv() {
		return nomRegion+";"+codeDept+";"+nom+";"+pop;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}


}
