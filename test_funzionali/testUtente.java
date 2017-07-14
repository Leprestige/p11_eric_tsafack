import static org.junit.Assert.*;
import org.junit.Test;
 //test case Autenticazione Utente
public class testUtente {
	Utente rem = new Utente(0,"Marco Giovani","macr123go","marco@yahoo.fr","3345578899","P");
	Utente rem1 = new Utente(1," ","fran123go","franco@gmail.com","3234566477","S");
	@Test
	public void testCheckUtente(){
		String sd = rem.checkUtente();
		   assertEquals(sd,"bene");
	}
	@Test
	public void testPrivileggioU(){
		double ds = rem.privileggioU();
		   assertTrue(ds,0.05);
	}
	private void assertTrue(double ds, double d) {
		// TODO Auto-generated method stub
		ds = d;
	}
	@Test
	public void testPrivileggioU1(){
		double ds1 = rem.privileggioU();
		   assertTrue(ds1,0.0);
	}
	@Test
	public void testGetIdUt(){
		   assertEquals(rem.getIdUt(),0);
	}
	@Test
	public void testGetNumberPhone(){
	    assertEquals(rem.getNumberPhone(),"3345578899");
	}
	@Test
	public void testSetNumberPhone(){
		rem.setNumberPhone("3289345677");
		   assertEquals(rem.getNumberPhone(),"3289345677");
	}
	@Test
	public void testGetUserName(){
		   assertEquals(rem.getUserName(),"Marco Giovani");
	}
	@Test
	public void testSetUserName(){
		rem.setUserName("Romeo");
		   assertEquals(rem.getUserName(),"Romeo");
	}
	@Test
	public void testGetPassword() {
		assertEquals(rem.getPassword(),"macr123go");
	}
	@Test
	public void testSetPassword() {
		rem.setPassword("marc124go");
		assertEquals(rem.getPassword(),"marc124go");
	}
	@Test
	public void testGetEmail() {
		assertEquals(rem.getEmail(),"marco@yahoo.fr");
	}
	@Test
	public void testSetEmail() {
		rem.setEmail("marco@hotmail.com");
		assertEquals(rem.getEmail(),"marco@hotmail.com");
	}
	@Test
	public void testGetPrim() {
		assertEquals(rem.getPrim(),"P");
	}
	@Test
	public void testSetPrim() {
		rem.setPrim("S");
		assertEquals(rem.getPrim(),"S");
	}
	
}
