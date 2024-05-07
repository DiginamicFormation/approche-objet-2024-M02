package listes;

import java.util.ArrayList;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));

		// Boucle de traitement
		Ville villeMax = villes.get(0);
		Ville villeMin = villes.get(0);
		for (int i=0; i<villes.size(); i++) {
			
			Ville villeCourante = villes.get(i);
			
			// Recherche de la plus grande ville
			if (villeCourante.getNbHabs() > villeMax.getNbHabs()) {
				villeMax = villeCourante;
			}
			
			// Recherche de la plus petite ville
			if (villeCourante.getNbHabs() < villeMin.getNbHabs()) {
				villeMin = villeCourante;
			}
			
			// Mettre en MAJ le nom des villes de +100 000
			if (villeCourante.getNbHabs()>=100000) {
				String nom = villeCourante.getNom();
				villeCourante.setNom(nom.toUpperCase());
			}
		}
		System.out.println(villeMax);
		System.out.println(villeMin);
		
		// Suppression de la + petite ville
		villes.remove(villeMin);
		
		System.out.println(villes);
	}

}
