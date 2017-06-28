package GestionPrenotazionecinema;

import java.util.Scanner;
import java.io.IOException;
import java.io.*;
public class TcketTest {
    
	
	public static void main(String[] args)throws IOException {
		
		// TODO Auto-generated method stub
		//crea un nuovo file biglietto
		FileWriter biglietto = new FileWriter("Biglietto.txt");
	    BufferedWriter ticket = new BufferedWriter(biglietto);
	    
	    // Scrive sul file creato .
	    PrintWriter printout = new PrintWriter(ticket);
		boolean choix = false;
		Scanner in = new Scanner(System.in);
		//user(u) oppure administratore(a);
		while(!choix)
		{
			System.out.println("la tua categoria user(u) oppure administratore(a);");
			//System.out.println("(\"E\" per uscire)");
			System.out.println("(\"U\" per user)");
			System.out.println("(\"A\" per administratore)");
			String cat = in.nextLine();
			if(cat.equalsIgnoreCase("U"))
			{
				
				double somma = 0;
			//---------------Crea un nuovo oggetto utente e carta per il pagamento-------------------------
					
					Utente rem = new Utente(0,"Marco Giovani","macr123go","marco@yahoo.fr","3345578899","P");
					CartaUtente cart = new CartaUtente(0,"01232345667","12/19","001",150);
					//CartaUtente cart1 = new CartaUtente(1,"1123","09/19","031",200);
				//authenticazione del'utente		
	               rem.checkUtente();
	         
			//------------Creo un nuovo oggetto film con una visualizzazione----------------------------
					            //Stampa la lista dei film programmati.
					
					System.out.println("Ecco il film programmati.");
					Movie anaconda = new Movie(1,"Anaconda","No Comment","12/06/2017","15:20",2.5);
					Movie batman = new Movie(2,"Batman","No comment","15/06/17","10:30",3.5);
					Movie babyBoss = new Movie(4,"Baby boss","No comment","15/06/17","17:10",4.5);
					Movie snowdem = new Movie(3,"Snowden","No comment","15/06/17","19:12",3.5);
					Movie[]movie = {snowdem,batman,anaconda,babyBoss};
					System.out.println();
					for(int i = 0 ; i < movie.length;i++){
						System.out.println("  " + movie[i].getNameMovie() + ", " + movie[i].getPrezzo() + "€" +
					                        " ," + movie[i].getUpdateDetails()
					                        + "," + movie[i].getGiorno()+ ","+ movie[i].getOra());
					}
					System.out.println();
//-------------- Scegli il tuo scegliere il film da vedere------------------------
					
					System.out.println("fai la tua scelta del tuo film!");
					Scanner mov = new Scanner(System.in);
					String miofilm = mov.nextLine();
					String ora = null;
					String gior = null;
					int indice = 0;
					 for(int i = 0; i<movie.length;i++){
						if((movie[i].getNameMovie().compareTo(miofilm) == 0)){
								System.out.println(movie[i].getNameMovie());
								ora = movie[i].getOra();
								gior = movie[i].getGiorno();
								indice = i;
								//System.out.println(movie[indice].getPrezzo());
				       }
					}
					
					System.out.println();
					
//--------------- Stampa il tipo di carta disponibile-----------------------	
				   
					System.out.println("Tipo di carta gestito dal sistema, a cui dovrai scegliere 0 oppure 1.");
					//CartaUtente car = new CarteUtente();
					CartaUtente.TipoCarta();
					System.out.println();
 //-------------- mostrare la mappatura delle sedile.----------------------
					
					System.out.println("Mappatura delle postazione ");
					Postazione p = new Postazione();
					p.stampa();
					Scanner post = new Scanner(System.in);
					
					System.out.println("Posto a sedere preferito secondo la mappa in visualle");
		//---------digita la tua sedia.------------------------
					String sedia = post.next();
					int in1 = p.indici(sedia);
					int in2 = p.indici1(sedia);
					
//------------------------Acquisizione del biglietto.-------------------------------
					//sconto da applicare in caso necessario.
					double scon = rem.privileggioU();
					System.out.println("Acquista");
					//System.out.println(new PagamentoEseguito(cart.getPrix(), movie[indice].getPrezzo()).sottra(scon));
					
					Scanner pag = new Scanner(System.in);
			        boolean fai = false;
			       
					while(!fai ){
						System.out.print("inserisci numero di carta!"+":");
						String a = pag.next();
						System.out.print("inserisci data di scadenza carta!"+":");
						String b = pag.next();
						System.out.print("inserisci cvv del carta!"+":");
						String c = pag.next();
						if((a.equals(cart.getNumberCarte())&&(b.equals(cart.getDateScadenza())&&(c.equals(cart.getCcv()))))){
							boolean ret = (new PagamentoEseguito(cart.getPrix(), movie[indice].getPrezzo()).confermaPagamento(scon));
							if(ret == true){
							System.out.println(ret);
							String nUser = rem.getUserName();
							    printout.println("Scrivo nel file!");
						        printout.print("Nom e Cognome: ");
						        printout.println(nUser);
							//String nFilm = snowdem.getNameMovie();
						        printout.print("Titolo del film : ");
						        printout.println(miofilm);
							double som = snowdem.getPrezzo();
						       printout.print("Prezzo: ");
						       printout.println(som);
				            String pos = p.matrici[in1][in2];
				               printout.print("Codice sedile: ");
				               printout.println(pos);
				               printout.print("Il giorno: ");
						       printout.println(gior);
						       printout.print("Alle ore: ");
						       printout.println(ora);
				            printout.print("Ho finito");
				            printout.close();
		
							System.out.println("Ecco il biglietto gentil cliente.");
							TicketPrenotato nv = new TicketPrenotato(nUser,miofilm,gior,ora,som);
							nv.stampaTicket();
							}
							else{
								System.out.println("Prova con un'altra carta!");
							}
						}
						fai = true;
					 }
			    System.out.println("E");
			    if(cat.equalsIgnoreCase("E"))
			    	choix =true;
				}
	//-------------------------Categoria administratore-------------------------------
			else if(cat.equalsIgnoreCase("A"))
			{
				
				Administratore ad = new Administratore("AD123","Mario Rossi","qwert123546");
				ad.checkAdmin();
				
				ad.addMovie(new Movie(2,"House Doctor", "No comment", "23/06", "2:12", 7));
				ad.addMovie(new Movie(12,"Batman","No comment","15/06/17","10:30",3.5));
				System.out.println("La dimensione della lista : "+ ad.size());
			}
			else if(cat.equalsIgnoreCase("E"))
			    choix = true;
		}
	}
}  


