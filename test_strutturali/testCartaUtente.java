import static org.junit.Assert.*;

import org.junit.Test;
// test classe CartaUtente
public class testCartaUtente {
	CartaUtente cart = new CartaUtente(0,"0123","12/19","001",200);
	
	@Test
	public void testGetId() {
		assertEquals(cart.getId(),0);
	}
	@Test
	public void testSetId() {
	   cart.setId(1);	
	   assertTrue(cart.getId() == 1);
	   assertFalse(cart.getId()==2);
	}
	@Test
	public void testTipoCarta(){
		@SuppressWarnings("static-access")
		String s = cart.TipoCarta(0);
		assertEquals(s,"MasterCart");
		@SuppressWarnings("static-access")
		String sm = cart.TipoCarta(1);
		assertEquals(sm,"Maestro");
	}
	@Test
	public void testGetPrix() {
		assertTrue(cart.getPrix() == 200);
	}
	@Test
	public void testSetPrix() {
		cart.setPrix(150);
		assertTrue(cart.getPrix() == 150);
	}
	@Test
	public void testGetNumberCarte() {
		assertEquals(cart.getNumberCarte(),"0123");
	}@Test
	public void testSetNumberCarte() {
		cart.setNumberCarte("1234");
		assertEquals(cart.getNumberCarte(),"1234");
	}
	@Test
	public void testGetDateScadenza() {
		assertEquals(cart.getDateScadenza(),"12/19");
	}
	@Test
	public void testGetCvv() {
		assertEquals(cart.getCcv(),"001");
	}
	
}
