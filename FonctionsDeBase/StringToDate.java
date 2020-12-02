package FonctionsDeBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	// String textdate="31/12/1998";

	public static void main(String[] args) throws Exception {

		StringToDateFormat1("31/12/1998");
	}

	public static Date StringToDateFormat1(String textdate) {
		// date obtenue : Thu Dec 31 00:00:00 CET 1998
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(textdate);
		} catch (ParseException e) {
			System.out.println(
					"vous avez probablement entr� un mauvais format de date : s�parateur ou ordre des chiffres");
		}
		System.out.println("la date texte entr�e est: " + textdate);
		System.out.println("la date systeme sortie est :" + date);
		return date;
	}
	
}