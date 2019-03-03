/*
 * Viikkoharjoitus 6, teht�v� 1.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * Jono-rajapinnan suppein mahdollinen toteutus abstraktissa luokassa.
 *
 * Jonon koolle asetetaan yl�raja.
 *
 */

public abstract class AbstraktiJono implements Jono {
   /*
    * Attribuutit.
    *
    */

   // Alkioiden maksimim��r�.
   private int maxKoko;

   /*
    * Rakentajat.
    *
    */

   public AbstraktiJono(int m) {
      if (m >= 0)
         maxKoko = m;
      else
         maxKoko = 0;
   }

   /*
    * Aksessorit.
    *
    */

   public int maxKoko() {
      return maxKoko;
   }

   /*
    * Jonon operaatioiden korvaus toteuttamalla.
    *
    */

   public boolean lisaa(Object o) {
      return false;
   }

   public Object poista() {
      return null;
   }

   public int koko() {
      return 0;
   }

   public boolean onkoTyhja() {
      return true;
   }

   public Object keula() {
      return null;
   }
}
