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
		 * Si note >= 10 �crire(�cran) "Vous �tes admis(e)" Si note < 12 �crire(�cran)
		 * "Votre mention est assez bien". Sinon Si note < 14 �crire(�cran)
		 * "Votre mention est bien". Sinon Si note < 16 �crire(�cran)
		 * "Votre mention est tr�s bien". Finsi Finsi Finsi Sinon Si note >= 8
		 * �crire(�cran) "Vous �tes sur liste d'attente" Sinon �crire (�cran)
		 * "Vous �tes refus�(e)" FinSi FinSi
		 */

		// ------------------------------------------------------------------

		/*if (note >= 10) {
			System.out.println("Vous �tes admis(e)");
			if (note < 12) {
				System.out.println("votre mention est assez bien");
			}

			else {
				if (note < 14) {
					System.out.println("votre mention est bien");
				} else {
					if (note < 16) {
						System.out.println("votre mention est tr�s bien");
					}
				}
			}
		}

		else {
			if (note >= 8) {
				System.out.println("Vous �tes sur liste d'attente");
			} else {
				System.out.println("Vous �tes refus�");
			}
		}

	}
}*/
		
		if (note >= 10) {
			System.out.println("Vous �tes admis(e)");
			if (note < 12) {System.out.println("votre mention est assez bien");}
			else if (note < 14) {System.out.println("votre mention est bien");} 
			else if (note < 16) {System.out.println("votre mention est tr�s bien");}
			else {System.out.println("votre mention est exceptionnelle");}
		}

		else {
			if (note >= 8) {System.out.println("Vous �tes sur liste d'attente");} 
			else {System.out.println("Vous �tes refus�");}
		}
		
		} //main
	
}	//CLASS TP3


		
