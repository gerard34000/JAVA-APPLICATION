package package_tp1;

public class TP1 {
	public static void main(String[] args) {
		//ordre par taille
		// boolean/char/byte/short/int/long/float(F)/double
		// char+char=int
		// conversion inverse (hors systeme) = cast
		
		System.out.println("en dessous de int, 2 valeurs de type diffts sauf boolean "
				+ "additionnées deviennent int, apres int, 2 valeurs additionnees sont"
				+ " converties au plus haut");

		/* 
		 * // char+int= int 	'3'+1=52 (au plus haut) char a = '3'; int b = 1;
		 * System.out.println(a + b); // int s =a+b;
		 * 
		 * // char+int= int 	'A'+2 = 67 (conversion decimale ???) char c = 'A';
		 * int d = 2; System.out.println(c + d); // int s =a+b;
		 * 
		 * // string +int= concatenation 	3+"Abc"=3Abc int e = 3; String f =
		 * "Abc"; System.out.println(e + f); // int s =a+b;
		 * 
		 * // string +int= concatenation 	"A"+2 = A2 String g = "A"; int h =
		 * 2; System.out.println(g + h); // int s =a+b;
		 * 
		 * // int+double = double 	1+1.2222 = 2.222      int i = 1; double j = 1.222;
		 * System.out.println(i + j); // int s= a+b; l erreur donnee par cette fonction
		 * permet de savoir que le // rsultat est de type double
		 * 
		 * // int+byte 		10+8 =18 donne un int (au plus haut) int k = 10; byte l = 8;
		 * System.out.println(k + l); // int s = k+l;
		 * 
		 * // int+short 	10+8 =18 donne un int (au plus haut)
		 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!! int m = 10; short n = 8; System.out.println(m +
		 * n); // int s = m+n;
		 * 
		 * // int+float = un float  int o = 10; float p =0,8.11111F; System.out.println(o + p); // float s = o+p;
		 * 
		 * // long+int 		10+8 =18 donne un long (au plus haut) long q = 10; int r = 8;
		 * System.out.println(q + r); // long s = q+r;
		 * 
		 * // int+boolean 	1+false= cas non prevu int s = 10; boolean t = false;  !!!!!!!!!!!!!!!!!!!!!!!!!!
		 * System.out.println(s + t); cas non prevu // int somme = s+t;
		 * 
		 * // byte+short 	1+3= donne un int !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! byte u = 1; short v = 3;
		 * System.out.println(u+v); //int somme = u+v;
		 * 
		 * 
		 * //ajouter un entier a une decimale double somme = 1+ 1.22;
		 * 
		 * // cast passer b int en short avant de le mettre dans a int b = 1; short a =
		 * (short)(b); // Si b est trop grand pour tenir sur 2 octets ( taille du short)
		 * alors les bits en trop seront perdus. // meme si short a 2 octets, on ne peut
		 * pas affecter, un char à un short.il faut un cast !! typologie differente !!
		 * //idem pour le type byte.typologie differente !! //conversion sans perte si
		 * on respecte l odre des tailles char/byte/short/int/long/float(F)/double
		 * 
		 

		// wrapper creer une enveloppe(objet) pour element
		// ----------------------------------------------------------------
		// Boolean/Character/Byte/Short/integer/Long/Float/Double/

		int a = 2; //affectation
		int b = 3;
		a=b;       
		// creer un objet integer de valeur o avec des proprietes
		Integer c = new Integer(0);
		System.out.println(b);
		//a=b boxing de primitif a wrapper
		//b=a unboxing de wrapper a primitif
		
		//boxing
		//creation objet b integer avec valeur 0
		//Integer b = new Integer(0); ou Integer integer = 0; ou Integer integer = Integer.valueOf(0);
		//int a = integer; ou int a = integer.intValue();*/
		int a =1;
		/*a +=10;
		System.out.println(a);
		a -=10;
		System.out.println(a);
		a *= 10;
		System.out.println(a);
		a /= 10;
		System.out.println(a);
		a %= 10;
		System.out.println(a);*/
		a ^= 10;
		System.out.println(a);
		a <<= 10;
		System.out.println(a);
		a >>= 10;
		System.out.println(a);
		a ^= 10;
		System.out.println(a);
		a >>>= 10;
		System.out.println(a);
		
		
		
		

	}
}
