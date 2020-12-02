package tp4;

import outils.Clavier;

//creer ses paquetages
//objet (separation de classes et appels)
//fonctions et lancements
//encapsulation
//statique class methode variable groupe de code
//commenter
//this
//variables au debut
//une sortie par fonction
//separation de l affichage en variable
//cas non prevus
//exceptions
//tester tous les cas
//tester junit

public class Correction_tp4_exo1 {

	public static void main(String[] args) {
		loopFor();
		loopWhile();
		loopDoWhile();
			
	}
	
	public static void loopFor() {
		 int i, n, som;
	        som = 0;
	        for (i = 0; i < 4; i++) {
	            System.out.println(i+"-Donnez un entier");
	            n = Clavier.lireInt();
	            som += n;
	        }
	        System.out.println("Somme = " + som);
	}
	
	public static void loopWhile() {
		int i = 0;  
		int n;
		int som = 0;
		
		while (i < 4) {
			System.out.println(i+"-Donnez un entier");
            n = Clavier.lireInt();
            som += n;
            i++;
		   }
		System.out.println("Somme = " + som);
	}
	
	public static void loopDoWhile() {
		int i = 0;  
		int n;
		int som = 0;
		
		do {
			System.out.println(i+"-Donnez un entier");
            n = Clavier.lireInt();
            som += n;
            i++;
		   } while (i < 4);
			   
		   
		System.out.println("Somme = " + som);
	}

}
