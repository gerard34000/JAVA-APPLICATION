package tp4;

public class TirageAleatoirePlusEntreeETComparaisonetdoublevariable {

	public static void main(String[] args) {
		String choixpc="a";
		String choixpc1;
		int randomNum = (int) (Math.random() * 101); // 0 to 100
		//les aleatoires balayent large, donc les sequences identiques doivent etre rapprochees afin de ne pas etre appeleees trop souvent
		if ((0 <= randomNum) && (randomNum < 10)) {choixpc = "f";};
		if ((10 <= randomNum) && (randomNum < 20)) {choixpc = "f";};
		if ((20 <= randomNum) && (randomNum < 30)) {choixpc = "p";};
		if ((30 <= randomNum) && (randomNum < 40)) {choixpc = "p";};
		if ((40 <= randomNum) && (randomNum < 50)) {choixpc = "c";};
		if ((50 <= randomNum) && (randomNum < 60)) {choixpc = "c";};
		if ((60 <= randomNum) && (randomNum < 70)) {choixpc = "p";};
		if ((70 <= randomNum) && (randomNum < 80)) {choixpc = "f";};
		if ((80 <= randomNum) && (randomNum < 90)) {choixpc = "c";};
		if ((90 <= randomNum) && (randomNum < 100)) {choixpc = "c";};
		choixpc1 = choixpc;
		System.out.println("le choix pc est :"+choixpc);

	}

}
