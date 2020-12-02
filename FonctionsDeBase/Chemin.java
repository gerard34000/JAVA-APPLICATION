package FonctionsDeBase;

import javax.swing.JList;
import javax.swing.JTextField;

import cat.Cat;
import package_tp1.Cercle;
import tamagoshi.Tamagoshi;

public class Chemin {
	

	public Chemin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// chemin: ON NE PEUT INTERVENIR QUE SUR DES CHOSES FIXES:UNE CLASSE OU UN ATTRIBUT et qui existent
		
		//APPEL EXTERNE-------------------------------------------------------------------------------
		// EXTERNE = attributs:tout ce qui est dans des fonctions et qui doit etre externalise
		
		
		// ACCES CLASSE :VIA IMPORT OU PAQUETAGE OU LIBRAIRIE USER/LIBRAIRIE JRE(chemin ou build) 
		
		//acces via chemin
		//acces distant a une CLASSE(nom qualifie)-entraine un import
		Cercle c3 = new package_tp1.Cercle(); //appel fonction
		Tamagoshi.name="iashi";	//appel attribut
		Cat.age=2;	//appel attribut
		//rayon ?????
		
		//APPEL INTERNE------------------------------------------------------------------------------------
		// ACCES ATTRIBUT EN EXTERNE: VIA "PUBLIC STATIC":mais interdit this.
		// ACCES ATTRIBUT INTERNE: PAR "SORTIE DE BLOC DE CODE EN DECLARATION EXTERNE AVEC AFFECTATION INTERNE"
		int quantite;  //declaration en attribut et valeur quantite dans une fonction
		
		//ATTEINDRE UNE FONCTION DECLAREE DANS DU CODE:declarer en attributs une variable de la fonction
		//1 fonction bloquee dans du code,on cree donc la variable
		//JTextField InList  = new JTextField();
		//inlist =InList; //declaration
		
		//2 appel attribut
		//private JTextField inlist; //instanciation 
		
		
		
		//en parametre des que un attribut doit etre appele depuis la fonction  !!!!!
		
		// attribut static
		
		//CLIC SOURIS LOCALISATION INDICE DE LISTE
		//JList.locationToIndex(mouseEvent.getPoint());
		
		
		
		
		
		
		
		
		
		
	}

}

