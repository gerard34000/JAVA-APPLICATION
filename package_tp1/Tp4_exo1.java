package package_tp1;

import outils.Clavier;

public class Tp4_exo1 {

	public static void main(String[] args) {
		/*FOR
		int somme =0;
		// pour i a 3
		for(int i=1;i<=3;i++) {
		//message entrez un entier
		System.out.println("entrez un entier :");
		//lire l entree
		int entree = Clavier.lireInt();
		System.out.println("entree ="+entree );
		somme+=entree;
		System.out.println("somme = "+somme);
		System.out.println("-----------");
		}
		
		//somme des entiers entres
		System.out.println("--------------------------------------------------");
		System.out.println("programme fini: la somme des entiers entrés est :"+somme );
		
		long millis = 1000;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*int somme =0;
		int i=1;
		// pour i a 3
		while(i<=3) {
		//message entrez un entier
		System.out.println("entrez un entier :");
		//lire l entree
		int entree = Clavier.lireInt();
		System.out.println("entree ="+entree );
		somme+=entree;
		System.out.println("somme = "+somme);
		System.out.println("-----------");
		i++;
		}
		
		//somme des entiers entres
		System.out.println("--------------------------------------------------");
		System.out.println("programme fini: la somme des entiers entrés est :"+somme );
		
		long millis = 1000;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		int i=1;
		int somme = 0;
		do {
			//message entrez un entier
			System.out.println("entrez un entier :");
			//lire l entree
			int entree = Clavier.lireInt();
			System.out.println("entree ="+entree );
			somme+=entree;
			System.out.println("somme = "+somme);
			System.out.println("-----------");
						
			i++;
			
		}while((i<=3));
		
			//somme des entiers entres
			System.out.println("--------------------------------------------------");
			System.out.println("programme fini: la somme des entiers entrés est :"+somme );
		
		long millis = 1000;
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}	

