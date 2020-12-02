package tableaux;

import java.util.Scanner;

import outils.Clavier;

public class SaisirTableau {

	public static void main(String[] args) {
		// saisir un tableau
		// Lit dans un tableau 5 valeurs fournie au clavier 
		// En calcule et en affiche la moyenne, la plus grande et la plus petite valeur
		//--------------------------------------------------------
		
		// creation tableaunotes
		System.out.println("entrez la quantite totale de notes");
		/*Scanner scan =new Scanner(System.in); 
		note1 = scan.nextFloat();*/
		int qte = Clavier.lireInt(); // classe de outils
		int nbnotes = qte;
		Float[] tableaunotes = new Float[nbnotes];

		// entrer les valeurs du tableau
		for (int t = 0; t < nbnotes; t++) {
			System.out.println("entrez une valeur entre 0 et 20");
			/*Scanner scan =new Scanner(System.in); 
			note1 = scan.nextFloat();*/
			Float note = Clavier.lireFloat(); // classe de outils dans le meme projet
			tableaunotes[t] = note;
		}
		
		// calcul somme
		Float somme = (float) 0;
		for (int t = 0; t < nbnotes; t++) {
			somme = somme + tableaunotes[t];
		}
		// calcul moyenne
		float moyenne = somme / nbnotes;
		System.out.println("la moyenne est de :" + moyenne);

		/* ---------------------------------VAL MAX ET MIN EN 2 PASSES------------------------------------
		// max
		float max = 0;
		//parcours de 1 a taille
		for (int i = 1; i <= nbnotes; i++) {
			//parcours de parcours=j
			//parcours de contenu tableau depuis 0
			int j=0;
			if(tableaunotes[j+1]>tableaunotes[j]) {	max= tableaunotes[j+1];};
			
		}
		System.out.println("la valeur maximum est :"+max);
		
		// min
		float min = 0;
		for (int i = 1; i < nbnotes; i++) {
			int j = 0;
			if(tableaunotes[j+1]>tableaunotes[j]) {	min= tableaunotes[j];};
			
		}
		System.out.println("la valeur minimum est :"+min);
		
		//--------------------------------------------------------------------------------*/
		
		//-----------------------------VAL MAX ET MIN EN 1 PASSE TRI A BULLE------------------------------
			float maxVal = Float.MAX_VALUE;
		    float minVal = Float.MIN_VALUE;
		    	  
	       //for (Float nombre:tableaunotes)
	         //System.out.print(nombre+" ");
	  
	       for(int t1 = 0; t1 < tableaunotes.length; t1++){  //depart a 0 puisque t1 utilise comme cellule tableau
	         if(tableaunotes[t1]< maxVal)
	           maxVal = tableaunotes[t1];	// valeur min que l on fait descendre au fur et a mesure en la mettant temporairement en valeur max
	         if(tableaunotes[t1] > minVal)
	           minVal = tableaunotes[t1];	// valeur max que l on fait monter au fur et a mesure en la mettant temporairement en valeur min
	       }	
	       
	     	
	       
	  
	       System.out.print("\nValeur minimale = "+maxVal);
	       System.out.print("\nValeur maximale = "+minVal);

	}

}
