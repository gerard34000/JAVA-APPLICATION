package package_tp1;

import outils.Clavier;

public class TP32 {

	public static void main(String[] args) {
		System.out.println("le programme ne s execute qu une fois sans boucle");
		int i;
		System.out.println("Saisissez un nombre");
		i = Clavier.lireInt();
		if(i !=1) {
			System.out.println("Vous avez saisi "+i);
			System.out.println("sortie sur if");
			System.exit(-1); 
		}
		else {
			System.out.println("sortie sur else");
			System.out.println("Bravo"+i);
			
		}
		
		
	}
	

}
