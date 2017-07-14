import static org.junit.Assert.*;

import org.junit.Test;
 // test autenticazione Administratore
public class testAdministratore{
	Administratore ad = new Administratore("AD123","Mario Rossi","qwert123546");
	@Test
	public void testCheckAdmin() {
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
   @Test
   public void testGetCodeAdmin(){
	   assertEquals(ad.getCodeAdmin(),"AD123");
   }
   @Test
   public void testSetCodeAdmin(){
	   ad.setCodeAdmin("AD234");
	   assertEquals(ad.getCodeAdmin(),"AD234");
   }
   @Test
   public void testGetNameAdmin(){
	   assertEquals(ad.getNameAdmin(),"Mario Rossi");
   }
   @Test
   public void testSetNameAdmin(){
	   ad.setNameAdmin(null);
	   assertEquals(ad.getNameAdmin(),null);
   }
   @Test
   public void TestGetPasswordAdmin(){
	   assertEquals(ad.getPasswordAdmin(),"qwert123546");
   }
   @Test
   public void testSetPasswordAdmin(){
	   ad.setPasswordAdmin("qwert123456");
	   assertEquals(ad.getPasswordAdmin(),"qwert123456");
   }
}
