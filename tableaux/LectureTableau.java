package tableaux;

public class LectureTableau {

	public static void main(String[] args) {

		int[] tab = { 3, 10, 8, -2, 3, 0, -4 };
		display(tab);
	}

	// lecture contenu d un tableau
	public static void display(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
}
