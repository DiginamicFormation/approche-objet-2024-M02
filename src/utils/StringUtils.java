package utils;

/**
 * Classe utilitaire pour la manipulation/génération de chaines de car.
 * Voir la classe Ville qui utilise cette classe pour la génération de sa méthode toString()
 */
public final class StringUtils {

	/** Cette méthode concatène en chaine de caractères une liste d'informations 
	 * @param objets informations à concaténer
	 * @return String
	 * @throws ConcatenationException dans le cas où le paramètre objets a une taille nulle
	 */
	public static String toString(String separateur, Object... objets) throws ConcatenationException {
		
		if (objets.length == 0) {
			throw new ConcatenationException("Vous devez concaténer au moins 1 information.");
		}

		// Ici objets est un tableau
		// Il peut donc se parcourir avec boucle indexée ou non indexée (comme
		// ci-dessous) mais pas avec un Iterator.
		StringBuilder builder = new StringBuilder();
		for (Object obj : objets) {
			builder.append(obj).append(separateur);
		}
		return builder.toString();
	}
	
	/** Cette méthode convertit une chaine de caractères qui contient un nombre en int
	 * Si la chaine de caractères contient des espaces, ces derniers sont supprimés.
	 * @param chaine chaine à convertir en int
	 * @return int
	 */
	public static int parseInt(String chaine) {
		if (chaine.contains(" ")) {
			chaine = chaine.replaceAll(" ", "");
		}
		return Integer.parseInt(chaine);
		
	}
}
