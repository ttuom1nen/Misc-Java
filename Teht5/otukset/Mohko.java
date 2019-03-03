/*
 * Viikkoharjoitus 5, teht�v� 5.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * Konkreettinen outo otus.
 *
 */

package otukset;

public class Mohko extends OutoOtus {

   /*
    * Attribuutit.
    *
    */

   // Jalkojen maksimim��r� julkisena luokkavakiona.
   public static final int JALKOJENMAXLKM = 9;

   // Jalkojen lukum��r� (1 - JALKOJENMAXLKM kpl).
   private int jalkoja;

   /*
    * Rakentajat.
    *
    */

   public Mohko(String v, int j) {
      super(v);

      if (j >= 1 && j <= JALKOJENMAXLKM)
         jalkoja = j;
   }

   /*
    * Aksessorit.
    *
    */

   public int jalkoja() {
      return jalkoja;
   }

   /*
    * Toteutetut ja korvatut metodit.
    *
    */

   /* Otukselle ominaista ��ntely�.
    */
   public void aantele() {
      System.out.println("P�H!");
   }
}
