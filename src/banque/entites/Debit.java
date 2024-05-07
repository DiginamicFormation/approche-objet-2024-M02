package banque.entites;

public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	public double calculerTotal(double total) {
		return total-getMontant();
	}
	
	@Override
	public String getType() {
		return "DEBIT";
	}
}
