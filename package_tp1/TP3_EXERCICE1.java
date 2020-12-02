package package_tp1;

import java.util.Scanner;

import outils.Clavier;

public class TP3_EXERCICE1 {

	public static void main(String[] args) {
		// ecrire " Veuillez saisir la note"
		System.out.println("veuillez saisir la note");
		// lire(clavier) la note
		int note = Clavier.lireInt();

		/*
		 * Si note >= 10 écrire(écran) "Vous êtes admis(e)" Si note < 12 écrire(écran)
		 * "Votre mention est assez bien". Sinon Si note < 14 écrire(écran)
		 * "Votre mention est bien". Sinon Si note < 16 écrire(écran)
		 * "Votre mention est très bien". Finsi Finsi Finsi Sinon Si note >= 8
		 * écrire(écran) "Vous êtes sur liste d'attente" Sinon écrire (écran)
		 * "Vous êtes refusé(e)" FinSi FinSi
		 */

		// ------------------------------------------------------------------

		/*if (note >= 10) {
			System.out.println("Vous êtes admis(e)");
			if (note < 12) {
				System.out.println("votre mention est assez bien");
			}

			else {
				if (note < 14) {
					System.out.println("votre mention est bien");
				} else {
					if (note < 16) {
						System.out.println("votre mention est trés bien");
					}
				}
			}
		}

		else {
			if (note >= 8) {
				System.out.println("Vous êtes sur liste d'attente");
			} else {
				System.out.println("Vous êtes refusé");
			}
		}

	}
}*/
		
		if (note >= 10) {
			System.out.println("Vous êtes admis(e)");
			if (note < 12) {System.out.println("votre mention est assez bien");}
			else if (note < 14) {System.out.println("votre mention est bien");} 
			else if (note < 16) {System.out.println("votre mention est trés bien");}
			else {System.out.println("votre mention est exceptionnelle");}
		}

		else {
			if (note >= 8) {System.out.println("Vous êtes sur liste d'attente");} 
			else {System.out.println("Vous êtes refusé");}
		}
		
		} //main
	
}	//CLASS TP3


		
