/*
 * Viikkoharjoitus 5, teht‰v‰ 5.
 *
 * Olio-ohjelmoinnin perusteet, kev‰t 2014, Jorma Laurikkala.
 *
 * Konkreettinen outo otus.
 *
 */

package otukset;

public class Muhku extends OutoOtus {

   /*
    * Attribuutit.
    *
    */

   // Tosi, jos otuksella on hampaat.
   private boolean hampaat;

   /*
    * Rakentajat.
    *
    */

   public Muhku(String v, boolean h) {
      super(v);

      hampaat = h;
   }

   /*
    * Aksessorit.
    *
    */

   public boolean hampaat() {
      return hampaat;
   }

   /*
    * Toteutetut ja korvatut metodit.
    *
    */

   /* Otukselle ominaista ‰‰ntely‰.
    */
   public void aantele() {
      System.out.println("M÷÷!");
   }
   
}
