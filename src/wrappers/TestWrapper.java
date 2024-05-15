package wrappers;

import java.util.ArrayList;

public class TestWrapper {

	public static void main(String[] args) {
		System.out.println(Float.MIN_VALUE);

		String chaine = "12 512.56";
		double valeur = Double.parseDouble(chaine.replaceAll(" ", ""));

		System.out.println(valeur);

		ArrayList<Float> maListe = new ArrayList<>();
		maListe.add(12.5f);

		Float f = 12.5f; // sans utiliser l'opérateur new : autoboxing
		float g = f + 2; // unboxing : permet de traiter un wrapper comme un type primitif pour les
							// opérations arith et de comparaison.

		if (f > 2) {

		}
	}

}
