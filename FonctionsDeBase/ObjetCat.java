/*OBJET  =
CLASSE
ATTRIBUTS
CONSTRUCTEUR MEME NOM QUE CLASSE(attributs this.param=param)
PLUSIEURS CONSTRUCTEURS MEME NOM PARAM DIFFERENTS ET RETOUR PEUVENT ETRE DIFFERENTS
FONCTION (accessoire)
GETTERS SETTERS
TOSTRING*/

package FonctionsDeBase;

public class ObjetCat {
	private String name= "chat"; 	// 	ATTRIBUTS EN TETE
	private String color = "gris";
	public static int age = 11;
	
	// OBJET = PAS DE MAIN  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	//-------CONSTRUCTEUR:CE QUI DEFINIT L OBJET------------------------------
	// CONSTRUCTEUR DE MEME NOM QUE CLASSE
	public ObjetCat(String name,String color,int age) {
		this.name = name;
		this.color=color;
		this.age = age ;
	}
	
	// PLUSIEURS CONSTRUCTEURS  = SURCHARGE L ETYPE DE RETOUR PEUT ETRE DIFFERENT
	public ObjetCat(String color) {
		this.color=color;
			
	}
	//------------------------------------------------------------------
	
	//-----------------FONCTION : ACCESSOIRE------------------------------------
		public void listen() {
			System.out.println("RRRRRRRRrrrrr");
		}
	
	
		//----------------------------setters-------------------------------
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
		this.name = "chat"; //valeur par defaut
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//------------------------------getters-----------------------------------------
	public String getName () {
		return this.name;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public int getAge () {
		return this.age;
	}
	
	//----------------------------show--------------------------------------
	
	public void show() {
		System.out.println("chat nommé "+this.name+" de couleur "+this.color+" et d age "+this.age);
	}
	
	
	
}
