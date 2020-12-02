/**
 * 
 */
package tableaux;

import java.util.Scanner;

import outils.Clavier;

public class CreationTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Définition du tableau :Type [] nomtableau ;
		// Création du tableau: nomtableau= new Type [taille] ;
		// Affectation d'une valeur : nomtableau[numerocellule]=valeurdetype

		// -------------------------------CreationTableaux---------------------------------------------------

		// -------------creation en 1 fois--------------------
		int[] t1 = new int[1];

		// -------------creation en 1 fois--------------------
		String[] t2 = new String[1];

		// ----------------creation separee du
		// tableau:type,taille,affectation-------------
		int t[];
		t = new int[5];
		t[0] = 1;

		int[] t4;
		t4 = new int[10];
		t4[0] = 1;

		// -----------(type et taille) puis affectation ------------------
		int[] t3 = new int[10];
		t3[0] = 0;

		// ---------------creation puis affectation ------------------
		String[] tableaudechaine = new String[10]; // pour affecter, il faut que l objet existe
		tableaudechaine[6] = "coucou";

		// ---------entrer une variable dans un tableau-------------
		int[] t5 = null; // pour affecter, il faut que l objet existe
		int i = 8;
		t5[1] = i;

		// ------entrer un tableau dans une variable-----------------
		int[] t6 = null; // pour affecter, il faut que l objet existe
		i = t6[0];

		// TABLEAU OBJET  !!!!!!!!!!!!!!!!!
		 // int nombreenfants = 5;
		 // personne [] famille;
		 //famille=new persone[2+nombreenfants];
		 
		// CREATION EN NOMBRE----------------------------------------------------------
		// -------------------creation en 1 fois puis affectation-------------
		int[] tab1 = new int[7];
		tab1[0] = 3;
		tab1[1] = 10;
		tab1[2] = 8;
		tab1[3] = 2;
		tab1[4] = 10;
		tab1[5] = 0;
		tab1[6] = 4;

		// --------------------creation en une fois avec arraylist-------------
		int[] tab2 = { 3, 10, 8, -2, 3, 0, -4 };
		
		
		
		

	}

}
