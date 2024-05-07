package banque;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("02/05/2024", 1500.0);
		operations[1] = new Debit("03/05/2024", 125.5);
		operations[2] = new Debit("03/05/2024", 28.8);
		operations[3] = new Credit("05/05/2024", 100.0);
		
		
		int[] entiers = {8, -8, 7};
		for (int a : entiers) {
			System.out.println(a);
		}
		
		
		// boucle non indexée / boucle objet
		for (Operation op : operations) {
			System.out.println(op);
		}
		System.out.println("------------------------");
		
		double total = 0.0;
		
		// Utilisation d'une méthode pour calculer le total
		for (int i = 0; i < operations.length; i++) {
			total = operations[i].calculerTotal(total);
		}
		System.out.println(total);
	}

}
