package package_tp1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import outils.Clavier;

public class TP33 {

	public static void main(String[] args) {
		System.out.println("le programme ne s execute qu une fois sans boucle");
		int i;
		System.out.println("Saisissez un nombre");
		i = Clavier.lireInt();
		System.out.println(i!=1?"vous avez saisi :"+i:"bravo vous avez saisi 1!");
		int j = fois2(i);
		System.out.println("le double de  "+i+" est :"+j );
		System.out.println("fin");
		
	}
		
	public static int fois2(int i) {
		int j =i*2;
		return j;
	}
	
	
	
}

 