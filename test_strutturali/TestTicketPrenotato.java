import static org.junit.Assert.*;
import org.junit.Test;
  // test della classe TestTicketPrenotato
/**
 * @author tsafack
 */
public class TestTicketPrenotato {
	TicketPrenotato p = new TicketPrenotato("Marco","Batman","12/06/17","12:23",12);
	@Test
	public void testGetTicket() {
		
		assertEquals(p.getNomeUser(),"Marco");
		assertEquals(p.getNameMovie(),"Batman");
		assertEquals(p.getDate(),"12/06/17");
		assertEquals(p.getTime(),"12:23");
		assertTrue(p.getCosto() == 12);
		assertEquals(p.stampaTicket(),true);
	}
	@Test
	public void testSetTicket() {
		p.setNomeUser("Tomtom");
		assertEquals(p.getNomeUser(),"Tomtom");
		p.setNameMovie("Snowden");
		assertEquals(p.getNameMovie(),"Snowden");
		p.setDate("09/07/17");
		assertEquals(p.getDate(),"09/07/17");
		p.setTime("10:00");
		assertEquals(p.getTime(),"10:00");
		p.setCosto(10);
		assertTrue(p.getCosto() == 10);
	}
}
