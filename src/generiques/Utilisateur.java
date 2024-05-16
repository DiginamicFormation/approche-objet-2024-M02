package generiques;

import java.util.Date;
import java.util.List;

public class Utilisateur<T extends Number, U extends List> {
	
	private T identifiant;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private U roles;
	
	public Utilisateur(T identifiant, String nom, String prenom, Date dateNaissance) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Utilisateur [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + "]";
	}

	/** Getter pour identifiant
	 * @return the identifiant
	 */
	public T getIdentifiant() {
		return identifiant;
	}

	/** Setter pour identifiant
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(T identifiant) {
		this.identifiant = identifiant;
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

	/** Getter pour prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour dateNaissance
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/** Setter pour dateNaissance
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
