import static org.junit.Assert.*;

import org.junit.Test;

 // test autenticazione Administratore
public class testAdministratore{
	Administratore ad = new Administratore("AD123","Mario Rossi","qwert123546");
	@Test
	public void testGetCodeAdmin() {
		String adm = ad.checkAdmin();
		assertEquals(adm,"Giusto");
		}
	//aggiungere 
   @Test
   public void testAddMovie(){
	   ad.addMovie(new Movie(1,"Batman"," ","12/04/17","12:23",12.5));
	   assertEquals(ad.size(),1);
	   assertEquals(ad.getMovie(0).getNameMovie(),"Batman");
   }
}
