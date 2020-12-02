package package_tp1;

public class Cercle {
	
	static int rayon = 100;
	
	public static void main(String[] args) {
		Cercle c1 = new Cercle();
		c1.rayon = 200;		
		Cercle c2 = new Cercle();
		c2.rayon = 50;
		
		
		System.out.println("c1 ="+c1.rayon);
		System.out.println("c2 ="+c2.rayon);
		
		//statique :rend l objet visible partout (projet?):puisque appartient a la classe et pas a l instance
		//appel depusi classe ou instance
		// pour rendre constant,  static final
		// static variable1 impose la derniere affectation de variable1 a tous les variable1 deja defini
		//les methodes statiques n ont pas acces aux methodes non statiques
		//static bloc de code: execute une seule fois
		
		//for(;;) boucle sans fin
	}

}
