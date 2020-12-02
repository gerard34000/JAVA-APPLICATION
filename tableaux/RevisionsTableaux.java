package tableaux;

public class RevisionsTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab1= {"hello","world"}; 
		affiche(tab1);
		
		char[] tab2 =new char[4] ;
		tab2[0] ='a';		
		tab2[1] ='b';
		tab2[2] ='c';
		tab2[3] ='d';
		affiche(tab2);
	}
	
	//type String change en Objet !!!!!
	public static void affiche(Object[]tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	//redefinition de fonction
	public static void affiche(char[]tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	
	
	int []tab3= {1,2,3,4,5};

}
