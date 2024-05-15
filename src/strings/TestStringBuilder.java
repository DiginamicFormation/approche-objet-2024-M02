package strings;

import java.util.Locale;

import utils.StringUtils;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis(); // nb de millisecondes écoulées depuis le 1er janvier 1970 à 00:00
		
		String nom = "Lee";
		String prenom = "Tim";
		double valeur = 2.15;
		
		String chaine = StringUtils.toString("Bonjour je m'appelle ", nom, " et j'ai ", valeur, "€ en poches");
		System.out.println(chaine);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Bonjour je m'appelle ").append(nom).append(" ").append(prenom).append(" et j'ai ").append(valeur).append("€ en poches");
		
		String chaineVar = String.format(Locale.FRANCE, "Bonjour je m'appelle %s %s et j'ai %8.2f€ en poches", "Lee", "Tim", 2.15);
		//System.out.println(chaineVar);
		
		//System.out.println(builder.toString());
		
		long fin = System.currentTimeMillis(); // nb de millisecondes écoulées depuis le 1er janvier 1970 à 00:00
		
		long duree = fin-debut;
		System.out.println(duree);
	}

}
