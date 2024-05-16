package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		/*
		 * Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		 * date du 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :
		 * jour/mois/année
		 */
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		
		SimpleDateFormat formateurJour = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateurJour.format(date));

		/*
		 * Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		 * date du jour.
		 */
		Date dateJour = Calendar.getInstance().getTime();
		
		/*
		 * Affichez l’instance ainsi créée au format suivant : année/mois/jour
		 * heure:minute:seconde
		 */
		SimpleDateFormat formateurComplet = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateurComplet.format(dateJour));

		/*
		 * Affichez la même instance avec le nom des jours et des mois en français,
		 * russe, chinois et allemand.
		 */
		
		SimpleDateFormat formateurFR = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
		SimpleDateFormat formateurEN = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.US);
		SimpleDateFormat formateurCH = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		SimpleDateFormat formateurGE = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		SimpleDateFormat formateurRU = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		
		System.out.println(formateurFR.format(dateJour));
		System.out.println(formateurEN.format(dateJour));
		System.out.println(formateurCH.format(dateJour));
		System.out.println(formateurGE.format(dateJour));
		System.out.println(formateurRU.format(dateJour));
	}

}
