package interfaces;

import java.util.ArrayList;

import interfaces.entites.Animal;
import interfaces.entites.Chasseur;
import interfaces.entites.Lion;
import interfaces.entites.Moineau;
import interfaces.entites.Requin;

public class TestAnimaux {

	public static void main(String[] args) {
		
		Requin req = new Requin(150, "Kiki");
		traiterAnimal(req);
		traiterChasseur(req);
		
		Lion leo = new Lion(210, "Leo");
		traiterAnimal(leo);
		traiterChasseur(leo);
		
		Moineau moineau = new Moineau(1, "Ikio");
		traiterAnimal(moineau);
		//traiterChasseur(moineau);
		
		
		ArrayList<Chasseur> listeChasseurs = new ArrayList<Chasseur>();
		listeChasseurs.add(req);
		listeChasseurs.add(req);
		listeChasseurs.add(leo);
		
		// Boucle indexée
		for (int i=0; i<listeChasseurs.size(); i++) {
			Chasseur ch = listeChasseurs.get(i);
			System.out.println(ch);
		}
		
		System.out.println("---------------------");
		
		// Boucle non indexée, boucle objet
		for (Chasseur ch : listeChasseurs) {
			System.out.println(ch);
		}
		
		// Iterator
		
	}
	
	public static void traiterAnimal(Animal animal) {
		
	}

	public static void traiterChasseur(Chasseur chasseur) {
		
	}

}
