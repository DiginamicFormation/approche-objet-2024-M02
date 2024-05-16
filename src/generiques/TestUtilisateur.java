package generiques;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Set;

public class TestUtilisateur {

	public static void main(String[] args) {
		Utilisateur<Integer, ArrayList<String>> u1 = new Utilisateur<>(12, "XX", "ji", new Date());
		Utilisateur<Long, LinkedList<String>> u2 = new Utilisateur<>(125L, "XZ", "Ja", null);
		
		int id = u1.getIdentifiant();
		long id2 = u2.getIdentifiant();

	}

}
