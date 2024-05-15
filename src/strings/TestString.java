package strings;

import java.util.Locale;

public class TestString {

	public static void main(String[] args) {
		String chaine = "Bonjour"; // une chaine de caractères est immutable
		chaine = chaine.concat(" !");
		
		System.out.println(chaine);
		
		String chaineVar = String.format(Locale.FRANCE, "Bonjour je m'appelle %s %s et j'ai %8.2f€ en poches", "Lee", "Tim", 2.15);
		System.out.println(chaineVar);
	}

}
