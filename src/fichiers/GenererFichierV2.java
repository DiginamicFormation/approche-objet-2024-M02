package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fichiers.csv.CsvUtils;

/**
 * V2 qui utilise une annotation @Csv positionnée sur les attributs de la classe
 * Ville pour générer le fichier CSV.
 * <p>
 * Seuls les valeurs des attributs possédant cette annotation sont exportées
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

		Path pathOri = Paths.get("C:/Temp/Work/recensement.csv");
		List<String> lignes = Files.readAllLines(pathOri);
		lignes.remove(0);

		List<Ville> villes25k = new ArrayList<>();
		for (String ligne : lignes) {

			String[] elements = ligne.split(";");
			int nbHabs = Integer.parseInt(elements[9].replaceAll(" ", ""));
			Ville ville = new Ville(elements[1], elements[2], elements[6], nbHabs);
			if (ville.getPop() >= 25000) {

				villes25k.add(ville);
			}
		}

		// TRI ICI !!!!!!!
		Collections.sort(villes25k, new VilleComparateur(VilleComparateur.TRI_POP_ASC));

		// Génération des lignes pour le fichier de sortie des villes de plus de 25000
		// habs
		List<String> selection = CsvUtils.toCsv(villes25k);

		// Génération du fichier de sortie
		Path pathDest = Paths.get("C:/Temp/Work/recensement25k.csv");
		Files.write(pathDest, selection);

		System.out.println("Nombre de lignes sélectionnées = " + selection.size());
	}

}
