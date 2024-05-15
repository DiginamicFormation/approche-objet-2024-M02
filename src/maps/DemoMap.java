package maps;

import java.util.ArrayList;
import java.util.HashMap;

import tri.Ville;

public class DemoMap {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put("afze", new Ville("Nice", 343000));
		mapVilles.put("bsdffsd", new Ville("Carcassonne", 47800));
		mapVilles.put("cdqsdq", new Ville("Narbonne", 53400));
		mapVilles.put("dcqd", new Ville("Lyon", 484000));
		mapVilles.put("eazdaze", new Ville("Foix", 9700));
		mapVilles.put("faczeaz1", new Ville("Pau", 77200));
		mapVilles.put("faczeaz2", new Ville("Pau", 77200));
		mapVilles.put("gazfazf", new Ville("Marseille", 850700));
		mapVilles.put("hazaze", new Ville("Tarbes", 40600));
		
		//System.out.println(villes.size());
		
		mapVilles.remove("g");
		
		Ville selection = mapVilles.get("g");
		
		// parcourir la liste des clés ou la liste des valeurs
		
		for (String cle : mapVilles.keySet()) {
			Ville v = mapVilles.get(cle);
			System.out.println(cle + " - " + v);
		}

	}

}
