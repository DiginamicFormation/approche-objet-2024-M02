package listes;

import java.util.ArrayList;

public class TestListePreJava5 {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("bonjour");
		liste.add("coucou");
		
		String chaine = liste.get(1);

	}

}
