/**
 * 
 */
package package_tp1;

import outils.Clavier;

/** * @author GER.AGUERRE * */

public class tp4_exercice_2 {

	/** * @param args */
	public static void main(String[] args) {
		int i = 1;
		int somme =0;
		int moyenne=0;
		//entrer 4 notes
		while (i<=4) {
			System.out.println("veuillez entrer une note :");
			int entree = Clavier.lireInt();
			entree += entree;
			somme = entree;
			i++;
		};
		
		// �crire un programme qui donne la moyenne de 4 notes
		moyenne = somme/4;
		
		// �crire un programme qui selon la moyenne donne une mention
		// � recal� � : pour une moyenne strictement inf�rieure � 8
		// � admissible � : pour une moyenne entre 8 et 10
		// � admis �: pour une moyenne sup�rieure ou �gale � 10
		
		if (moyenne<8) {System.out.println("recal�");}
		if ((moyenne>=8)&&(moyenne<10)) {System.out.println("admissible");}
		else {System.out.println("admis");}
	}
}