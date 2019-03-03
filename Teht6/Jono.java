/*
 * Viikkoharjoitus 6, tehtävä 1.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Määrittelee liittymän abstraktille tietotyypille jono.
 *
 * null-arvoiset alkiot voivat olla joko sallittuja tai kiellettyjä
 * rajapinnan toteuttavan luokan tarpeiden mukaan.
 *
 */

public interface Jono {
   /*
    * Jonon operaatiot.
    *
    */

   /* Lisää alkion o jonon loppuun, mikäli jonossa on vielä tilaa.
    * Paluuarvo on false, jos jono on täynnä.
    */ 
   public abstract boolean lisaa(Object o);

   /* Palauttaa ja poistaa ensimmäisen alkion jonosta, 
    * mikäli jono ei ole tyhjä. Paluuarvo on null, jos jono on tyhjä.
    */
   public abstract Object poista();

   /* Palauttaa alkioiden lukumäärän (>=0) jonossa.
    */
   public abstract int koko();

   /* Palauttaa totuusarvon true, jos jono on tyhjä ja totuusarvon false, 
    * jos jonossa ainakin yksi alkio.
    */
   public abstract boolean onkoTyhja();

   /* Palauttaa jonon ensimmäisen alkion sitä poistamatta, 
    * mikäli jono ei ole tyhjä. Paluuarvo on null, jos jono on tyhjä.
    */
   public abstract Object keula();
}
