package package_tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TP33_TEST extends TP33 {

	@Test
	public void test() {
		//INT ATTENDU  !!!!
		// LE FAIT DE METTRE LA CONDITION DETEST CHANGE LE TYPAGE DE ASSERTEQUALS POUR LA ADAPTER
		assertEquals(4,TP33.fois2(2) ); // LONG OK
		assertEquals(4,TP33.fois2(2 )); //DOUBLE OK
		assertEquals(4,TP33.fois2(2 )); //OBJET OK
		assertEquals(4,TP33.fois2(2 )); //OBJET TABLEAU OK
		assertEquals(4,TP33.fois2(2 )); //OBJET + STRING OK
		
}
}
