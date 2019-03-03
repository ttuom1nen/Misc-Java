/*
 * Viikkoharjoitus 6, tehtävä 1.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Jono-rajapinnan suppein mahdollinen toteutus abstraktissa luokassa.
 *
 * Jonon koolle asetetaan yläraja.
 *
 */

public abstract class AbstraktiJono implements Jono {
   /*
    * Attribuutit.
    *
    */

   // Alkioiden maksimimäärä.
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
