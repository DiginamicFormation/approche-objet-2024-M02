package equals;

public class TestEqualsString {

	public static void main(String[] args) {

		// Stockage dans la String pool !!
		String ch1 = "Bonjour"; // Bonjour est stocké à l'adresse 1 dans la String pool
		String ch2 = "Bonjour"; // ch2 référence la même adresse 1
		
		// Ne fonctionne que pour les chaines créées avec l'opérateur " donc A EVITER !!!
		if (ch1 == ch2) {
			System.out.println("les chaines sont identiques");
		}
		else {
			System.out.println("les chaines sont différentes");
		}
		
		// UTILISEZ la méthode equals :
		if (ch1.equals(ch2)) {
			System.out.println("les chaines sont identiques");
		}
		else {
			System.out.println("les chaines sont différentes");
		}
	}

}
