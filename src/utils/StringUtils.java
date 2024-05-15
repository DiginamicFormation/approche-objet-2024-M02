package utils;

/**
 * Classe utilitaire pour la manipulation/génération de chaines de car.
 * Voir la classe Ville qui utilise cette classe pour la génération de sa méthode toString()
 */
public final class StringUtils {

	/** Méthode qui concatène des informations de différentes natures (String, double, etc.) pour générer une String
	 * @param objets informations à concaténer
	 * @return String
	 */
	public static String toString(Object... objets) {

		// Ici objets est un tableau
		// Il peut donc se parcourir avec boucle indexée ou non indexée (comme
		// ci-dessous) mais pas avec un Iterator.
		StringBuilder builder = new StringBuilder();
		for (Object obj : objets) {
			builder.append(obj);
		}
		return builder.toString();
	}

}
