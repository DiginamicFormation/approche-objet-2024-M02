package banque.entites;

public class CompteTaux extends Compte {

	/** Taux de rémunération */
	private double taux;

	public CompteTaux(String numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}
	
	@Override
	public void calculerSoldeFinAnnee() {
		this.solde = this.solde * (1+taux/100.0);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", taux=" + taux;
	}
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
}
