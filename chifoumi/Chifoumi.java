package chifoumi;

//tester tous les cas
//tester junit

public class Chifoumi {
	
	public static void main(String[] args) {
		
		// INITIALISATION
		
		
		//String pierre = "p";
		//String ciseaux = "f";
		//String feuille = "s";

		int pointuser = 0;
		int pointpc = 0;
		
		int sommeuser =0;
		int sommepc = 0;
		
		int reponse ;
		// -------------------------------------------------MESSAGE REJOUER TANT QUE----------------------------------------------------------
		
			do {
			
			//----------------------------------------------CHOIX USER ET CHOIX PC--------------------------------------------------------
			
			
			
			//lancerChoixUser();
			//lancerChoixPc();
			
			//erreur d entree non traitee	

				String choixuser = "a";
				while  (     !choixuser.equals("p") && !choixuser.equals("P") && !choixuser.equals("f") && !choixuser.equals("F") && !choixuser.equals("c") && !choixuser.equals("C") ) {	
				System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
				String choixuser1 = outils.Clavier.lireString();
				choixuser=choixuser1;
				}
			
			/*System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
			String choixuser1 = outils.Clavier.lireString();
			String choixuser=choixuser1;*/
			
			
			
			
			String choixpc = null;
			int randomNum = (int) (Math.random() * 101); // 0 to 100
			if((0<=randomNum)&&(randomNum<17)){choixpc = "c";};
			if((17<=randomNum)&&(randomNum<34)){choixpc = "f";};
			if((34<=randomNum)&&(randomNum<51)){choixpc = "p";};
			if((51<=randomNum)&&(randomNum<67)){choixpc = "c";};
			if((67<=randomNum)&&(randomNum<84)){choixpc = "p";};
			if((84<=randomNum)&&(randomNum<101)){choixpc = "f";};
			System.out.println(" le choix du pc est :"+choixpc);
			
			
			
			// ---------------------------------------------LE TEST COMPARATIF------------------------------------------------------------
			String comp = choixuser+choixpc;
			System.out.println("la comparaison est :" + comp);
			
			
			//----------------------------------------------TESTS DE VALIDATION-------------------------------------------------------------
			// en manuel: trop complique:on peut affecter des valeurs a comp mais il faut devalider la question pour la nouvelle manche
			//comme je n ai pas mis des fonctions, on ne peut pas tester via junit

			// ------------------------------TESTS MANUELS (DEVALIDER CHOIX UILISATEUR ET// PC)---------------------------------------------
			

			// ---------------------------------------------COMPARAISON ET POINTS-------------------------------------------------------------
			// FORCE: pierre>ciseaux, feuille>pierre, ciseaux>feuille
			// POINTS: EGALITE PP FF CC 	USER GAGNE PC CF 	USER PERD PF FC CP

			// EGALITE
				
			if ((comp.equals("pp"))||(comp.equals("ff"))||(comp.equals("cc"))||(comp.equals("Pp"))||(comp.equals("Ff"))||(comp.equals("Cc")))  {
				pointuser = 0;
				System.out.println("EGALITE");
			}		
				// USERT GAGNE
			
			else if ((comp.equals("pc"))||(comp.equals("cf"))||(comp.equals("Pc"))||(comp.equals("Cf")))  {
					pointuser = 1;
					System.out.println("GAGNE");
				}
					// ELSE USER PERD
			else {
				pointuser = -1;
				System.out.println("PERDU");
			}

			// -----------------------------------------------AFFICHAGE RESULTATS DE LA PARTIE----------------------------------------------------------
			System.out.println("VOTRE SCORTE EST DE  " + pointuser);
			
			//-----------------------------------------------MESSAGE NOUVELLE MANCHE-------------------------------------------------------------------
			//erreur d entree non traitee
			
			
			
			
				System.out.println("voulez vous rejouer une autre manche? entrez 1 pour oui, o (zero) pour non");
				int reponse1 = outils.Clavier.lireInt();
				reponse=reponse1;				
			
			
			} while (reponse==1);
		
		
		// -------------------------------------------------CALCUL DES SOMMES DES MANCHES------------------------------------------------------------
		sommeuser += pointuser;
		sommepc += pointpc;

		// ------------------------------------------------AFFICHAGE MESSAGE FINAL DES MANCHES : SOMME ET GAGNANT PERDANT---------------------------------------
		if (sommeuser>sommepc) {System.out.println("l utilisateur a gagné , il a marque :"+sommeuser+" points"+"et l ordinateur "+sommepc+" points");}
		else {System.out.println("l utilisateur a perdu, vous avez "+sommeuser+ " points, et l ordinateur a "+sommepc+" points");
		
		
		
		
	} // MAIN
	
	
	
	/*//----------------------------------------------------------FONCTIONS-----------------------------------------------------------------------------

	// ---------------- CHOIX UTILISATEUR ET CHOIX  PC---------------------------------------------
	 * 
	 * variables non vues  en externe    !!!!!!! retour choixuser et choixpc non integres a choixuser et choix pc(variables du main) (et pas en etat de resoudre(fatigue)
	// CHOIX UTILISATEUR
			public static String lancerChoixUser() {
				System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
				String choixuser = outils.Clavier.lireString();
				return choixuser;
			}

			// CHOIX PC
			public static String lancerChoixPc(){
				String choixpc = null;
				int randomNum = (int) (Math.random() * 101); // 0 to 100
				if((0<=randomNum)&&(randomNum<34)){choixpc = "p";};
				if((34<=randomNum)&&(randomNum<67)){choixpc = "f";};
				if((67<=randomNum)&&(randomNum<101)){choixpc = "c";};
				System.out.println(" le choix du pc est :"+choixpc);
				return choixpc;
			}*/
			
			
			
			
			

	}  //MAIN	
	
} // CHIFOUMI
	

	
	
