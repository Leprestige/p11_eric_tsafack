

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testCartaUtente.class, testMovie.class, testPagamentoEseguito.class, testPostazione.class,
		TestTicketPrenotato.class })
public class AllTestStrutturale {

}
