package package_tp1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TP1CORRECTION {

    
    public static void main(String[] args) {
    
        //System.out.println("Mes Exercices :");
        //Tp4_exo1();
        //exo2();
    	Date jour = new Date();
    	System.out.println(" la date donnée par Date() est: " +jour);
    	System.out.println("-------------------------------------------------");
    			
        dateToString();
        stringToDate();
        try {
            stringToDate2();
        } catch (ParseException e) {
            System.out.println("Format de date incorrect");
            //e.printStackTrace();
        }
    }

    private static void exo1() {
        hello();    
    }
    
    private static void exo2() {
        int i = 1;
        System.out.println("i = " + i);
        i = i + 1;
        System.out.println("i = " + i);
    }
    
    private static void hello() {
        System.out.println("Hello");
    }
    
   //------------------------------------datetostring------------------------------------------------ 
   private static void dateToString() {
        Date ceJour = new Date();
        System.out.println(ceJour);
        // On est obliger de mettre 'h' entre quotes
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yy H'h'mm");
        // H : 15     h : 3     hh : 03
        String resultat = formater.format(ceJour);
        System.out.println("format de dateToString est : " +resultat); 
        System.out.println("-------------------------------------------------");
    }
    
    //-----------------------------------stringtodate------------------------------------------------
    private static void stringToDate() {
        String date_saisie ="11/11/2011";
        // TODO Transform in date
        
        SimpleDateFormat formatteur = new SimpleDateFormat("dd/MM/yyyy");
        
        Date resultat = null;
        
        try {
            resultat = formatteur.parse(date_saisie);
        }catch (ParseException error)
        {
            System.out.println("Format de date incorrect.");
            System.err.println(error.getMessage());
        }

        System.out.println(resultat);
        System.out.println("format de StringToDate est : " +resultat);
        System.out.println("-------------------------------------------------");
    }
    
    /**
     * On laisse passer
     * @throws ParseException
     */
    private static void stringToDate2() throws ParseException {
        String date_saisie = "11/11/2011";
        // TODO Transform in date
        
        SimpleDateFormat formatteur = new SimpleDateFormat("dd-MM-yyyy");    
        Date resultat = formatteur.parse(date_saisie);
        System.out.println(resultat);
    }
    
    
    private static void changeFormat() {
        try {
            String date_saisie = "11/11/2011";
            // TODO Change format to dd-mm-yyyy
        
            SimpleDateFormat format_saisie = new SimpleDateFormat("dd/MM/YYYY");
            Date date_temp = format_saisie.parse(date_saisie);
            
            SimpleDateFormat format_affichage = new SimpleDateFormat("dd-MM-YYYY");
            String resultat = format_affichage.format(date_temp);
            System.out.println(resultat);
            
        
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    }
}