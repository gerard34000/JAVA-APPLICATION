package tp4;

public class random {

	public static void main(String[] args) {
		String choixpc = null;
		int randomNum = (int) (Math.random() * 101); // 0 to 100
		if((0<=randomNum)&&(randomNum<34)){choixpc = "p";};
		if((34<=randomNum)&&(randomNum<67)){choixpc = "f";};
		if((67<=randomNum)&&(randomNum<101)){choixpc = "c";};
		System.out.println(" le choix du pc est :"+choixpc);
	}

}
