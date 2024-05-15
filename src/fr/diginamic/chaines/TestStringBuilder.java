package fr.diginamic.chaines;

/**
 * Correspond au TP16
 */
public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		
		// Chronométrage de la concaténation avec StringBuilder
		StringBuilder chaineBuilder = new StringBuilder();
		for (int i=0; i<100000; i++) {
			chaineBuilder.append(i);
		}
		chaineBuilder.toString();
		
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes (StringBuilder) : " + (fin - debut)+" ms");
		
		long debut2 = System.currentTimeMillis();
		
		String chaine = "";
		for (int i=0; i<100000; i++) {
			chaine+=i;
		}
		
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes (Opérateur +) : " + (fin2 - debut2)+" ms");

	}

}
