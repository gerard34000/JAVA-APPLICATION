package tableaux;

public class FlagTableau {

	
	public static void main(String[] args) {
		int[] tab1 = new int[7];
		
		tab1[0] = 3;
		tab1[1] = 10;
		tab1[2] = 8;
		tab1[3] = 2;
		tab1[4] = 10;
		tab1[5] = 0;
		tab1[6] = 4;

		int[] tab2 = {3, 10, 8, -2, 3, 0, -4};
	
		
		if (checkNegative(tab2) == true) {
			display(tab2);
		}
		
		checkNegativeDisplay(tab2);
		
		
	}
	
	// lecture contenu d un tableau
	public static void display(int[] tab) {
		System.out.println("----------------lecture du tableau---------------------");	
		for (int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		System.out.println("-------------------------------------------------------");	
	}
	
	// parcours de tout un tableau et affichage uniquement des negatifs
	public static boolean checkNegative(int[] tab) {
		System.out.println("----------------lecture des negatifs---------------------");
		boolean flag = false;
		for (int j=0; j<tab.length; j++) {
			if (tab[j] < 0) {
				flag = true;
				System.out.println(tab[j]+" est negatif");
			}
		}
		System.out.println("--------------------------------------------------------");	
		return flag;
	}
	
	public static void checkNegativeDisplay(int[] tab) {
		System.out.println("-------------------CHECK VRAI FAUX-------------------------------------");	
		boolean flag = false;
		for (int j=0; j<tab.length; j++) {
			if (tab[j] < 0) {
				flag = true;
			}
		}
		System.out.println(flag);
		System.out.println("-----------------------------------------------------------------------");	
	}
	
}

