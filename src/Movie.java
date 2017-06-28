package GestionPrenotazionecinema;
// costruzione dell'oggetto film
// get e set sono mettodi per il controllo dell'oggetto stessn
// nessun returno di dati in questa classe.
public class Movie {
	// parametri di esemplari
	// difiniscono definisce l'oggetto da costruire
	 private int IdMovie;
     private String NameMovie;
     private String UpdateDetails;
     private double prezzo;
     private String ora;
     private String giorno;
    /**
     * costruttore dell'oggetto
     * riceve per la sua creazione sei parametri 
     * @param idMovie
     * @param nameMovie
     * @param updateDetails
     * @param giorno
     * @param ora
     * @param prezzo
     */
	public Movie(int idMovie, String nameMovie, String updateDetails, String giorno, String ora, double prezzo) {
		super();
		IdMovie = idMovie;
		NameMovie = nameMovie;
		UpdateDetails = updateDetails;
		this.prezzo = prezzo;
		this.ora = ora;
		this.giorno = giorno;
	}
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora =ora;
	}
	public String getGiorno() {
		return giorno;
	}
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	public String getNameMovie() {
		return NameMovie;
	}
	public void setNameMovie(String nameMovie) {
		NameMovie = nameMovie;
	}
	public String getUpdateDetails() {
		return UpdateDetails;
	}
	public void setUpdateDetails(String updateDetails) {
		UpdateDetails = updateDetails;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getIdMovie() {
		return IdMovie;
	}
	public void setIdMovie(int idMovie) {
		IdMovie = idMovie;
	}

}
