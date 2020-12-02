package tamagoshi;

public class Tamagoshi_run {

	public static void main(String[] args) {

		Tamagoshi kagashi = new Tamagoshi("kagashi", 150, "bleu(e)");

		int life = Tamagoshi.life;

//---------------------------------DUREE DE VIE-------------------------------------

		int turn = 1;

		for (int i = 0; i < life; i++) {
			while (Tamagoshi.health > 0) {

				System.out.println("----------------------tour no :" + turn + "----------------------------------");
				kagashi.bonjour();
				Tamagoshi.ToColorHair();
				Tamagoshi.ToBeHappy();
				Tamagoshi.ToBeMasked();
				Tamagoshi.ToWash();
				Tamagoshi.GoTotheToilet();
				Tamagoshi.HaveChild();
				
				Tamagoshi.PracticeSport();
				Tamagoshi.Eat();
				Tamagoshi.ToRest();
				Tamagoshi.ToSmoke();
				
				turn++;
			}
			life = 0;
			System.out.println("je n ai plus de santé");

			// }

//------------------------------------DUREE DE VIE------------------------------------		
			System.out.println("-------------------------------------------------------------");
			System.out.println(Tamagoshi.name + " est mort");

		}
	}
}
