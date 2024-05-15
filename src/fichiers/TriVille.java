package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriVille {

	public static void main(String[] args) throws IOException {
		
		Path pathOri = Paths.get("C:/Temp/Work/recensement.csv");
		List<String> lignes = Files.readAllLines(pathOri);
		lignes.remove(0);
		
		List<Ville> villes = new ArrayList<>();
		
		for (String ligne : lignes) {
			
			String[] elements = ligne.split(";");
			int nbHabs = Integer.parseInt(elements[9].replaceAll(" ", ""));
			if (nbHabs>=25000) {
				
				Ville ville = new Ville(elements[1], elements[2], elements[6], nbHabs);
				villes.add(ville);
			}
		}
		
		Collections.sort(villes); // la méthode sort n'accepte que des listes d'objets qui emplémentent Comparable
		
		for (Ville v: villes) {
			System.out.println(v);
		}
		
	}

}
