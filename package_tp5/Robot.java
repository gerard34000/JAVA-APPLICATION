package package_tp5;

public class Robot {
	String status;
	int speed;
	float temperature;
	
	void checkTemperature() {
		if (temperature > 660) {
			status = "retour au bercail";
			speed = 5;
		}
	}

	void showAttributes() {
		System.out.println("Statut : " + status);
		System.out.println("Vitesse : " + speed);
		System.out.println("Température : " + temperature);
	}
	
}
