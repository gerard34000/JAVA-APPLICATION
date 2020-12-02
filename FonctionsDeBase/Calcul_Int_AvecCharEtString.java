package FonctionsDeBase;

public class Calcul_Int_AvecCharEtString {

	public Calcul_Int_AvecCharEtString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a='1';
		int b=2;
		String c="3";
		int s=0;
		
		// SOMME int  = CHAR + CHAR = INT - EN CALCUL LE CHAR DEVIENT INT  !!!!!!!
		s=a+a;
		System.out.println("CHAR + CHAR  "+s);
		
		
		// SOMME INT  = STRING + STRING = STRING
		//s=c+c;
		System.out.println("STRING + STRING   "+s);
		
		// SOMME INT = CHAR +INT = INT - EN CALCUL LE CHAR DEVIENT INT  !!!!!!
		s=a+b;
		System.out.println("CHAR +INT   "+s);
		
		// SOMME INT = CHAR + STRING = STRING
		//s=a+c;
		System.out.println("CHAR + STRING   "+s); // LE STRING EST INMODIFIABLE ET PREND LE DESSUS
		

	}

}
