/*
 * Viikkoharjoitus 2, tehtävä 1.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Tiedosto-luokkaa testaava luokka.
 *
 */

public class TiedostoTesti {
   public static void main(String[] args) {
      // Esitellään viite, luodaan olio ja liitetään viite olioon.
      Tiedosto sorsa = new Tiedosto();

      // Tulostetaan tiedot näytölle.
      System.out.println(sorsa.nimi());
      System.out.println(sorsa.koko());

      // Esitellään viite, luodaan olio ja liitetään viite olioon.
      Tiedosto ht = new Tiedosto("Roomalaiset.java", 7746);

      // Tulostetaan tiedot näytölle.
      System.out.println(ht.nimi());
      System.out.println(ht.koko());

      // Yritetään muuttaa olion tietoja.
      ht.nimi("Txtris.java");
      ht.koko(19273);

      // Tulostetaan tiedot näytölle.
      System.out.println(ht.nimi());
      System.out.println(ht.koko());
   }
}