package tp4;

public class VerifentreeDeDonneeetdoublevariable {

	public static void main(String[] args) {
		
		//obligation p ou f ou c
		//-------------------------------------------------------------
		String choixuser= "a";
		//choix attendu (p ou f ou c ) donc la condition est non ((p ou f ou c )= non p et nonf et non c
		while(!choixuser.equals("p")&&!choixuser.equals("P")&&!choixuser.equals("f")&&!choixuser.equals("F")&&!choixuser.equals("c")&&!choixuser.equals("C")) {
		System.out.println("veuillez entrer un choix en minuscule: \n p pour pierre, f pour feuille, c pour ciseaux   :");
		String choixuser1 = outils.Clavier.lireString();
		choixuser=choixuser1;
		}
		
		

	}
}
