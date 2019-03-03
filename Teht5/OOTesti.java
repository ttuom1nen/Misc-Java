/*
 * Viikkoharjoitus 5, tehtävä 5.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Testiluokka oudoille otuksille.
 *
 */

// Otetaan käyttöön pakatut otukset.
import otukset.*;

// Otetaan käyttöön Random-luokka.
import java.util.Random;

public class OOTesti {

   /* Tulostetaan taulukon t alkioiden viittaamien otuksen tiedot näytölle.
    * Huomaa, että instanceof-operaattori palauttaa false-arvon, jos sille
    * annettu viite on null-arvoinen.
    */
  /* public static void tulosta(OutoOtus[] t) {
      // Otuksen tietoja erottava merkkijono.
      final String EROTIN = " ";

      // Käydään taulukko läpi alkio kerrallaan, jos taulukolle on muistettu
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
      // Otusten lukumäärä.
      final int LKM = 5;

      // Taulukko väreille.
      String[] varit = { "punainen", "sininen", "vihreä" };

      // Luodaan taulukko otuksille. Taulukon viitteiden arvoiksi asetetaan
      // automaattisesti null-arvo.
      OutoOtus[] otos = new OutoOtus[LKM];

      // Luodaan satunnaislukugeneraattori.
      Random generaattori = new Random();

      // Kullakin kierroksella luodaan satunnaisesti otus
      // ja asetetaan otukseen viite taulukosta.
      for (int i = 0; i < LKM; i++) {
         // Valitaan satunnaisesti otuksen väri.
         String vari = varit[generaattori.nextInt(varit.length)];

         // Kummallakin tyypillä noin 50 % todennäköisyys.
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
