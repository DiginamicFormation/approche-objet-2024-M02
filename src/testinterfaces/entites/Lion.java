package testinterfaces.entites;

import testinterfaces.interfaces.Chasseur;

public class Lion extends Mammifere implements Chasseur {

	public Lion(int poids, String nom) {
		super(poids, nom);
	}

	@Override
	public void chasser() {
		// TODO Auto-generated method stub
	}

}
