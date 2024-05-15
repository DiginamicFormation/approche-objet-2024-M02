package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		
		// Version 1.0 du langage : année numérotée à partir de 1900, et mois à partir de 0
		Date d = new Date(124, 9, 14, 12, 30, 0);
		System.out.println(d);
		
		// Version 1.1 du langage : année numérotée à partir de 1, et mois à partir de 0
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 4, 14, 12, 30, 0);
		Date d2 = cal.getTime();
		System.out.println(d2);
		
		cal.setTime(d);
		cal.set(Calendar.MONTH, 7);
		
		System.out.println(cal.getTime());
		
		// Format attendu en FR : dd/MM/yyyy HH:mm:ss
		SimpleDateFormat formateur = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.ITALIAN);
		String dateConvertie = formateur.format(d);
		System.out.println(dateConvertie);
		
		// parse 
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MMMM/yyyy");
		String chaine = "12/03/2024";

		Date dateModification = formateur2.parse(chaine);
		System.out.println(dateModification);
		
		
		System.out.println("Coucou");

	}

}
