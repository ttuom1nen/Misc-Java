/*
 * Viikkoharjoitus 3, teht�v� 2.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * Abstrakti luokka s�hk�isille laitteille.
 *
 */

public abstract class Sahkolaite {

   /*
    * Attribuutit.
    *
    */

   // Tosi, jos laitteessa on virta p��ll�.
   private boolean virta;

   /*
    * Rakentajat.
    *
    */

   public Sahkolaite() {
      // Pelastetaan maailma.
      virta = false;
   }

   public Sahkolaite(boolean tila) {
      virta = tila;
   }

   /*
    * Aksessorit.
    *
    */

   public boolean virta() {
      return virta;
   }

   /*
    * Oliometodit.
    *
    */

   public void kaynnisty() {
      virta = true;
   }

   public void sammu() {
      virta = false;
   }

   /*
    * Abstraktit oliometodit.
    *
    */

   /* Yritt�� rikkoa laitteen. Paluuarvo true, jos laite meni rikki.
    */
   public abstract boolean rikkoudu();
}
