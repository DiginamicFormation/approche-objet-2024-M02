package annotations;
public class Pays implements Comparable<Pays> {

	/** nom */
	@ToString(uppercase = true, separateur = " -> ")
	private String nom;

	/** nbHabitants */
	@ToString(separateur = " millions. ")
	private Long nbHabitants;

	/** pibParHabitant */
	@ToString(separateur = " $/hab.")
	private long pibParHabitant;

	/**
	 * Constructor
	 * 
	 * @param nom            nom
	 * @param nbHabitants
	 * @param pibParHabitant
	 */
	public Pays(String nom, long nbHabitants, long pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public int compareTo(Pays autre) {

		// Cette méthode utilise la méthode compareTo de la classe String qui retourne
		// un nombre > 0, <0 ou 0 suivant l'ordre alphabétique relatif
		return this.nom.compareTo(autre.getNom());
	}

	@Override
	public String toString() {
		return StringUtils.toString(this);

	}

	/**
	 * Fournit le calcul du PIB total
	 * 
	 * @return double
	 */
	public long getPibTotal() {
		return pibParHabitant * nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the pibParHabitant
	 */
	public long getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(long pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

}