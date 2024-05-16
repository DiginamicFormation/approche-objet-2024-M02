package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		/*
		 * Créez une instance de la classe java.util.Date à la date du jour en utilisant
		 * un de ses constructeurs.
		 */
		Date dateJour = new Date(124, 4, 15); // ou new Date();
		
		/*
		 * <Affichez l’instance ainsi créée au format suivant : jour/mois/année (sans la
		 * partie heure)
		 */
		SimpleDateFormat formateurJour = new SimpleDateFormat("dd/MM/yyyy");
		String dateJourFormatee = formateurJour.format(dateJour);
		System.out.println(dateJourFormatee);

		/*
		 * Créez une instance de la classe Date à la date du 19/05/2016 à 23:59:30
		 * secondes
		 */
		Date date2 = new Date(116, 4, 19, 23, 59, 30);

		/*
		 * Affichez l’instance ainsi créée au format suivant : année/mois/jour
		 * heure:minute:seconde
		 */
		SimpleDateFormat formateurComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateurComplet.format(date2));
		
		/*
		 * Créez une instance de Date contenant la date/heure système et affichez-la au
		 * même format que ci-dessus.
		 */
		Date dateSys = new Date();
		System.out.println(formateurComplet.format(dateSys));
	}

}
