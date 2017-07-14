package GestionePrenotazionecinema;
import static org.junit.Assert.*;
import org.junit.Test;
//test case del posto a sedere
public class testPostazione {
	Postazione po = new Postazione();
	String [][] mat =po.matrici.clone();
	@Test
	public void testIndice1() {
		
		assertEquals(po.indici("C2"),2);
		}
	@Test
	public void testIndice2() {
		assertEquals(po.indici1("C2"),1);
	}
	@Test
	public void testStampaMat() {
		po.stampa();
	}
}
