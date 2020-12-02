package package_tp1;

public class tp22 {
    
    public static void main(String args[]){
        int a = 10;
        System.out.println( "a = " + a + ";\t(++a*2) = " + (++a*2) + ";\ta = " + a + ";");
        // ++a*2    de gauche a droite puisque operateur avant variable : j augmente puis je multiplie  
        a = 10;
        System.out.println("a = " + a + ";\t(a++*2) = " + (a++*2) + ";\ta = " + a + ";");
        //a++*2     de droite a gauche puisque tous operateurs a droite de la variable : je multiple puis j augmente la valeur
        int b=10;
        System.out.println(++b*2);

}
}