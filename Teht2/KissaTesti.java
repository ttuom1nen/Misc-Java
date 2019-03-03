/*
 * Luento 3.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Luokka, jossa testataan Kissa-luokkaa.
 *
 */

public class KissaTesti {
   public static void main(String[] args) {
      
      // .equals() Vertailu vertaa olion arvoja, palauttaa true koska arvot samat.
      //Viitteiden poistuttua Javan automaattinen roskankerääjä poistaa käyttämättömän olion.
      
      // Luodaan kissa parametrittomalla oletusrakentajalla.
      Kissa rontti = new Kissa();
      
           
      // Tulostetaan aksessorien avulla.
      System.out.println(rontti.vari());   // musta
      System.out.println(rontti.hanta());  // kippura
           
      // Luodaan kissa parametrillisella rakentajalla.
      Kissa moykky = new Kissa("valkea", "tavallinen");
      Kissa morri = new Kissa("valkea", "tavallinen");
       
      //Tulos false, koska '==' vertaa olion viitteitä toisiinsa.
      System.out.println(morri == moykky);
      
      // Tulostetaan aksessorien avulla.
      System.out.println(moykky.vari());   // valkea
      System.out.println(moykky.hanta());  // tavallinen
   } 
}
