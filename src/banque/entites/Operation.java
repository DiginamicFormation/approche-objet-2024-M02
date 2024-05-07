package banque.entites;

public abstract class Operation {

	private String date;
	private double montant;

	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	public abstract String getType();
	
	public abstract double calculerTotal(double total);

	@Override
	public String toString() {
		return "date=" + date + ", montant=" + montant + ", type=" + getType();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

}
