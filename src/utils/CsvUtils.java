package utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import fichiers.csv.Csv;

/**
 * Fournit des méthodes utilitaires pour le traitement et la génération de fichiers CSV
 */
public class CsvUtils {

	/** Transforme une liste d'objets en une liste de String.<br>
	 * Chaque String correspond à la sérialisation d'un objet au format CSV.
	 * 
	 * @param objets liste à sérialiser
	 * @return List de String
	 */
	public static <T> List<String> toCsv(List<T> objets) {
		StringBuilder builder = new StringBuilder();
		Class<?> classe = null;
		List<String> liste = new ArrayList<>();
		for (T objet : objets) {
			if (classe == null) {
				classe = objet.getClass();
			}
			Field[] fields = classe.getDeclaredFields();
			if (liste.isEmpty()) {
				String enteteColonne = "";
				for (Field f : fields) {
					if (f.isAnnotationPresent(Csv.class)) {
						Csv csv = f.getAnnotation(Csv.class);
						enteteColonne+=csv.enteteColonne()+";";
					}
				}
				liste.add(enteteColonne);
			}
			for (Field field : fields) {
				if (field.isAnnotationPresent(Csv.class)) {
					// permet de forcer la lecture d'un attribut privé
					field.setAccessible(true);
	
					// field.get(objet) : permet d'extraire la valeur de l'attribut pour l'instance objet
					try {
						builder.append(field.get(objet)).append(";");
					} catch (IllegalArgumentException | IllegalAccessException e) {
						throw new RuntimeException(e);
					} 
				}
			}
			liste.add(builder.toString());
			builder = new StringBuilder();
		}
		return liste;
	}
}
