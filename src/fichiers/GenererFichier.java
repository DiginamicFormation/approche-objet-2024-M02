package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.CsvUtils;

public class GenererFichier {

	public static void main(String[] args) throws IOException {

		Path pathOri = Paths.get("C:/Temp/Work/recensement.csv");
		List<String> lignes = Files.readAllLines(pathOri);
		String ligneColonne = lignes.remove(0);
		String[] colonnes = ligneColonne.split(";");

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
		Collections.sort(villes25k);
		
		// Génération des lignes pour le fichier de sortie des villes de plus de 25000
		// habs
		ArrayList<String> selection = new ArrayList<>();

		// On commence par ajouter les entêtes de colonnes qui nous intéressent
		selection.add(colonnes[1] + ";" + colonnes[2] + ";" + colonnes[6] + ";" + colonnes[9]);

		// Puis on ajoute à la liste des lignes, chaque ville de plus de 25k transfo
		for (Ville ville : villes25k) {
			String ligneSortie = ville.toCsv();
			selection.add(ligneSortie);
		}

		// Génération du fichier de sortie
		Path pathDest = Paths.get("C:/Temp/Work/recensement25k.csv");
		Files.write(pathDest, selection);

		System.out.println("Nombre de lignes sélectionnées = " + selection.size());
	}

}
