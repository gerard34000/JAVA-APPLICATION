package tp3;

public class Correction_tp3_exo1 {
	//commenter
	//variables au debut
	//une sortie par fonction
	//objet
	//this
	//paquetage
	//encapsulation
	//statique class methode variable groupe de code
	//tester tous les cas
	
	public static void main(String[] args) {
		System.out.println("Veuillez saisir votre note");
		double note = outils.Clavier.lireDouble();
		
		// test du code
		for (double i = -1; i <= 22; i = i + 0.5) {
			System.out.println("note : " + i);
			admissionNote(i);
		}
		
	}

	public static void mention(double note) {
		// decouper l affichage en variable !!!!!
		String mention = "Vous avez la mention "; // M�thode 2
		if (note >= 16) {mention += "tr�s bien";}
		else if (note >= 14) {mention += "bien";} 
		else if (note >= 12) {mention += "assez bien";} 
		else {mention = "";}
		System.out.println(mention);
	}

	public static void admissionNote(double note) {
		String admission = "Vous �tes ";

		if (note >= 0 && note <= 20) {
			if (note >= 10) {admission += "admis.";mention(note);} 
			else if (note >= 8) {admission += "sur liste d'attente";} 
			else {	admission += "refus�(e)";}
			// Affichage
			System.out.println(admission);
		} 
		else {System.out.println("Note invalide.");}
	}
}