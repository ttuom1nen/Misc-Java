/*
 * Luento 3.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Yksinkertainen Kissa-luokka.
 *
 */

public class Kissa {
   /*
    * Attribuutit.
    *
    */

   // Kissan v‰ri.
   private String vari;

   // Kissan h‰nn‰n tyyppi (esimerkiksi "kippura").
   private String hanta;

   /*
    * Rakentajat.
    *
    */

   /* Oletusrakentaja.
    */
   public Kissa() {
      vari = "musta";
      hanta = "kippura";
   }

   /* Parametrillinen rakentaja,
    * jossa alustetaan vari (v) ja hanta (h). 
    */ 
   public Kissa(String v, String h) {
      // Koodia lyhennetty aksessoreita kutsumalla,
      // jolloin tarvitaan v‰hemm‰n if-lauseita.
      vari(v);
      hanta(h);
   }

   /*
    * Oliometodit.
    *
    */

   private void hairikoi() {
      // Tavaroita hajoaa...
   }

   public String vari() { 
      return vari;
   }

   public void vari(String v) {
      if (v != null)
         vari = v;
   }

   public String hanta() {
      return hanta;
   }

   public void hanta(String h) {
      if (h != null)
         hanta = h;
   } 

   /* Tulostetaan parametrina (s) annettua "‰‰ntely‰".
    */
   public void aantele(String s) { 
      System.out.println(s);
   }
}
