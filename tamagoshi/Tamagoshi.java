package tamagoshi;

public class Tamagoshi {
	// -----------------------------------definition:variables---------------------------------------------------
	// parametrable
	public static String name = "";
	public static int height = 0; // meters
	public static String color = "";
	static int friend=5;
	// non parametrable
	static int life = 3; // number of turns
	static int health = 1;
	

	// -----------------------------------constructeurs-----------------------------------------------------------
	public Tamagoshi(String name, int height, String color) {
		this.name = name;
		this.height = height;
		this.color = color;
	}

	/*
	 * public tamagoshi(String name) { //1 erreur duplique !!!!!!!!!
	 *  this.name =	 name; }
	 
	 * public tamagoshi(int height) { //erreur duplique !!!!!!!!!
	 * this.height=height; }
	 */

	public Tamagoshi(String color) {
		this.color = color;
	}

	public Tamagoshi() { // par defaut
		this.name = "tagamoshi";
		this.height = 1;
		this.color = "bleu";
	}

	// ------------------------------------fonctions-------------------------------------------------------------
	
	public static void bonjour() {
		System.out.println("bonjour, je m appelle " + getName() + ", je mesure " + getHeight()
				+ " metres ,et je suis de la couleur " + getColor());
	}

	public static void Eat() {
		System.out.println(" \n");
		System.out.println("voulez vous manger des sushis? 1 pour oui, 0 pour non");
		int answerfood = outils.Clavier.lireInt();
		if (answerfood == 1) {
			System.out.println("miam, j ai mange des sushis");
			++health;
			CountMyHealth();
		} else {
			--health;
			CountMyHealth();
			if (health<1) {	System.exit(1);	}}
			
		}
		
	

	public static void CountMyHealth() {
		System.out.println("ma santé est de :" + health + " points de santé");

	}

	public static int PracticeSport() {
		System.out.println(" \n");
		System.out.println("voulez vous faire du sport? 1 pour oui, 0 pour non");
		int answersport = outils.Clavier.lireInt();
		if (answersport == 1) {
			System.out.println("j ai fait du sport sans effort!");
			++health;
			CountMyHealth();
		}
		return health;
	}

	public static void ToRest() {
		System.out.println(" \n");
		System.out.println("voulez vous dormir? 1 pour oui, 0 pour non");
		int answersleep = outils.Clavier.lireInt();
		if (answersleep == 1) {
			System.out.println("j ai dormi!");
			++health;
			CountMyHealth();
		} else {
			--health;
			CountMyHealth();
			if (health<1) {	System.exit(1);	}}
			
		}
		

	public static void ToColorHair() {
		System.out.println(" \n");
		System.out.println("dois je me teindre les cheveux en roux? 1 pour oui, 0 pour non");
		int answerhaircolor = outils.Clavier.lireInt();
		if (answerhaircolor==1) {
		System.out.println("My god, j ai les cheveux roux ! je perd 3 amis");
		friend = friend-3;
		CountMyFriends();}
	}
	
	public static void ToBeHappy() {
		System.out.println(" \n");
		System.out.println("je suis heureux, est ce que je saute? 1 pour oui, 0 pour non");
		int answerjump = outils.Clavier.lireInt();
		if(answerjump==1) {
		System.out.println("je suis rigolo,et donc je gagne 1 ami");
		++friend;
		CountMyFriends();
		}
	}
	
	public static void CountMyFriends() {
		System.out.println(" j'ai "+friend+" amis");
	}
	
	public static void ToBeMasked() {
		System.out.println(" \n");
		System.out.println("est ce que je garde mon masque? 1 pour oui, 0 pour non");
		int answermask = outils.Clavier.lireInt();
		if (answermask == 0) {
			System.out.println("je suis moche et je perd 1 ami");
			--friend;
			CountMyFriends();
		}
	}
	

	public static void ToWash() {
		System.out.println(" \n");
		System.out.println("est ce que je me lave? 1 pour oui, 0 pour non");
		int answerwash = outils.Clavier.lireInt();
		if (answerwash == 0) {
			System.out.println("je sens pas bon et je perd 1 ami");
			--friend;
			CountMyFriends();
		}
	}
	
	public static void GoTotheToilet() {
		System.out.println(" \n");
		System.out.println("voulez vous allez aux toilettes,1 pour oui, 0 pour non");
		int answertoilet = outils.Clavier.lireInt();
		if (answertoilet==0) {
			System.out.println("je ne sens pas bon , je perd 1 ami");
			CountMyFriends();
		}
	}
	
	public static void HaveChild() {
		System.out.println(" \n");
		System.out.println("voulez vous vous reproduire,1 pour oui, 0 pour non");
		int answerchild = outils.Clavier.lireInt();
		if (answerchild==1) {
			System.out.println("j ai un enfant, je ne voie plus mes amis:je perd 1 ami");
			--friend;
			CountMyFriends();
		}
	}
	

	public static void ToSmoke() {
		System.out.println(" \n");
		System.out.println("voulez vous fumer? 1 pour oui, 0 pour non");
		int answersmoke = outils.Clavier.lireInt();
		if (answersmoke == 1) {
			System.out.println("je gagne 1 ami et je perd de la sante");
			++friend;
			--health;
			CountMyHealth();
			CountMyFriends();
			if (health<1) {	System.exit(1);	}}
	}
		 		
			
	
	
	// ------------------------------------setters-----------------------------------------------------------------
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// ------------------------------------getters----------------------------------------------------------------
	public static String getName() {
		return Tamagoshi.name;
	}

	public static int getHeight() {
		return Tamagoshi.height;
	}

	public static String getColor() {
		return Tamagoshi.color;
	}

	public int getLife() { // acces statique
		return this.life;
	}

	public int getHealth() {
		return this.health;
	}
}
