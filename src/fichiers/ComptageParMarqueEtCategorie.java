package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import fichiers.comptage.Compteur;

public class ComptageParMarqueEtCategorie {

	public static void main(String[] args) throws IOException {
		Path pathOri = Paths.get("C:/Temp/Work/open-food-facts.csv");
		
		List<String> lignes = Files.readAllLines(pathOri);
		
		Compteur general = new Compteur("Général");
		
		for (int i=1; i<lignes.size(); i++) {
			String[] elements = lignes.get(i).split("\\|");
			String marque = elements[1];
			String categorie = elements[0];
			
			Compteur cptMarque = general.getCompteur(marque);
			cptMarque.inc(categorie);
		}
		
		System.out.println(general.affichage());

	}

}
