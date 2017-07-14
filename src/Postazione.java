
/**
 * genera la mappa dell'aula
 * le disposizione e il metodo ausiliare indici(String)
 * 
 * @author tsafack
 *
 */
public class Postazione {
   
   String[][]matrici ={{"A1","A2","A3"},
                        {"B1","B2","B3"},
                        {"C1","C2","C3"},};
   public Postazione(){
	   
   }
   /**
    * il metodo returno sempre un valore
    * null nel caso in cui il parametro non esiste
    * 
    * @param elem ricevuto
    * @return indici 
    */
   public int indici(String elem)
   {  
	   boolean done = false;
       int b=0;
   	while(!done)
 	  {
 	    for(int i=0;i< matrici.length;i++)
 		   for(int j =0;j< matrici[i].length;j++)
 			   if((elem.equals(matrici[i][j])))
 				   b=i;
 			       done =true;
 	   }
		return b;
   }
   public int indici1(String elem)
   {  
	   boolean done = false;
       int a =0;
   	while(!done)
 	  {
 	    for(int i=0;i< matrici.length;i++)
 		   for(int j =0;j< matrici[i].length;j++)
 		      if((elem.equals(matrici[i][j])))
 			       a = j;
 			       done = true;
 	   }
		return a;
   }
   /*
   public void insert(String elem,String aggiu)
   {
	   boolean done = false;
	   
	  while(!done)
	  {
	   for(int i=0;i< matrici.length;i++)
		   for(int j =0;j< matrici[i].length;j++)
		   {
			   if((elem.equals(matrici[i][j])))
			   {
				   matrici[i][j]= aggiu;
				   System.out.println("valida!");
			       done =true;
			   } 
			   else if(("no".equals(matrici[i][j])))
				   System.out.println("NO valido");
		   }   
	  }
	  
    }
    */
   // Stampa le postazione 
   public void stampa(){
	   for (int i=0 ; i<matrici.length ; i++){
	          for (int j=0 ; j<matrici[i].length ; j++){ 
	              System.out.print ("\t "+matrici[i][j]);
	              }
	          System.out.println();
	        }
   }
    
 }

