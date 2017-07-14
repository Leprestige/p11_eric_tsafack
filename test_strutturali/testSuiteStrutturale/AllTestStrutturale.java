package TestSuiteStrutturale;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import GestionePrenotazionecinema.TestTicketPrenotato;
import GestionePrenotazionecinema.testAdministratore;
import GestionePrenotazionecinema.testCartaUtente;
import GestionePrenotazionecinema.testMovie;
import GestionePrenotazionecinema.testPagamentoEseguito;
import GestionePrenotazionecinema.testPostazione;
import GestionePrenotazionecinema.testUtente;

@RunWith(Suite.class)
@SuiteClasses({ 
	testMovie.class,
	testUtente.class,
	testCartaUtente.class,
	testAdministratore.class,
	testPostazione.class,
	testPagamentoEseguito.class,
	TestTicketPrenotato.class
	 })
public class AllTestStrutturale {

}
