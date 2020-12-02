package FonctionsDeBase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class DateToString {
	
	public static void main(String args[]) {
		
		DateToStringFormat1();

	}
	
	public static String DateToStringFormat1() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String stringDate = dateFormat.format(date);
		System.out.println("date entrée: " + date);
		System.out.println("date sortie : " + stringDate);
		return stringDate;
	}
}