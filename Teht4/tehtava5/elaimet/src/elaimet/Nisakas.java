/*
 * Luento 6.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Yksinkertainen abstrakti Nisakas-luokka.
 *
 * Toteuttaa perityt abstraktit metodit.
 *
 */

package elaimet;

public abstract class Nisakas extends Elain {

   /*
    * Attribuutit.
    *
    */

   private boolean turkillinen;

   /*
    * Rakentajat.
    *
    */

   public Nisakas() {
      // Suurimmalla osaa nis�kk�ist� turkki.
      turkillinen(true);
   }

   public Nisakas(boolean onkoTurkki) {
      turkillinen(onkoTurkki);
   }

   public Nisakas(boolean e, double p, boolean t) {
      // Kutsutaan yliluokan rakentajaa.
      super(e, p);
      turkillinen(t);
   }

   /*
    * Aksessorit
    *
    */

   public boolean turkillinen() {
      return turkillinen;
   }

   public void turkillinen(boolean onkoTurkki) {
      turkillinen = onkoTurkki;
   }

   /*
    * Muut oliometodit.
    *
    */

   /* Nis�k�sm�ist� sy�mist�.
    */
   public void syo() {
      System.out.println("Sy�n kuin nis�k�s...");
   }

   /* Oletetaan suurin osa nis�kk�ist� "pieniksi".
    */
   public boolean onkoIso() {
      return false;
   }
}
