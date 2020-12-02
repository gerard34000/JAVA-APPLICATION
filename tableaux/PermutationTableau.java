package tableaux;

import java.util.Arrays;

public class PermutationTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 3, 5, 4 };
		// inversion de 3 et 4
		swap2(tab, 0, 2);

	}

	// swapp avec temp
	public static void swap(int[] tab, int i, int j) {
		System.out.println(Arrays.toString(tab));
		int temp = tab[i];
		tab[i] = tab[j];
		tab[j] = temp;
		System.out.println(Arrays.toString(tab));
	}

	// swapp sans temp
	public static void swap2(int[] tab, int i, int j) {
		System.out.println(Arrays.toString(tab));
		tab[i] = tab[j] + tab[i];
		System.out.println(Arrays.toString(tab));
		tab[j] = tab[i] - tab[j];
		System.out.println(Arrays.toString(tab));
		tab[i] = tab[i] - tab[j];
		System.out.println(Arrays.toString(tab));

	}

	/*
	 * tu peux essayer cela : tab[i]=tab[j] - tab[i]; tab[j]=tab[j] - tab[i];
	 * [10:32] sur 2 lignes
	 */

}
