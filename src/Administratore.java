import java.util.ArrayList;
import java.util.Scanner;
public class Administratore {
	//campi di esemplari 
	private String codeAdmin;
	private String nameAdmin;
	private String passwordAdmin;
	/**costruttore
	 * receve come pareamtri tre Stringhe che definisce un administratore.
	 * @param codeAdmin
	 * @param nameAdmin
	 * @param passwordAdmin
	 */
	private ArrayList<Movie>movie;
	public Administratore(String codeAdmin, String nameAdmin, String passwordAdmin) {
		super();
		this.codeAdmin = codeAdmin;
		this.nameAdmin = nameAdmin;
		this.passwordAdmin = passwordAdmin;
		this.movie = new ArrayList<Movie>();
	}
	/** controlla l'accesso dell'administratore.
	 * 
	 * @return un oggetto stringa
	 */
	public String checkAdmin(){
		String codAdmin = null;
		String cpAdmin = null;
		
		boolean done1 = false;
		while(!done1){
			Scanner admSca = new Scanner(System.in);
			System.out.println("Inserisce il tuo CodeAmin!");
			codAdmin = admSca.nextLine();
			System.out.println("Inserisce la tua pass");
			cpAdmin = admSca.nextLine();
			if((codAdmin.equals(codeAdmin)) && (cpAdmin.equals(passwordAdmin)))
				done1 = true;
			else{
				//System.out.println("Sbagliato!, inserisce nuovamente");
			    done1 = false;}
		}
		
		return "Giusto";
	}
	/** metodo aggiunge un oggetto Movie nella lista
	 * No return nulla
	 * @param m
	 */
	public void addMovie(Movie m){
		this.movie.add(m);
	}
    
	public String getCodeAdmin() {
		return codeAdmin;
	}

	public void setCodeAdmin(String codeAdmin) {
		this.codeAdmin = codeAdmin;
	}

	public String getNameAdmin() {
		return nameAdmin;
	}

	public void setNameAdmin(String nameAdmin) {
		this.nameAdmin = nameAdmin;
	}

	public String getPasswordAdmin() {
		return passwordAdmin;
	}

	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}
	/**
	 * 
	 * @param id
	 * @return un oggetto movie
	 */
    public Movie getMovie(int id){
    	Movie tmp = movie.get(id);
		for(int i =0;i<movie.size();i++){
			if(tmp.getIdMovie() == id)
				tmp = movie.get(id);
		}
		return tmp;
	}
    /**
     *  stampa la lista
     */
    /*
    public void StampaList(){
		for ( int i=0;i<movie.size();i++){
			System.out.println(movie.get(i).getNameMovie() +","+
		                       movie.get(i).getPrezzo()+","+
		                       movie.get(i).getOra()+","+
		                       movie.get(i).getGiorno()+","+
		                       movie.get(i).getPrezzo());
		}
	}
	*/
    /**
     * 
     * @return la dimensione della lista.
     */
    public int size(){
    	return movie.size();
    }
}
