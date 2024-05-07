package banque.entites;

public class CompteCourant extends Compte {

	public CompteCourant(String numero, double solde) {
		super(numero, solde);
	}
	
	@Override
	public void calculerSoldeFinAnnee() {
		// On ne fait rien dans le cas d'un compte courant
	}
}
