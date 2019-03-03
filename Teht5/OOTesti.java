/*
 * Viikkoharjoitus 5, teht�v� 5.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * Testiluokka oudoille otuksille.
 *
 */

// Otetaan k�ytt��n pakatut otukset.
import otukset.*;

// Otetaan k�ytt��n Random-luokka.
import java.util.Random;

public class OOTesti {

   /* Tulostetaan taulukon t alkioiden viittaamien otuksen tiedot n�yt�lle.
    * Huomaa, ett� instanceof-operaattori palauttaa false-arvon, jos sille
    * annettu viite on null-arvoinen.
    */
  /* public static void tulosta(OutoOtus[] t) {
      // Otuksen tietoja erottava merkkijono.
      final String EROTIN = " ";

      // K�yd��n taulukko l�pi alkio kerrallaan, jos taulukolle on muistettu
      // varata muistia.
      if (t != null)
         for (int i = 0; i < t.length; i++) {
            // Asetetaan selvyyden vuoksi apuviite taulukon alkion viittaamaan
            // otukseen.
            OutoOtus otus = t[i];

            // Tulostetaan otuksen tiedot.
            if (otus instanceof Muhku)
               System.out.println("Muhku" + EROTIN + otus.vari() + EROTIN
               + ((Muhku)otus).hampaat());
            else if (otus instanceof Mohko)
               System.out.println("Mohko" + EROTIN + otus.vari() + EROTIN
               + ((Mohko)otus).jalkoja());
      }*/

  /* public static void tulosta(OutoOtus[] t) {
      t.printClassName(t);
   }*/
 

   public static void main(String[] args) {
      // Otusten lukum��r�.
      final int LKM = 5;

      // Taulukko v�reille.
      String[] varit = { "punainen", "sininen", "vihre�" };

      // Luodaan taulukko otuksille. Taulukon viitteiden arvoiksi asetetaan
      // automaattisesti null-arvo.
      OutoOtus[] otos = new OutoOtus[LKM];

      // Luodaan satunnaislukugeneraattori.
      Random generaattori = new Random();

      // Kullakin kierroksella luodaan satunnaisesti otus
      // ja asetetaan otukseen viite taulukosta.
      for (int i = 0; i < LKM; i++) {
         // Valitaan satunnaisesti otuksen v�ri.
         String vari = varit[generaattori.nextInt(varit.length)];

         // Kummallakin tyypill� noin 50 % todenn�k�isyys.
         if (generaattori.nextBoolean()) {
            boolean hampaat = generaattori.nextBoolean();
            otos[i] = new Muhku(vari, hampaat);
         }
         else {
            int jalkoja = 1 + generaattori.nextInt(Mohko.JALKOJENMAXLKM);
            otos[i] = new Mohko(vari, jalkoja);
                  otos.tiedot(Mohko);
         }
      }

      // Tulostetaan otukset.
      //tulosta(otos);

   }
}
