/*
 * Viikkoharjoitus 1, teht�v� 7.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * H�lytin-k�sitett� k�mpel�ll� tavalla mallintava kapseloimaton luokka.
 *
 *Muokannut: Tommi Tuominen 2014
 *
 */

public class Halytin {
   /*
    * Attribuutit.
    *
    */

   //Kaikista muuttujista privaatteja, jolloin niihin ei p��se
   //suoraan k�siksi luokan ulkopuolelta.
    
   // H�lyttimen koodin tehdasasetus.
   private final static int TEHDASKOODI = 7468;

   // K�ytt�j�n asettama koodi. Oletusarvoisesti tehdasasetus.
   //K�ytt�j�n sy�tt�m�st� koodista private
   private int koodi = TEHDASKOODI;
   private String uusikoodi = "";
   
   // Laskuri v��rin annetuille koodeille. Oletusarvoisesti ei virheit�.
   // Koodin vaihto ei onnistu eik� oikeellinen koodi en�� kelpaa,
   // jos virheit� on yli kolme.
   private static int virheita = 0;

   // Tosi, jos h�lytin on lauennut. Oletusarvoisesti hiljaa.
   private static boolean halyttaa = false;

   /*
    * Metodit.
    *
    */

   //Privaatteja metodeista, joihin ei tarvitse p��st� ulkopuolelta.
   private int koodi() {
      return koodi;
   }

   public void koodi(int k) {
      koodi = k;
   }

   public int virheita() {
      return virheita;
   }

   //Lis�t��n virhekertoihin
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
    * ja virheit� on korkeintaan kolme.
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
      // Koodi v��rin.
      else {
         System.out.println("Vaara koodi!");
         virheita++;
      }
   }

   /* Aloittaa h�lytyksen, jos jotain ep�ilytt�v�� havaittu.
    */
   public void aloitaHalytys() {
      // Anturit ovat havainneet jotain.
      if (Math.random() < 0.01)
         halyttaa(true);
   }

   /* Pys�ytt�� h�lytyksen, jos koodi k on oikein.
    */
   public void pysaytaHalytys(int k) {
      // Koodi oli oikein.
      if (koodiOikein(k)) {
         virheita = 0;
         halyttaa(false);
      }

      // Koodi v��rin.
      else {
         System.out.println("Vaara koodi!");
         virheita++;
      }
   }

   /* Tulostaa h�lyttimen n�yt�lle tietoja.
    */
   public void diagnosoi() {

      //Salasanan muuttaminen t�hdiksi
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
