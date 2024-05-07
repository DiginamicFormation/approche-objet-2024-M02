package testinterfaces.entites;

import testinterfaces.interfaces.Chasseur;

public class Chouette extends Oiseau implements Chasseur {

	public Chouette(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
		
	}

}
