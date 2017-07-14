package GestionePrenotazionecinema;
import static org.junit.Assert.*;

import org.junit.Test;

//test della classe PagamentoEseguito
public class testPagamentoEseguito {

	@Test
	public void PagamentoEseguito() {
		Movie snowdem = new Movie(3,"Snowden","No comment","15/06/17","19:12",3.5);
		CartaUtente cart = new CartaUtente(0,"0123","01/12/2019","001",200);
		CartaUtente cart1 = new CartaUtente(1,"1123","09/19","031",2);
		
		// caso in cui il soldi nella carta
		// è maggiore del prezzo da pagare.
		PagamentoEseguito pg = new PagamentoEseguito(cart.getPrix(),snowdem.getPrezzo());
		boolean sd = pg.confermaPagamento(0.05);
		assertEquals( sd,true);
		
		// caso in cui il soldi nella carta
		// è minore del prezzo da pagare.
		PagamentoEseguito pg1 = new PagamentoEseguito(cart1.getPrix(),snowdem.getPrezzo());
		boolean sd1 = pg1.confermaPagamento(0.05);
		assertEquals( sd1,false);
	}

	
}
