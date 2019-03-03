/*
 * Viikkoharjoitus 3, teht‰v‰ 3.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2014, Jorma Laurikkala.
 *
 * Konkreettinen tohvelia mallintava luokka.
 *Tommi Tuominen
 */

public class Tohveli extends Jalkine {

   /*
    * Attribuutit.
    *
    */

   // Tosi, jos tohveli on tyyppi‰ "reino".
   private boolean reino;

   /*
    * Rakentajat.
    *
    */

   public Tohveli(double n, int i, boolean r) {
      super(n,i);
      reino(r);
   }

   /*
    * Aksessorit.
    *
    */
   public boolean reino() {
      return reino;
   }

   public void reino(boolean r) {
      reino = r;
   }

   /*
    * Oliometodit.
    *
    */
   /* Yritet‰‰n kadottaa tohveli.*/
   public void katoa() {
      if (Math.random() < 0.01)
         System.out.println("Menin piiloon...");
   }
   
   // Korvataan toString ja equals
     
   public String toString() {
      return super.toString() + " | " + reino;
   }

   public boolean equals(Object obj) {
      try {
         Tohveli t = (Tohveli)obj;
       
         if(super.equals(obj) && reino == t.reino()){    
            return true;  
         }else{
            return false;           
         }
      }
      catch (Exception e) {
         return false;
      }
   } 
   
   
}
