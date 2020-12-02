//EXERCICE 3 -DATES

package package_tp1;

import java.text.SimpleDateFormat;
import java.util.Date;

import outils.Clavier;

public class Tp3_exercice3 {

	public static void main(String[] args) {
		// aujourdui();
		// maintenant();
		// saisirDate();

	}

	// DATE AVEC FORMAT
	public static void aujourdui() {
		Date jour = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		String datejour = dateformat.format(jour);
		System.out.println("aujourdh ui, nous sommes le :" + datejour);
		// TP1CORRECTION.dateToString(); appel direct a la fonction dans une autre
		// classe :nom pleinement qualifie
	}

	// HEURES MINUTES SECONDES
	public static void maintenant() {
		Date jour = new Date();
		Long heuresjour = (long) jour.getHours();
		int minutesjour = jour.getMinutes();
		int secondesjour = jour.getSeconds();
		System.out.println(
				"Il est : " + heuresjour + " heures " + minutesjour + " minutes " + secondesjour + " secondes");
	}

	// la méthode saisirDate(jour, mois, annee) qui permet de saisir une date.
	public static void saisirDate() {
		// entree clavier
				System.out.println("entrez le jour");
				int jour = Clavier.lireInt();
				System.out.println("entrez le mois");
				int mois = Clavier.lireInt();
				System.out.println("entrez l'année");
				int annee = Clavier.lireInt();
				int jourok = 0;int moisok=0;int anneeok=0;

		// -----------------------------------------anne
		// bisextile---------------------------------------------
		bissextile(annee);

		// --------------------------------------jours-----------------------------------------------

		if (jour == 0) {
			System.out.println("Le jour n est pas bon");
		}
		if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
			if ((0 <= jour) && (jour <= 31)) {
				jourok = jour;
			} else {
				System.out.println("Le jour n est pas bon");
			}
		}

		if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
			if ((0 <= jour) && (jour <= 30)) {
				jourok = jour;
			} else {
				System.out.println("Le jour n est pas bon");
			}
		}

		if (mois == 2) {
			if ((annee % 4 == 0) && (annee % 400 == 0)) {
				if ((0 <= jour) && (jour <= 29)) {
					jourok = jour;
				} else {
					System.out.println("Le jour n est pas bon");
				}
			}

			else if ((annee % 4 == 0) && ((annee % 400 == 0))) {
				if ((0 <= jour) && (jour <= 28)) {
					jourok = jour;
				} else {
					System.out.println("Le jour n est pas bon");
				}
			}
		}

		// ----------------------------------------------------mois--------------------------------------------
		if ((0 <= mois) || (mois <= 12)) {
			moisok = mois;
			System.out.println("Le mois n est pas bon");
		}

		// verif date
		System.out.println("la date " + jourok + "/" + moisok + "/" + anneeok + " est valide");

	}

	public static boolean bissextile(int annee) {
		// divisible par 400 ou (divisible/4 et divisible par 100) = bissextile
		if ((annee % 400 == 0) || ((annee % 4 == 0) && (annee % 100 != 0))) {
			System.out.println("l annee est bisextile");
			return true;
		}
		// autre cas
		else {
			System.out.println("l annee n est pas bisextile");
			return false;
		}
	}

}
