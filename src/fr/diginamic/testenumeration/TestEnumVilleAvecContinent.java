package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestEnumVilleAvecContinent {
	
	public static void main(String[] args) {
		
		ArrayList<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(new Ville("New York", 8.3, Continent.AMERIQUE));
		listeVilles.add(new Ville("Paris", 2.1, Continent.EUROPE));
		listeVilles.add(new Ville("Moscou", 13.1, Continent.ASIE));
		listeVilles.add(new Ville("Berlin", 2.1, Continent.EUROPE));
		listeVilles.add(new Ville("Beijing", 21.5, Continent.ASIE));
		listeVilles.add(new Ville("Sao Paulo", 12.3, Continent.AMERIQUE));
		listeVilles.add(new Ville("Sydney", 5.3, Continent.OCEANIE));
		listeVilles.add(new Ville("Dakar", 1.1, Continent.AFRIQUE));
		
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}
	}
}
