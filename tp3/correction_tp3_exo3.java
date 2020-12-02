package tp3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import outils.Clavier;

//commenter
//variables au debut
//tester tous les cas manuel ou auto junit
//une sortie par fonction

public class correction_tp3_exo3 {
	/*
	 * Nous avons créer une classe Clavier, qu'on pourra réutiliser dans d'autres
	 * exercices. Le but étant de ne pas réécrire le code à chaque fois. Sur le même
	 * principe, créer une classe Date qui contiendra plusieurs méthodes :
	 * 
	 * La méthode aujourdhui() affiche la date d'aujourd'hui en console, en format : 21/09/2020 
	 * La méthode maintenant() qui affiche l'heure de maintenant
	 * la méthode saisirDate(jour, mois, annee) qui permet de saisir une date.
	 * 
	 * Cette classe pourra être complété au fur et à mesure de votre besoin.
	 */
	public static void main(String[] args) throws ParseException {

		aujourdhui();
		maintenant();
		System.out.println("saisir un jour");
		int j = Clavier.lireInt();
		System.out.println("saisir un mois");
		int m = Clavier.lireInt();
		System.out.println("saisir une année");
		int a = Clavier.lireInt();
		Date dateSaisie = saisirDate(j, m, a);
		System.out.println(dateSaisie);

	}

	public static void aujourdhui() {
		Date dateDuJour = new Date();
		SimpleDateFormat formatDeDate = new SimpleDateFormat("dd/MM/yyyy");
		String jour = formatDeDate.format(dateDuJour);
		System.out.println("aujourd hui, nous sommes le " + jour);
	}

	public static void maintenant() {
		Date dateDuJour = new Date();
		int heure = dateDuJour.getHours();
		int min = dateDuJour.getMinutes();
		System.out.println("il est " + heure + " heures et " + min + " minutes");

	}

	public static Date saisirDate(int j, int m, int a) throws ParseException {
		Date dateSaisie = null;
        // erreurs les plus primaires
		if (j < 1 || j > 31 || m < 1 || m > 12) {System.out.println("ERREUR");} 
		// Cas de Février:une annee bisextile a 29 jours
		else if (m == 2) { if ((isBissextile(a) == true && j > 29) || (isBissextile(a) == false && j > 28)) {System.out.println("ERREUR");}} 
		 // Les mois qui n'ont que 30 jours
		else if (j == 31 && (m == 4 || m == 6 || m == 9 || m == 11)){System.out.println("ERREUR");} 
		//ne reste que les cas a  30 jours
		else {
			//formatage du retour apres detection erreur
			String dateString = j + "/" + m + "/" + a;
			//donner acces au simpledateformat.parse (from string to date) 
			SimpleDateFormat formatDeDate = new SimpleDateFormat("dd/MM/yyyy");
			dateSaisie = formatDeDate.parse(dateString);
		}
		return dateSaisie;
	}
		
	
	// Cas de Février:une annee bisextile a 29 jours
	public static boolean isBissextile(int y) {
		return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
	}

}