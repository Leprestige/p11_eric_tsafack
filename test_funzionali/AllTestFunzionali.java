import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAdministratore.class, 
	testUtente.class,testCartaUtente.class, 
	testMovie.class,testPagamentoEseguito.class,
	TestTicketPrenotato.class,testPostazione.class })
public class AllTestFunzionali {

}
