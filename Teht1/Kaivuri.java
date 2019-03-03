/* 
 * Viikkoharjoitus 1, teht�v� 4.
 *  
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 * Muokannut: Tommi Tuominen
 */

public class Kaivuri {

   /* 
    * Attribuutit.
    *
    */

   // Kaivurin paino tonneina.
   private double paino;
   
   // Tosi, jos kyseess� on teloilla liikkuva kaivuri.
   private boolean telat;

   // Kaivurin v�ri.
   private String vari;

   /* 
    * Aksessorit.
    *
    */

   public double paino() {
      return paino;
   }

   // Asetetaan paino siten, ett� siin� sallitaan vain yksi desimaali.
   public void paino(double p) {
   
   //Ongelmana oli, ett� Alkup. koodissa luotiin double paino, johon muokkauksia yritettiin istuttaa.
   //Nyt ohjelma tekee muutokset suoraan double p -sy�tteeseen, jonka j�lkeen uusi arvo tallennetaan paino-muuttujaan.
      
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
