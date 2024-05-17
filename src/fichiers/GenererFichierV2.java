package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;

import static utils.CsvUtils.toCsv;
import utils.StringUtils;
/**
 * V2 qui utilise une annotation @Csv positionnée sur les attributs de la classe
 * Ville pour générer le fichier CSV.
 * <p>
 * Seules les valeurs des attributs possédant cette annotation sont exportées
 * dans le fichier CSV.
 * <p>
 * De plus le tri utilise une classe VilleComparateur offrant 4 possibilités de
 * tri.
 */
public class GenererFichierV2 {

	/**
	 * Méthode main
	 * 
	 * @param args non utilisés ici
	 * @throws IOException si le fichier recensement n'existe pas ou si le fichier
	 *                     de destination n'est pas accessible
	 */
	public static void main(String[] args) throws IOException {

		// Les paramètres : à externaliser dans un fichier de CONF
		String repertoireTravail = "C:/Temp/Work/";
		String nomFichierOrigine = "recensement.csv";
		String nomFichierDestination = "recensementOut.csv";
		String separateur = ";";
		final int populationMin = 30000;

		// Lecture du fichier CSV
		Path pathOri = Paths.get(repertoireTravail + nomFichierOrigine);
		List<String> lignes = Files.readAllLines(pathOri);

		// Suppression de la 1ère ligne contenant les entêtes de colonnes
		lignes.remove(0);

		// Constitution de notre sélection de villes ayant une population >
		// populationMin
		List<Ville> villesPopMin = new ArrayList<>();
		for (String ligne : lignes) {

			String[] elements = ligne.split(separateur);
			int nbHabs = StringUtils.parseInt(elements[9]);
			Ville ville = new Ville(elements[1], elements[2], elements[6], nbHabs);
			if (ville.getPopulation() >= populationMin) {

				villesPopMin.add(ville);
			}
		}

		// TRI ICI !!!!!!!
		sort(villesPopMin, new VilleComparateur(VilleComparateur.TRI_POP_ASC));

		// Génération des lignes pour le fichier de sortie 
		List<String> selection = toCsv(villesPopMin, separateur, true);

		// Génération du fichier de sortie
		Path pathDest = Paths.get(repertoireTravail + nomFichierDestination);
		Files.write(pathDest, selection);

		System.out.println("Nombre de lignes sélectionnées = " + selection.size());
	}

}
