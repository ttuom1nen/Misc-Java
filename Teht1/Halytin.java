/*
 * Viikkoharjoitus 1, tehtävä 7.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Hälytin-käsitettä kömpelöllä tavalla mallintava kapseloimaton luokka.
 *
 *Muokannut: Tommi Tuominen 2014
 *
 */

public class Halytin {
   /*
    * Attribuutit.
    *
    */

   //Kaikista muuttujista privaatteja, jolloin niihin ei pääse
   //suoraan käsiksi luokan ulkopuolelta.
    
   // Hälyttimen koodin tehdasasetus.
   private final static int TEHDASKOODI = 7468;

   // Käyttäjän asettama koodi. Oletusarvoisesti tehdasasetus.
   //Käyttäjän syöttämästä koodista private
   private int koodi = TEHDASKOODI;
   private String uusikoodi = "";
   
   // Laskuri väärin annetuille koodeille. Oletusarvoisesti ei virheitä.
   // Koodin vaihto ei onnistu eikä oikeellinen koodi enää kelpaa,
   // jos virheitä on yli kolme.
   private static int virheita = 0;

   // Tosi, jos hälytin on lauennut. Oletusarvoisesti hiljaa.
   private static boolean halyttaa = false;

   /*
    * Metodit.
    *
    */

   //Privaatteja metodeista, joihin ei tarvitse päästä ulkopuolelta.
   private int koodi() {
      return koodi;
   }

   public void koodi(int k) {
      koodi = k;
   }

   public int virheita() {
      return virheita;
   }

   //Lisätään virhekertoihin
   public void virheita(int v) {
      if (v >= 0)
         virheita+=v;
   }

   private boolean halyttaa() {
      return halyttaa;
   }

   public void halyttaa(boolean h) {
      halyttaa = h;
   }

   /* Paluuarvo tosi, jos annettu koodi k vastaa laitteen koodia
    * ja virheitä on korkeintaan kolme.
    */
   public boolean koodiOikein(int k) {
      return (k == koodi && virheita <= 3);
   }

   /* Vaihdetaan koodiksi u, jos vanha koodi v on oikein.
    */
   public void vaihdaKoodi(int v, int u) {
      // Koodi oli oikein.
      if (koodiOikein(v)) {
         koodi(u);
         virheita = 0; 
      }
      // Koodi väärin.
      else {
         System.out.println("Vaara koodi!");
         virheita++;
      }
   }

   /* Aloittaa hälytyksen, jos jotain epäilyttävää havaittu.
    */
   public void aloitaHalytys() {
      // Anturit ovat havainneet jotain.
      if (Math.random() < 0.01)
         halyttaa(true);
   }

   /* Pysäyttää hälytyksen, jos koodi k on oikein.
    */
   public void pysaytaHalytys(int k) {
      // Koodi oli oikein.
      if (koodiOikein(k)) {
         virheita = 0;
         halyttaa(false);
      }

      // Koodi väärin.
      else {
         System.out.println("Vaara koodi!");
         virheita++;
      }
   }

   /* Tulostaa hälyttimen näytölle tietoja.
    */
   public void diagnosoi() {

      //Salasanan muuttaminen tähdiksi
      uusikoodi = "";
      for(int i = 0; i< Integer.toString(koodi).length() ;i++){
         uusikoodi += "*";
      }
 
      System.out.println("Diagnoosi:");
      System.out.println("- koodi = " + uusikoodi);
      System.out.println("- virheita = " + virheita + " kpl");
      System.out.println("- halyttaa = " + halyttaa);    
   }
}
