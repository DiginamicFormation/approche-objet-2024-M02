package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		/*
		 * POUR REMPLIR la liste OPTION 1 :
		 */
		Collections.addAll(liste, "Nimes", "Agen", "Angers", "Nantes", "Montpellier", "Amiens", "Paris");
		/*
		 * OU OPTION 2 :
		 */
		liste.clear();
		liste.add("Nimes");
		liste.add("Agen");
		liste.add("Angers");
		liste.add("Nantes");
		liste.add("Montpellier");
		liste.add("Amiens");
		liste.add("Paris");

		// Mettre en MAJ toutes les villes dont le nom commence par A
		// Avec la méthode set(i, ...)
		for (int i=0; i<liste.size(); i++) {
			String nom = liste.get(i);
			if (nom.startsWith("A")) {
				liste.set(i, nom.toUpperCase());
			}
		}
		
		// Supprimer toutes les villes dont le nom commence par A
		// ATTENTION ON UTILISE UN ITERATOR : java n'aime pas qu'on supprime des éléments dans une liste alors qu'il fait une boucle dessus
		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			String nom = iter.next();
			if (nom.startsWith("A")) {
				iter.remove();
			}
		}
		System.out.println(liste);
	}

}
