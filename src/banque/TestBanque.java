package banque;

import banque.entites.Compte;
import banque.entites.CompteCourant;
import banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		CompteCourant cpt1 = new CompteCourant("564156561SSKJH", 2500.0);
		CompteTaux cpt2 = new CompteTaux("564156561SSKJI", 15000.0, 2.2);
		
		Compte[] comptes = {cpt1, cpt2};
		
		for (int i = 0; i < comptes.length; i++) {
			comptes[i].calculerSoldeFinAnnee();
			System.out.println(comptes[i]);
		}
		
	}
	
	public static void genererPdf(Compte cpt) {
		
		//TODO Utiliser la librairie iText pour générer le PDF
	}
	
}
