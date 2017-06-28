package GestionPrenotazionecinema;

/**genera il ticket finale 
 * per accedere alla cinema
 * integra anche il get e set per la visualizzazione e 
 * la modifica dell'oggetto
 */
public class TicketPrenotato {
	//campi di esemplari della class
	private String nomeUser;
	private String nameMovie;
	private String date;
	private String time;
	private double costo;
	
	//costruttore con parametri
	/**
	 * va creato tramite quattro parametri
	 * @param nomeUser
	 * @param nameMovie
	 * @param date
	 * @param time
	 * @param costo
	 */
	public TicketPrenotato(String nomeUser,String nameMovie,String date,String time,double costo) {
		super();
		this.nameMovie = nameMovie;
		this.date = date;
		this.time = time;
		this.costo = costo;
		this.nomeUser=nomeUser;
	}
	//stampaTicket():stampare il biglietto final
	
	public boolean stampaTicket(){
		
		System.out.println();
		System.out.println("Nome Cognome :"+ nomeUser);
		System.out.println();
		System.out.print("Titolo film  : "+nameMovie);
		System.out.println(); 
		System.out.println();
		System.out.println("Il giorno    : "+ date);
		System.out.println();
		System.out.print("Durata       : "+time);
		System.out.println();
		System.out.println();
		System.out.println("Costo        : "       + costo + "€");
		System.out.println("Arriverderci il tuo biglietto è stato generato!");
		return true;
		
	}
    
	public String getNameMovie() {
		return nameMovie;
	}

	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
}
