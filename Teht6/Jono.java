/*
 * Viikkoharjoitus 6, teht�v� 1.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * M��rittelee liittym�n abstraktille tietotyypille jono.
 *
 * null-arvoiset alkiot voivat olla joko sallittuja tai kiellettyj�
 * rajapinnan toteuttavan luokan tarpeiden mukaan.
 *
 */

public interface Jono {
   /*
    * Jonon operaatiot.
    *
    */

   /* Lis�� alkion o jonon loppuun, mik�li jonossa on viel� tilaa.
    * Paluuarvo on false, jos jono on t�ynn�.
    */ 
   public abstract boolean lisaa(Object o);

   /* Palauttaa ja poistaa ensimm�isen alkion jonosta, 
    * mik�li jono ei ole tyhj�. Paluuarvo on null, jos jono on tyhj�.
    */
   public abstract Object poista();

   /* Palauttaa alkioiden lukum��r�n (>=0) jonossa.
    */
   public abstract int koko();

   /* Palauttaa totuusarvon true, jos jono on tyhj� ja totuusarvon false, 
    * jos jonossa ainakin yksi alkio.
    */
   public abstract boolean onkoTyhja();

   /* Palauttaa jonon ensimm�isen alkion sit� poistamatta, 
    * mik�li jono ei ole tyhj�. Paluuarvo on null, jos jono on tyhj�.
    */
   public abstract Object keula();
}
