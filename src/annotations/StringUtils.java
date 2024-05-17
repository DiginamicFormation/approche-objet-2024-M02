package annotations;

import java.lang.reflect.Field;

public class StringUtils {

	public static String toString(Object o) {
		StringBuilder builder = new StringBuilder();

		// On récupère la classe de l'instance courante (Pays)
		Class<?> classe = o.getClass();

		// On récupère la liste des attributs déclarées dans cette classe.
		Field[] attributs = classe.getDeclaredFields();

		for (Field attribut : attributs) {

			// On regarde si l'attribut possède l'annotation ToString ou non
			if (attribut.isAnnotationPresent(ToString.class)) {

				// Cela permet d'accéder à l'attribut en lecture même s'il est privé
				attribut.setAccessible(true);

				ToString annotation = attribut.getAnnotation(ToString.class);
				boolean mettreEnMaj = annotation.uppercase();
				String separateur = annotation.separateur();

				Object valeurAttribut = null;
				try {
					// Récupération de la valeur de l'attribut de l'objet courant
					valeurAttribut = attribut.get(o);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}

				// Si la valeur de l'attribut est non null et que mettreEnMaj vaut true
				if (valeurAttribut != null && mettreEnMaj) {
					valeurAttribut = valeurAttribut.toString().toUpperCase();
				}

				// On ajoute à la chaine de caractère la valeur de l'attribut suivie du
				// séparateur
				builder.append(valeurAttribut).append(separateur);

			}
		}
		return builder.toString();
	}

}
