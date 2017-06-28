import static org.junit.Assert.*;
import org.junit.Test;

 //test case Autenticazione Utente
public class UtenteTest {
	Utente rem = new Utente(0,"Marco Giovani","macr123go","marco@yahoo.fr","3345578899","P");
	Utente rem1 = new Utente(1," ","fran123go","franco@gmail.com","3234566477","S");
	@Test
	public void testCheckUtente(){
		String sd = rem.checkUtente();
		   assertEquals(sd,"bene");
	}
}
