package tp4;

public class ChifoumiAvecFonction {

	public static void main(String[] args) {
		
		//fp fc egalite !!!

		// INITIALISATION--------------------------------------------------------------
		//tests 
		// POINTS USER : 		EGALITE: PP FF CC 		USER GAGNE: PC CF FP			USER PERD: PF FC CP
		//LES TESTS MANUELS SUR UNE MANCHE SONT OK !!!
		String choixuser = "initial";
		String choixpc = "initial";
		String comp = "initial";
		int reponse;
		int pointuser = 0;
		int pointpc = 0;
		int sommeuser = 0;
		int sommepc = 0;
		int turn = 1;

		do {// ------MESSAGE REJOUER TANT QUE-------------------------------------------
			
			// --------CHOIX USER ET CHOIX PC-------------------------------------------
			System.out.println("------------------tour n no "+turn+"-----------------------------");
			choixuser=lancerChoixUser();
			choixpc=lancerChoixpc();
			 

			// fabrication du test comparatif de comparaison
			comp = Comparaison(choixuser, choixpc); // 1 je n avais pas recupere la valeur comp de la fonction comp!!!!!

			// resultat de manche
			pointuser = TestPointuser(comp);
			pointpc = TestPointpc(comp);
			sommeuser = sommeuser + pointuser;
			sommepc = sommepc + pointpc;
			resultatManche(sommeuser, sommepc);
			SommesDesManches(sommeuser, sommepc);

			// resultat final de partie
			/*sommeuser = TestSommeUser(choixuser, choixpc, comp, pointuser, pointpc, sommeuser, sommepc);
			sommepc = TestSommePc(choixuser, choixpc, comp, pointuser, pointpc, sommeuser, sommepc);*/

			// ---------------MESSAGE NOUVELLE
			// MANCHE-----------------------------------------------
			// erreur d entree non traitee
			System.out.println("voulez vous rejouer une autre manche? entrez 1 pour oui, o (zero) pour non");
			int reponse1 = outils.Clavier.lireInt();
			reponse = reponse1;
			++turn;

		} while (reponse == 1);

		// --------------------AFFICHAGE FINAL JEU FINI : SOMME ET GAGNANT
		// PERDANT-------------------
		resultatPartie(sommeuser, sommepc);

	} // MAIN

	// -------------------------FONCTIONS-------------------------------------------------

	public static String lancerChoixUser() {
		// entree user et verifier les entrees user---------------------------------
		// choix attendu (p ou f ou c ) donc la condition est non ((p ou f ou c )= non p
		// et nonf et non c
		String choixuser = "a"; // entree dans la boucle
		while (!choixuser.equalsIgnoreCase("p") && !choixuser.equalsIgnoreCase("P") && !choixuser.equalsIgnoreCase("f") && !choixuser.equalsIgnoreCase("F")
				&& !choixuser.equalsIgnoreCase("c") && !choixuser.equalsIgnoreCase("C")) {
			System.out.println(
					"veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
			String choixuser1 = outils.Clavier.lireString();
			choixuser = choixuser1;
		}
		return choixuser;
	}

	// choix aleatoire pcq
	public static String lancerChoixpc() {
		String choixpc = "p";

		int randomNum = (int) (Math.random() * 101); // 0 to 100
		// les aleatoires balayent large, donc les sequences identiques doivent etre
		// rapprochees afin de ne pas etre appeleees trop souvent
		if ((0 <= randomNum) && (randomNum < 10)) {
			choixpc = "f";
		}
		;
		if ((10 <= randomNum) && (randomNum < 20)) {
			choixpc = "f";
		}
		;
		if ((20 <= randomNum) && (randomNum < 30)) {
			choixpc = "p";
		}
		;
		if ((30 <= randomNum) && (randomNum < 40)) {
			choixpc = "p";
		}
		;
		if ((40 <= randomNum) && (randomNum < 50)) {
			choixpc = "c";
		}
		;
		if ((50 <= randomNum) && (randomNum < 60)) {
			choixpc = "c";
		}
		;
		if ((60 <= randomNum) && (randomNum < 70)) {
			choixpc = "p";
		}
		;
		if ((70 <= randomNum) && (randomNum < 80)) {
			choixpc = "f";
		}
		;
		if ((80 <= randomNum) && (randomNum < 90)) {
			choixpc = "c";
		}
		;
		if ((90 <= randomNum) && (randomNum < 100)) {
			choixpc = "c";
		}
		;

		System.out.println("le choix pc est :" + choixpc);
		return choixpc;
	}

	public static String Comparaison(String choixuser, String choixpc) {
		// ----------------LE TEST
		// COMPARATIF--------------------------------------------------
		String comp = choixuser + choixpc;
		System.out.println("la comparaison est :" + comp);
		return comp; // 2 je n avais aps fait de valeur de retour pour comp!!!!
	}

	// --------COMPARAISON RESULTAT ET
	// POINTS---------------------------------------------
	// FORCE: pierre>ciseaux, feuille>pierre, ciseaux>feuille
	// POINTS USER : 		EGALITE: PP FF CC 		USER GAGNE: PC CF FP			USER PERD: PF FC CP

	// comparaison et retour pointuser
	public static int TestPointuser(String comp) {
		int pointuser;
		// EGALITE
		if (comp.equalsIgnoreCase("pp") || comp.equalsIgnoreCase("ff") || comp.equalsIgnoreCase("cc")) {
			pointuser = 0;
		}
		// USER GAGNE
		else if (comp.equalsIgnoreCase("pc") || comp.equalsIgnoreCase("cf")|| comp.equalsIgnoreCase("fp")) {
			pointuser = 1;
		}
		// ELSE USER PERD
		else {
			pointuser = 0;
		}
		return pointuser;
	}

	// comparaison et retour pointpc
	// POINTS USER : 						EGALITE: PP FF CC 		USER GAGNE: PC CF FP			USER PERD: PF FC CP
	// POINTS PC :INVERSION !!!!!!! 		EGALITE: PP FF CC  		PC PERD: PC CF FP				PC GAGNE: PF FC CP
	public static int TestPointpc(String comp) {
		int pointpc;
		// EGALITE
		if (comp.equalsIgnoreCase("pp") || comp.equalsIgnoreCase("ff") || comp.equalsIgnoreCase("cc")) {
			pointpc = 0;
		}
		// PC GAGNE
		else if (comp.equalsIgnoreCase("pf") || comp.equalsIgnoreCase("fc")|| comp.equalsIgnoreCase("cp")) {
			pointpc = 1;
		}
		// ELSE PC PERD
		else {
			pointpc = 0;
		}
		return pointpc;
	}

	// comparaison et retour sommeuser
	/*public static int TestSommeUser(String comp, int pointuser) {
		// EGALITE
		if (comp.equalsIgnoreCase("pp") || comp.equalsIgnoreCase("ff") || comp.equalsIgnoreCase("cc")) {
			pointuser = 0;
		}
		// USERT GAGNE
		else if (comp.equalsIgnoreCase("pc") || comp.equalsIgnoreCase("cf")) {
			pointuser = 1;
		}
		// ELSE USER PERD
		else {
			pointuser = 0;
		}
		int sommeuser = sommeuser + pointuser;
		return sommeuser;
	}

	// comparaison et retour sommepc
	public static int TestSommePc(String choixuser, String choixpc, String comp, int pointuser, int pointpc,
			int sommeuser, int sommepc) {
		// EGALITE
		if (comp.equalsIgnoreCase("pp") || comp.equalsIgnoreCase("ff") || comp.equalsIgnoreCase("cc")) {
			pointuser = 0;
			pointpc = 0;
		}

		// USERT GAGNE
		else if (comp.equalsIgnoreCase("pc") || comp.equalsIgnoreCase("cf")) {
			pointuser = 1;
			pointpc = 0;
		}

		// ELSE USER PERD
		else {
			pointuser = 0;
			pointpc = 1;
		}
		sommeuser = sommeuser + pointuser;
		sommepc = sommepc + pointpc;
		return sommepc;
	}*/

	public static void resultatManche(int pointuser, int pointpc) {
		System.out.println("Resultat de la manche:");
		if (pointuser == pointpc) {
			System.out.println(
					"égalité :l utilisateur a :" + pointuser + " points" + " et l ordinateur " + pointpc + " points");
		}

		else if (pointuser > pointpc) {
			System.out.println("l utilisateur a gagné , il a marque :" + pointuser + " points" + " et l ordinateur "
					+ pointpc + " points");
		}

		else {
			System.out.println("l utilisateur a perdu, vous avez " + pointuser + " points, et l ordinateur a " + pointpc
					+ " points");

		}
	}

	public static void SommesDesManches(int sommeuser, int sommepc) {
		System.out.println("Somme des manches:");
		if (sommeuser == sommepc) {
			System.out.println(
					"égalité :l utilisateur a :" + sommeuser + " points" + " et l ordinateur " + sommepc + " points");
		}

		else if (sommeuser > sommepc) {
			System.out.println("l utilisateur a gagné , il a marque :" + sommeuser + " points" + " et l ordinateur "
					+ sommepc + " points");
		}

		else {
			System.out.println("l utilisateur a perdu, vous avez " + sommeuser + " points, et l ordinateur a " + sommepc
					+ " points");

		}

	}

	public static void resultatPartie(int sommeuser, int sommepc) {
		System.out.println("resultat de la partie:");
		if (sommeuser == sommepc) {
			System.out.println(
					"égalité :l utilisateur a :" + sommeuser + " points" + " et l ordinateur " + sommepc + " points");
		}

		else if (sommeuser > sommepc) {
			System.out.println("l utilisateur a gagné , il a marque :" + sommeuser + " points" + " et l ordinateur "
					+ sommepc + " points");
		}

		else {
			System.out.println("l utilisateur a perdu, vous avez " + sommeuser + " points, et l ordinateur a " + sommepc
					+ " points");

		}

	}

} // CHIFOUMI
