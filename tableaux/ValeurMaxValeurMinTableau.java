package tableaux;

public class ValeurMaxValeurMinTableau {
    public static void main(String[] args) {
       int maxVal = Integer.MAX_VALUE;
       int minVal = Integer.MIN_VALUE;
       
       int array[] = {1,3,2};
  
       for (int nombre:array)

    	   System.out.print(nombre+" ");
  
     //seul choix possible:maxval:tri a bulles, la valeur est testee 2fois, min et max
       for(int i = 0; i < array.length; i++){
           if(array[i] < maxVal)
        	 maxVal = array[i];		// valeur min que l on fait descendre au fur et a mesure en la mettant temporairement en valeur max
           if(array[i] > minVal)
             minVal = array[i];		// valeur max que l on fait monter au fur et a mesure en la mettant temporairement en valeur min
         }
       
       System.out.print("\nValeur minimale = "+maxVal);
       System.out.print("\nValeur maximale = "+minVal);
    }
}
