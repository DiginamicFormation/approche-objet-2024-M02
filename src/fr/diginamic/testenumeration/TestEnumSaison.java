package fr.diginamic.testenumeration;

public class TestEnumSaison {

	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison);
		}
		
		System.out.println("------------");
		
		String nom = "ETE";
		Saison ete = Saison.valueOf(nom);
		System.out.println(ete);

		System.out.println("------------");
		
		String libelle = "Hiver";
		Saison hiver = Saison.extraireSaisonParLibelle(libelle);
		System.out.println(hiver);
	}

}
