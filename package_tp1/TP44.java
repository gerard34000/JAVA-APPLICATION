package package_tp1;

public class TP44 {

	public static void main(String[] args) {
		//x de 1 a 10
		int x = 1;
		while(x<=10) {
			//print x 
			System.out.println("x= :"+x);
			if(x==7) {
				x++;
				System.out.println("on outrepasse 7 a cause  de la division par zero: PASSER = CONTINUE");
				continue; // arret code (mettre une condition de continuation(i++)
				// break; //arret definitif avec sortie
				
			}
			
			//division1/x-7
			float a = (float)1/(x-7);
			System.out.println("a = "+a);
			int millis = 1000;
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			x++;
		}
	}
}
