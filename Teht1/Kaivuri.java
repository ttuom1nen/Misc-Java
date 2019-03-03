/* 
 * Viikkoharjoitus 1, tehtävä 4.
 *  
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 * Muokannut: Tommi Tuominen
 */

public class Kaivuri {

   /* 
    * Attribuutit.
    *
    */

   // Kaivurin paino tonneina.
   private double paino;
   
   // Tosi, jos kyseessä on teloilla liikkuva kaivuri.
   private boolean telat;

   // Kaivurin väri.
   private String vari;

   /* 
    * Aksessorit.
    *
    */

   public double paino() {
      return paino;
   }

   // Asetetaan paino siten, että siinä sallitaan vain yksi desimaali.
   public void paino(double p) {
   
   //Ongelmana oli, että Alkup. koodissa luotiin double paino, johon muokkauksia yritettiin istuttaa.
   //Nyt ohjelma tekee muutokset suoraan double p -syötteeseen, jonka jälkeen uusi arvo tallennetaan paino-muuttujaan.
      
      if (p >= 1 && p <= 100){   
         p = (int)(10 * p);
         paino = p / 10;
      }    
   }

   public boolean telat() {
      return telat;
   }

   public void telat(boolean t) {
      telat = t;
   }

   public String vari() {
      return vari;
   }
   
   public void vari(String v) {
      if (v != null)
         vari = v;
   }
}
