package tableaux;


import java.util.Arrays;

public class TriTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] orderChar = { 'g','r','e','t','a' };
		char[] orderChar2 = { 'g','r','e','t','a' };

		System.out.println(maxiChar(orderChar));
		System.out.println(minChar(orderChar));

		trieChar(orderChar);
		System.out.println(Arrays.toString(orderChar));

		trieCharBis(orderChar2);
		System.out.println(Arrays.toString(orderChar2));

	}

	public static char maxiChar(char[] tab) {
		char result = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > result) {
				result = tab[i];
			}
		}

		return result;
	}

	public static char minChar(char[] tab) {
		char result = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < result) {
				result = tab[i];
			}
		}

		return result;
	}

	public static void trieChar(char[] tab) {
		char charInter;
		int compteurPermut = 0;
		int compteurIteration = 0;
		for (int i = 0; i < tab.length-1; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[i] > tab[j]) {

					charInter = tab[i];
					tab[i] = tab[j];
					tab[j] = charInter;
					compteurPermut++;

				}
				compteurIteration++;
			}

		}
		System.out.println("Compteur iteration : " + compteurIteration + "\nCompteur Permutation: " + compteurPermut);

	}

	public static void trieCharBis(char[] tab) {
		char charInter;
		int compteurPermut = 0;
		int compteurIteration = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				if (tab[i] < tab[j]) {

					charInter = tab[i];
					tab[i] = tab[j];
					tab[j] = charInter;
					compteurPermut++;
				}
				compteurIteration++;
			}

		}
		System.out.println("Compteur iteration : " + compteurIteration + "\nCompteur Permutation: " + compteurPermut);

	}
}
