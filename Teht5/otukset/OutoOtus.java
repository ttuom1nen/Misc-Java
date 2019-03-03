/*
 * Viikkoharjoitus 5, teht‰v‰ 5.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2014, Jorma Laurikkala.
 *
 * Outojen otusten yhteiset piirteet.
 *
 */

package otukset;

public abstract class OutoOtus {

   /*
    * Attribuutit.
    *
    */

   // Otuksen v‰ri.
   private String vari;

   /*
    * Rakentajat.
    *
    */

   public OutoOtus(String v) {
      if (v != null)
         vari = v;
   }

   /*
    * Aksessorit.
    *
    */

   public String vari() {
      return vari;
   }

   /* Aliluokissa tarkennettavaa ‰‰ntely‰.
    */
   public abstract void aantele();

   public void tiedot(OutoOtus oo){
      System.out.println("Vari: "+oo.vari);
      System.out.println("Vari: "+oo.hampaat);     
   }   
}
