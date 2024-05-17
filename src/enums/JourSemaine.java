package enums;

public enum JourSemaine {

	LUNDI("Lundi", 1), 
	MARDI("Mardi", 2), 
	MERCREDI("Mercredi", 3), 
	JEUDI("Jeudi", 4),
	VENDREDI("Vendredi", 5), 
	SAMEDI("Samedi", 6), 
	DIMANCHE("Dimanche", 7); 
	
	/** Nom du jour (lundi à dimanche) */
	private String nom;
	
	/** numéro du jour de 1 à 7 */
	private int numero;
	
	/** Constructeur
	 * @param nom nom
	 * @param numero numéro du jour de 1 à 7
	 */
	private JourSemaine(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return nom+" "+numero;
	}
	
	public void direBonjour() {
		
	}
	
	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Getter pour numero
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

}
