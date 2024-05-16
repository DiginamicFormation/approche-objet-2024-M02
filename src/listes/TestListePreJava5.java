package listes;

import java.util.ArrayList;
import java.util.Date;

/**
 * Montre un exemple d'utilisation de liste comme cela se faisait avant Java 5.
 */
public class TestListePreJava5 {

	public static void main(String[] args) {

		// Avant Java 5, on pouvait mettre n'importe quoi dans une ArrayList
		ArrayList liste = new ArrayList();
		liste.add(12);
		liste.add("coucou");
		liste.add(new Date());

		// Récupération dans la liste : on devait caster ce qu'on extrayait de la liste,
		// avec la risque de se tromper dans les cast.

		Integer valeur = (Integer) liste.get(0);
		String chaine = (String) liste.get(1);
		Date date = (Date) liste.get(2);

	}

}
