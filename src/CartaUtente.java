package GestionPrenotazionecinema;
import java.util.Scanner;

/**
 * struttura una carta di credito 
 * @author tsafack
 *
 */
public class CartaUtente {
    private double prix; 
	private String numberCarte;
	private String dateScadenza;
	private String ccv;
	private int id;
	
	/**
	 * questo costruttore ricevere quatro parametri
	 * dà una descrizione di una carta di credito
	 * @param id
	 * @param numberCarte
	 * @param dateScadenza
	 * @param ccv
	 * @param prix
	 */
	public CartaUtente(int id,String numberCarte, String dateScadenza, String ccv,double prix) {
		super();
		this.numberCarte = numberCarte;
		this.dateScadenza = dateScadenza;
		this.ccv = ccv;
		this.prix = prix;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrix() {
		return prix;
	}
	/**
	 * modifica il contenuti di quella carta con prix e non ritorna niente.
	 * 
	 * @param prix
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getNumberCarte() {
		return numberCarte;
	}
	public void setNumberCarte(String numberCarte) {
		this.numberCarte = numberCarte;
	}
	public String getDateScadenza() {
		return dateScadenza;
	}
	public String getCcv() {
		return ccv;
	}
	/**
	 */
	public static void TipoCarta(){
		String []cats = {"MasterCart", "Maestro"};
	
		for(int i=0;i<2;i++)
		  System.out.println(i +":"+ cats[i]);
		
		@SuppressWarnings("resource")
		Scanner tcart = new Scanner(System.in);
		@SuppressWarnings("unused")
		int j=0;
		@SuppressWarnings("unused")
		int a = tcart.nextInt();
	}
	
}
