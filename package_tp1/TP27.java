package package_tp1;

public class TP27 {
	
	public static void main (String[] args) {
		/*int a=0;
		int b=0;
		System.out.println(b++);*/
		
		int n1 = 0;
		int n2 = 0;
		System.out.println("1 n1= "+n1+" n2= "+n2);  //0 0
		
		n1 = n2++;
		System.out.println("2 n1= "+n1+" n2= "+n2);  //affectation de n2 (rien) puis incrementation n2 (gauche puis droite)   0 1
		
		n1=++n2;
		System.out.println("3 n1= "+n1+" n2= "+n2);  //incrementation n2 puis affectation n2 puis rien   2 2
		
		n1=n1++; //attention !!!!!                   ne sert a rien, ne change rien donc 2 2
		System.out.println("4 n1= "+n1+" n2= "+n2);  //3 0
		
	}

}
