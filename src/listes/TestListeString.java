package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		Collections.addAll(liste, "Nice", "Lyon", "Foix", "Pau", "Narbonne", "Marseille", "Tarbes", "Carcassonne");

		String max = "";
		for (int i=0; i<liste.size(); i++) {
			String nom = liste.get(i);
			if (nom.length() > max.length()) {
				max = nom;
			}
		}
		
		System.out.println(max);
		
		// METTRE LES NOMS EN MAJ
		for (int i=0; i<liste.size(); i++) {
			String nom = liste.get(i);
			liste.set(i, nom.toUpperCase());
		}
		System.out.println(liste);
		
		// SUPPRIMER LES NOMS DE VILLES QUI COMMENCENT PAR N
		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			String nom = iter.next();
			if (nom.startsWith("N")) {
				iter.remove();
			}
		}
		System.out.println(liste);
	}

}
