package tp4;

//fonction
//tester junit
//exception

public class Chifoumi {

	public static void main(String[] args) {

		// INITIALISATION--------------------------------------------------------------
		int pointuser = 0;
		int pointpc = 0;
		int sommeuser = 0;
		int sommepc = 0;
		int reponse;
		
		do {// ------MESSAGE REJOUER TANT QUE-------------------------------------------
			
			// --------CHOIX USER ET CHOIX PC-------------------------------------------
			//lancerChoixUser(); lancerChoixPc();
			 

			// entree user et verifier les entrees user---------------------------------
			// choix attendu (p ou f ou c ) donc la condition est non ((p ou f ou c )= non p
			// et nonf et non c
			String choixuser = "a"; //entree dans la boucle
			while (!choixuser.equals("p") && !choixuser.equals("P") && !choixuser.equals("f") && !choixuser.equals("F")
				&& !choixuser.equals("c") && !choixuser.equals("C")) {
				System.out.println(
				"veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
				String choixuser1 = outils.Clavier.lireString();
				choixuser = choixuser1;
			}

			//  choix pc----------------------------------------------------------------
			String choixpc="a";
			String choixpc1;
			int randomNum = (int) (Math.random() * 101); // 0 to 100
			//les aleatoires balayent large, donc les sequences identiques doivent etre
			//rapprochees afin de ne pas etre appeleees trop souvent
			if ((0 <= randomNum) && (randomNum < 10)) {choixpc = "f";};
			if ((10 <= randomNum) && (randomNum < 20)) {choixpc = "f";};
			if ((20 <= randomNum) && (randomNum < 30)) {choixpc = "p";};
			if ((30 <= randomNum) && (randomNum < 40)) {choixpc = "p";};
			if ((40 <= randomNum) && (randomNum < 50)) {choixpc = "c";};
			if ((50 <= randomNum) && (randomNum < 60)) {choixpc = "c";};
			if ((60 <= randomNum) && (randomNum < 70)) {choixpc = "p";};
			if ((70 <= randomNum) && (randomNum < 80)) {choixpc = "f";};
			if ((80 <= randomNum) && (randomNum < 90)) {choixpc = "c";};
			if ((90 <= randomNum) && (randomNum < 100)) {choixpc = "c";};
			choixpc1 = choixpc;
			System.out.println("le choix pc est :"+choixpc);
			
			/* test manuel du programme:il faut devalider le code du dessus de chpix user
			 *  et choix aleatoire pc: les test sont ok*/
			//String choixuser="c";
			//String choixpc= "p";
			
			// ----------------LE TEST COMPARATIF--------------------------------------------------
			String comp = choixuser + choixpc;
			System.out.println("la comparaison est :" + comp);

			// --------COMPARAISON RESULTAT ET  POINTS---------------------------------------------
			// FORCE: pierre>ciseaux, feuille>pierre, ciseaux>feuille
			// POINTS: 		EGALITE: PP FF CC 		USER GAGNE: PC CF 		USER PERD: PF FC CP

			// EGALITE
			if ((comp.equals("pp") || (comp.equals("ff") || (comp.equals("cc") )))) {
				pointuser = 0;
				pointpc =0;
				sommeuser = sommeuser+pointuser;
				sommepc =sommepc+pointpc;
				System.out.println("EGALITE");
				System.out.println("le score de cette partie est : utilisateur"+sommeuser+" et l ordinateur  :"+sommepc+" points");
			}

			// USERT GAGNE
			else if ((comp.equals("pc") || (comp.equals("cf")))) {
				pointuser = 1;
				pointpc =0;
				sommeuser = sommeuser+pointuser;
				sommepc =sommepc+pointpc;
				System.out.println("GAGNE");
				System.out.println("le score de cette partie est : utilisateur"+sommeuser+" et l ordinateur  :"+sommepc+" points");
			}

			// ELSE USER PERD
			else {
				pointuser = 0;
				pointpc =1;
				sommeuser = sommeuser+pointuser;
				sommepc =sommepc+pointpc;
				System.out.println("PERDU");
				System.out.println("le score de cette partie est : utilisateur"+sommeuser+" et l ordinateur  :"+sommepc+" points");
			}

			// ---------------MESSAGE NOUVELLE MANCHE-----------------------------------------------
			// erreur d entree non traitee
			System.out.println("voulez vous rejouer une autre manche? entrez 1 pour oui, o (zero) pour non");
			int reponse1 = outils.Clavier.lireInt();
			reponse = reponse1;

		} while (reponse == 1);

		// --------------------AFFICHAGE FINAL JEU FINI : SOMME ET GAGNANT PERDANT-------------------
		
		if(sommeuser==sommepc){
			System.out.println("égalité :l utilisateur a :" + sommeuser + " points" + " et l ordinateur "
					+ sommepc + " points");
		} 
		
		else if (sommeuser > sommepc) {
			System.out.println("l utilisateur a gagné , il a marque :" + sommeuser + " points" + " et l ordinateur "
					+ sommepc + " points");
		} 
				
		else {
			System.out.println("l utilisateur a perdu, vous avez " + sommeuser + " points, et l ordinateur a " + sommepc
					+ " points");

		} 

	} // MAIN

} // CHIFOUMI
