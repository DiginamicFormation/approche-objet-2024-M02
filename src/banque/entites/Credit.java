package banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	public double calculerTotal(double total) {
		return total+getMontant();
	}

	@Override
	public String getType() {
		return "CREDIT";
	}
}
