package package_tp1;

public class TP42 {

	public static void main(String[] args) {
		// final=constante
		final int fin =10;
		int somme = 0;
		int i = 0;
		while(i<fin) {
			//somme=+i; ecriture +i invalide  ici somme = i
			//System.out.println("i ="+i);
			somme += i;
			//int temp=somme;
			//System.out.println("somme+i= "+temp);
			i++;
		}
		System.out.println("la somme vaut :"+somme);
	}

}
