package package_tp1;

import java.util.Scanner;

public class TP43 {

	public static void main(String[] args) {
		//entree clavier
		Scanner sc = new Scanner(System.in);
		int valeur;
		do {
			System.out.println("veuillez entrer un chiffre");		
			//lire la chaine
			String chaine_lue = sc.nextLine();
			//conversion en integer
			valeur = Integer.parseInt(chaine_lue);
			//tant que  ( valeur<5 ou valeur>10) saisir clavier
		} while ((valeur <5) || (valeur>10) );
		System.out.println("vous etes sorti, il fallait entrer un chiffre entre 5 et 9 ! bien joué !!!");
		
		
		
		
	}
}



