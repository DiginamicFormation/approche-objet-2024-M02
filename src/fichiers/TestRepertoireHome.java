package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestRepertoireHome {

	public static void main(String[] args) throws IOException {
		
		// On définit un répertoire home (qu'on pourrait mettre dans un fichier de conf par exemple)
		Path home = Paths.get("C:/Temp/Work/");
		
		// Et ensuite on définit tous nos chemins de manière relative par rapport à ce répertoire racine
		Path pathOri = home.resolve("../recensement.csv");
		Path pathDest = home.resolve("recensement-copie.csv");
		
		Files.copy(pathOri, pathDest);
	}

}
