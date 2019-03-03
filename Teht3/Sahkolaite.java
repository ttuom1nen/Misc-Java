/*
 * Viikkoharjoitus 3, tehtävä 2.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Abstrakti luokka sähköisille laitteille.
 *
 */

public abstract class Sahkolaite {

   /*
    * Attribuutit.
    *
    */

   // Tosi, jos laitteessa on virta päällä.
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

   /* Yrittää rikkoa laitteen. Paluuarvo true, jos laite meni rikki.
    */
   public abstract boolean rikkoudu();
}
