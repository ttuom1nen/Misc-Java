/*
 * Luento 6.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 */

package elaimet;

public class Ihminen extends Nisakas implements Tervehtiva {

   /*
    * Attribuutit
    *
    */

   private String henkilotunnus;

   /*
    * Rakentajat.
    *
    */

   public Ihminen() {
      // Kutsutaan yliluokan rakentajaa.
      super(true, 60, false);
      henkilotunnus("abcdef-1234");
   }

   public Ihminen(String hetu) {
      // Kutsutaan parametritonta rakentajaa.
      super();
      henkilotunnus(hetu);
   }

   /*
    * Aksessorit.
    *
    */

   public String henkilotunnus() {
      return henkilotunnus;
   }

   public void henkilotunnus(String hetu) {
      if (hetu != null && hetu.charAt(6) == '-')
         henkilotunnus = hetu;
   }

   /*
    * Ihmisen korvatut metodit.
    *
    */

   /* Ihmism�ist� sy�mist�.
    */
   public void syo() {
      // Kutsutaan yliluokan versiota korvatusta metodista.
      super.syo();

      // Sitten sy�d��n kuin ihmiset.
      System.out.println("Sy�n kuin ihminen...");
      puhu();
   }

   /* Karkea s��nt� ihmisen koon arviointiin.
    */   
   public boolean onkoIso() {
      // Korvataan peritty metodi kokonaisuudessaan: yliluokan versiota ei kutsuta.
      return paino() > 100;
   }

   /*
    * Toteutetut metodit.
    *
    */

   /* Ihmism�inen moi.
    */
   public void moikkaa() { 
      System.out.println("Moikka!");
   }

   /*
    * Ihmisen muut oliometodit.
    *
    */

   /* Tuotetaan puhetta.
    */
   public void puhu() {
      System.out.println("Seli, seli, seli...");
   }
}
