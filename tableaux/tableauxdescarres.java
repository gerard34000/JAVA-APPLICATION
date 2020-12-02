package tableaux;

import java.util.Scanner;

public class tableauxdescarres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------------------------------tableau des carres-------------------------------------
		
				/*Écrire un programme qui crée un tableau 
				comportant les valeurs des carrés des n premiers nombres impairs,
				la valeur de n étant lues au clavier et
				qui affiche les valeurs sous la forme suivante :5 a pour carre 25*/
				
				//creation tableau des carres
				System.out.println("entrez le nombre de valeurs que vous souhaitez calculer");
				Scanner scan = new Scanner(System.in);
				int nbvaleurs =  scan.nextInt();
				int tailletableau =nbvaleurs+1;
				int [] tabcarre = new int[tailletableau];
					
				//entre valeur	
				
				
				int i;
				for(i=1;i<tailletableau;i++) {
					System.out.println("entrez une valeur a calculer");
					int valeur =  scan.nextInt();
					int carre =valeur*valeur;
					tabcarre[i]=carre;
				}
				
				//affichage final
				for(i=1;i<tailletableau;i++) {
					System.out.println(tabcarre[i]);
				}
				
	}

}
