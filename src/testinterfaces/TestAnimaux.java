package testinterfaces;

import java.util.ArrayList;

import testinterfaces.entites.Animal;
import testinterfaces.entites.Dauphin;
import testinterfaces.entites.Lion;
import testinterfaces.entites.Moineau;
import testinterfaces.entites.Oiseau;
import testinterfaces.entites.Requin;
import testinterfaces.interfaces.Aquatique;
import testinterfaces.interfaces.Chasseur;

public class TestAnimaux {

	public static void main(String[] args) {
		
		Requin requy = new Requin(150, "Requy");
		traiterAnimal(requy);
		traiterChasseur(requy);
		traiterAquatique(requy);
		
		Lion leo = new Lion(210, "Leo");
		traiterAnimal(leo);
		traiterChasseur(leo);
		//traiterAquatique(leo);
		
		Moineau moino = new Moineau(1, "Moino");
		traiterAnimal(moino);
		//traiterChasseur(moino);
		//traiterAquatique(moino);
		
		Dauphin delo = new Dauphin(70, "Delo");
		traiterAnimal(delo);
		traiterChasseur(delo);
		traiterAquatique(delo);
		
		ArrayList<Animal> animaux = new ArrayList<>();
		animaux.add(requy);
		animaux.add(leo);
		animaux.add(moino);
		animaux.add(delo);
		
		ArrayList<Oiseau> oiseaux = new ArrayList<>();
		//oiseaux.add(requy);
		//oiseaux.add(leo);
		oiseaux.add(moino);
		//oiseaux.add(delo);
		
		ArrayList<Chasseur> listeChasseurs = new ArrayList<Chasseur>();
		listeChasseurs.add(requy);
		listeChasseurs.add(leo);
		//listeAquatiques.add(moino);
		listeChasseurs.add(delo);
		
		ArrayList<Aquatique> listeAquatiques = new ArrayList<Aquatique>();
		listeAquatiques.add(requy);
		//listeAquatiques.add(leo);
		//listeAquatiques.add(moino);
		listeAquatiques.add(delo);
		
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
	
	public static void traiterAquatique(Aquatique aqu) {
		
	}

}
