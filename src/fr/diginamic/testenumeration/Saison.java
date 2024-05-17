package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);

	private String libelle;
	private int numero;
	
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}
	
	public static Saison extraireSaisonParLibelle(String libelle) {
		
		Saison[] saisons = values();
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return libelle +" "+ numero;
	}

	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Getter pour numero
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
}
