package equals;

import java.util.Date;

import tri.Ville;

public class TestEqualsVille {

	public static void main(String[] args) {
		Ville v1 = new Ville(null, 9700); // new choisit un emplacement mem pour stocker l'objet
		Ville v2 = new Ville(null, 9700);
		Ville v3 = new Ville("Paux", 9700);
		Ville v4 = new Ville("Pau", 9701);
		
		// Utilisation de == TOTALEMENT PROSCRIT !!!
		
		// Utilisation de equals
		if (v1.equals(v2)) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		
		// Utilisation de equals
		if (v1.equals(v3)) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		
		// Utilisation de equals
		if (v1.equals(v4)) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		
		// Utilisation de equals avec une Date
		if (v1.equals(new Date())) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		
		// Utilisation de equals avec null
		if (v1.equals(null)) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		
	}

}
