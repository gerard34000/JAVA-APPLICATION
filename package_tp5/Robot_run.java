package package_tp5;

class Robot_run {
	

	public static void main(String[] arguments) {
		Robot dante = new Robot();
		dante.status = "explorant";
		dante.speed = 2;
		dante.temperature = 510;
		dante.showAttributes();
		System.out.println("Augmentation vitesse ... 3.");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changement temp�rature ... 670.");
		dante.temperature = 670;
		dante.showAttributes();
		System.out.println("V�rification de la temp�rature.");
		dante.checkTemperature();
		dante.showAttributes();
	}

	

}