package package_tp1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;







public class INITIATION {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*System.out.print("1Hello World");
		System.out.print("\r");
		System.out.print("2Hello World \n retour ligne");
		System.out.print("\r");
		System.out.print("3Hello World \r retour chariot");
		System.out.print("\r");
		System.out.print("\t tabulation");
		System.out.print("\r");
		System.out.print("Hello World"); System.out.print("Aujourd'hui, nous sommes le 22 aout 2020");
		System.out.print("\r");
		System.out.println("Hello World"); System.out.print("Aujourd'hui, nous sommes le 22 aout 2020");*/
		
		// variable
		/*String phrase;
		phrase = "bonjour";
		System.out.print(phrase);*/
		
		//instance
		/*String phrase = new String();
		phrase="bonjour";
		System.out.print(phrase);*/
		
		//	declaration directe
		/*String phrase = "bonjour";
		System.out.print(phrase);*/
		
		//declaration directe avec instance
		/*String phrase = new String ("bonjour");
		System.out.print(phrase);*/
		
		//afficher jour+mois+annee
		/*int jour = 1;
		String mois = "aout";
		int annee = 2020;
		System.out.print("nous sommes le "+jour+" "+mois+" "+annee);*/
		
		//hello("bob");
		//aujourdhui();
		//nouveauFormatDate();
		//etatCivil();
		//saisir();
		//compter();
		//datetoString();
		stringToFormat();
	}
	
	//-----------------------hello dit bonjour--------------------------------------------------
	/** dit bonjour a une personne
	 * @author GER.AGUERRE 
	 * @param  s est le prenom
	 * @return le type est string
	 */
	/*public static void hello(String s) {
		System.out.print("bonjour "+s);
	}*/
	
	//--------------------------aujourdhui date--------------------------------------------------------
	/*public static void aujourdhui(){
		Date maDate = new Date();
		System.out.println("aujourd'hui nous sommes le " + maDate);
		long time = maDate.getTime();
		System.out.println("nombre ecoule " + time);
		System.out.print(maDate.getClass());
	}*/
	
	//-------------------------dateformatee      SimpleDateFormat----------------------------------------
	/*public static void datetoString() {
		Date ceJour = new Date();
	    SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
	    String resultat = formater.format(ceJour);
	    System.out.println(resultat);
	}*/
	
	public static void stringToFormat() {
		String date_saisie = "11/11/2011";
		SimpleDateFormat formatteur = new SimpleDateFormat("dd/MM/yyyy");
		Date resultat = null;
		try {
			resultat = formatteur.parse(date_saisie);
			System.out.print(resultat);
		} catch (ParseException error) {
			System.out.print(" erreur!!");
		}
		
	}

	
	
	//--------------------------etat civil------------------------------------------------- 
	/*public static void etatCivil(){
		
		// nom prenom
		 String nom = "AGUERRE";
		 String prenom= "gerard";
		 System.out.println("Je suis "+nom+" "+prenom);
		 
		 //date naissance
		 Date maDate = new Date();
		 System.out.println("Je suis né le "+maDate);
		 
		 //ville naissance
		 String ville = "mauleon";
		 System.out.print("a "+ville);
	}*/

	//-----------------------------scanner------------------------------------------------------------
	 /*public static void saisir(){
		 //saisie du nom
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Veuillez saisir votre nom apres vous etre mis sur la ligne vide de la console");
		 //String nom = sc.nextLine();
		 System.out.println("bonjour "+sc.nextLine());
		 
		 //saisie de l age
		 Scanner sc2 = new Scanner(System.in);
		 System.out.println("Veuillez indiquer votre age apres la ligne vide de la console " );
		 //int age = sc.nextLine();
		 System.out.println("Vous avez  "+sc2.nextLine()+ "ans");
	}*/
	
	/*public static void compter() {
		int i=1;
		System.out.println("i= "+i);
		i=i+1;
		System.out.print("i= "+i);
	 }*/
}

	
