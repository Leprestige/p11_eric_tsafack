package GestionePrenotazionecinema;
// controlla l'acquisto della seduta
//contiene metodo ausiliare 
public class PagamentoEseguito {
    private double mocarte;
    private double momov;
    /**
     * costruttoe dell'oggetto, riceve due parametri essere creato
     * @param mocarte
     * @param momov
     */
	public PagamentoEseguito(double mocarte, double momov) {
		super();
		this.mocarte = mocarte;
		this.momov = momov;
	}
	/**
	 * metodo di effettua pagamento senza parametro
	 * returna un double  come specificato
	 * @return  rest
	 * @see    il resto dell'operazione
	 */
    public boolean confermaPagamento(double remise){
    	
    	if((this.momov <= this.mocarte))
    	{
    		@SuppressWarnings("unused")
			double val = this.momov*remise;
    		//rest = this.mocarte-(this.momov-val);
    		//System.out.println(this.momov-val);
    	    System.out.println("pagamento effetuato con successo!");
    	 	return true;
    	}
    	else{
    		System.out.println("contenuto insufficiente!");}
     	return false;
    }
			
}
