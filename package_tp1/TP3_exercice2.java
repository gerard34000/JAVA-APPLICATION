package package_tp1;

import outils.Clavier;

public class TP3_exercice2 {

	public static void main(String[] args) {
		//saisie des chiffres
		System.out.println("veuillez entrer un 1er chiffre");
		int nb1 = Clavier.lireInt();
		System.out.println("veuillez entrer un 2eme chiffre");
		int nb2 = Clavier.lireInt();
		System.out.println("veuillez entrer un 3eme chiffre");
		int nb3 = Clavier.lireInt();
		System.out.println("veuillez entrer un 4eme chiffre");
		int nb4 = Clavier.lireInt();
		
		//plus grand nombre
		int pgn = 0;
		
		pgn=nb1;
		if (nb2>nb1) {pgn=nb2;}
		if (nb3>nb1) {pgn=nb3;}
		if (nb4>nb1) {pgn=nb4;}
		
		System.out.println("le nombre le plus grand est : "+pgn);
	}
}

