package package_tp1;

public class Tantque {
	static String choixuser;

	public static void main(String[] args) {
		
		
		/*int chiffre=0;
		
		while(chiffre!=1) {
		System.out.println("entre le chiffre 1");
		int chiffre1 =outils.Clavier.lireInt();
		chiffre=chiffre1;
		}
		System.out.println("le chiffre est correct");*/
		
		
		/*String choixuser = "a";
		while (!choixuser.equals("P") | !choixuser.equals("p"))  {	
		System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
		String choixuser1 = outils.Clavier.lireString();
		choixuser=choixuser1;
		}*/
		
		choixuser = "a";
		while  (!choixuser.equals("p") && !choixuser.equals("P") && !choixuser.equals("f") && !choixuser.equals("F") && !choixuser.equals("c") && !choixuser.equals("C") ) {	
		System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
		String choixuser1 = outils.Clavier.lireString();
		choixuser=choixuser1;
		}
		
		System.out.println("--------------------FINA----------------------------");
		
		/*String choixuser = "a";
		if ((!choixuser.equals("P")) || (!choixuser.equals("p")))  {	
		System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
		String choixuser1 = outils.Clavier.lireString();
		choixuser=choixuser1;
		}*/
		
		/*String choixuser;
        do{
        System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
        choixuser = outils.Clavier.lireString();
        } while (!choixuser.equals("p") && !choixuser.equals("f") && !choixuser.equals("c"));*/
		
		
		
	}
}