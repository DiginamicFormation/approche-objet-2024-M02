package utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Fournit des méthodes utilitaires pour le traitement et la génération de
 * fichiers CSV
 */
public final class CsvUtils {

	/**
	 * Sérialise une liste d'objets.<br>
	 * Chaque objet est sérialisé sous forme d'une chaine de caractères au format
	 * CSV en utilisant le séparateur passé en paramètre.
	 * <p>
	 * Le paramètre appliqueAnnotation sert à déterminer s'il faut appliquer les
	 * annotations @Csv ou non. <br>
	 * Dans le cas où elles sont appliquées, seuls les attributs portant
	 * l'annotation @Csv sont sérialisés, sinon ils le sont tous.
	 * 
	 * @param objets             objets à sérialiser
	 * @param separateur         séparateur à utiliser
	 * @param appliqueAnnotation base la sérialisation sur la présence de @Csv
	 * @return List de String
	 */
	public static <T> List<String> toCsv(List<T> objets, String separateur, boolean appliqueAnnotation) {

		Class<?> classe = null;
		List<String> liste = new ArrayList<>();
		for (T objet : objets) {
			if (classe == null) {
				classe = objet.getClass();
			}
			Field[] fields = classe.getDeclaredFields();
			if (liste.isEmpty()) {
				StringBuilder builderLigneEntete = new StringBuilder();
				for (Field f : fields) {
					if (f.isAnnotationPresent(Csv.class)) {
						Csv csv = f.getAnnotation(Csv.class);
						builderLigneEntete.append(csv.colonne()).append(separateur);
					}
				}
				liste.add(builderLigneEntete.toString());
			}

			liste.add(toCsv(objet, separateur, appliqueAnnotation));
		}
		return liste;
	}

	/**
	 * Sérialise l'objet au format CSV avec le séparateur passé en paramètre.<br>
	 * Par exemple en supposant que je passe en paramètre une instance de Ville avec
	 * 2 attributs nom=Pau et pop=9700, avec le séparateur ; le résultat obtenu sera
	 * :<br>
	 * Pau;9700;
	 * <p>
	 * Le paramètre appliqueAnnotation sert à déterminer s'il faut appliquer les
	 * annotations @Csv ou non. <br>
	 * Dans le cas où elles sont appliquées, seuls les attributs portant
	 * l'annotation @Csv sont sérialisés, sinon ils le sont tous.
	 * 
	 * @param objet              objet à sérialiser
	 * @param separateur         séparateur à utiliser
	 * @param appliqueAnnotation base la sérialisation sur la présence de @Csv
	 * @return String
	 */
	public static <T> String toCsv(T objet, String separateur, boolean appliqueAnnotation) {
		Class<?> classe = objet.getClass();
		Field[] fields = classe.getDeclaredFields();
		StringBuilder builderLigneCsv = new StringBuilder();
		for (Field field : fields) {
			if ((appliqueAnnotation && field.isAnnotationPresent(Csv.class)) || !appliqueAnnotation) {
				// permet de forcer la lecture d'un attribut privé
				field.setAccessible(true);

				try {
					// field.get(objet) : permet d'extraire la valeur de l'attribut pour l'instance
					// objet
					builderLigneCsv.append(field.get(objet)).append(separateur);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
		}
		return builderLigneCsv.toString();
	}

}
