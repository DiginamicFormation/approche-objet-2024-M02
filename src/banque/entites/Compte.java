package banque.entites;

public abstract class Compte {

	protected String numero;
	protected double solde;
	
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	/**
	 * Méthode qui permet de calculer le nouveau solde
	 * du compte en fin d'année
	 */
	public abstract void calculerSoldeFinAnnee();

	@Override
	public String toString() {
		return "numero=" + numero + ", solde=" + solde;
	}

	public String getNumero() {
		return numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
