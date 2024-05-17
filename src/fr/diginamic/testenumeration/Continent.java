package fr.diginamic.testenumeration;

public enum Continent {
	
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	AMERIQUE("Amérique"),
	EUROPE("Europe"),
	OCEANIE("Océanie");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

}
