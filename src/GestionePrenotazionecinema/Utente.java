package GestionePrenotazionecinema;
//class Utente contiene campi di esemplari e contruttore con paremetri
// definisce le caratteristiche 
import java.util.Scanner;
public class Utente {
	private int idUt;
	private String userName;
	private String password;
	private String email;
	private String numberPhone;
	private String prim;
	
	/**
	 * Costruttore
	 * @param idUt
	 * @param userName
	 * @param password
	 * @param email
	 * @param numberPhone
	 */
	public Utente(int idUt,String userName, String password, String email, String numberPhone,String prim) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.numberPhone = numberPhone;
		this.prim = prim;
	}
	/**
	 * 
	 * @return un oggetto di tipo String
	 */
	public String checkUtente(){
		String user = null;
		String pass = null;
		System.out.println("Autentificarti per favore!");
		boolean done = false;
		while(!done){
			Scanner usepass = new Scanner(System.in);
			System.out.println("Inserisci il tuo Username!");
			user = usepass.nextLine();
			System.out.println("Inserisci la tua password");
			pass = usepass.nextLine();
			if(user.equals(userName))
					//System.out.println("corretto!");
			        done = true;	
		}
		return "bene";
	}
	/**
	 * 
	 * @return un numero di tipo double
	 */
	public double privileggioU(){
		double sc;
		//String scd = prim;
		if (prim.equals("P"))
			sc = 0.05;
		else
			sc =0;
	   return sc;
	}
	public int getIdUt() {
		return idUt;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrim() {
		return prim;
	}
	public void setPrim(String prim) {
		this.prim = prim;
	}
	
}
