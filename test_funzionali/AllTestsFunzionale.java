import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**  
La percentuale di statement coverage raggiunta 
* eseguendo questa test suite rappresentante il test funzionale
* risulta essere : 100 %
*/

@RunWith(Suite.class)
@SuiteClasses({ 
	testAdministratore.class,
	testUtente.class })
public class AllTestsFunzionale {
	
}
