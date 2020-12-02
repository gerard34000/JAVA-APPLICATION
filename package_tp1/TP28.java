package package_tp1;

public class TP28 {

	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2); // ref differente  faux: == compare  le contenu total (valeur et refs .type???)
		System.out.println(n1 != n2); // ref differente
	}

}
