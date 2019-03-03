/*
 * Viikkoharjoitus 2, teht�v� 1.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * Tiedosto-luokkaa testaava luokka.
 *
 */

public class TiedostoTesti {
   public static void main(String[] args) {
      // Esitell��n viite, luodaan olio ja liitet��n viite olioon.
      Tiedosto sorsa = new Tiedosto();

      // Tulostetaan tiedot n�yt�lle.
      System.out.println(sorsa.nimi());
      System.out.println(sorsa.koko());

      // Esitell��n viite, luodaan olio ja liitet��n viite olioon.
      Tiedosto ht = new Tiedosto("Roomalaiset.java", 7746);

      // Tulostetaan tiedot n�yt�lle.
      System.out.println(ht.nimi());
      System.out.println(ht.koko());

      // Yritet��n muuttaa olion tietoja.
      ht.nimi("Txtris.java");
      ht.koko(19273);

      // Tulostetaan tiedot n�yt�lle.
      System.out.println(ht.nimi());
      System.out.println(ht.koko());
   }
}