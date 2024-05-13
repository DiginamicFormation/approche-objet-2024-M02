package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class TestEcritureFichier {

	public static void main(String[] args) throws IOException {
		
		// En paramètre le chemin peut ne pas exister : chemins relatifs possibles
		Path pathDest = Paths.get("C:/Temp/Work/essai-sortie.txt");
		
		ArrayList<String> lignes = new ArrayList<>();
		Collections.addAll(lignes, "Dauphin", "Rat", "Koala", "Poule");
		
		Files.write(pathDest, lignes);
	}

}
