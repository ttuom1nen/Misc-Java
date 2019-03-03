/*
 * Viikkoharjoitus 4, tehtävä 2.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Luetaan komentoriviparametrina annettu tekstitiedosto Scanner-
 * luokan avulla ArrayList-tyyppiseen kokoelmaan. ArrayList on
 * Vector-luokan tapainen vaihtuvamittainen taulukko. Kokoelman
 * alkioiden tyypiksi kiinnitetään String, jotta koodi olisi 
 * turvallisempaa.
 *
 */

// Otetaan pakkaukset käyttöön.
import java.util.*;
import java.io.*;

public class TiedostonKapistelya {

   /* Luetaan tekstiedoston sisältö kokoelmaan. Paluuarvo on viite merkkijonojen
    * muodostamaan kokoelmaolioon. Metodi heittää poikkeuksen, jos parametrissa 
    * tai tiedostonkäsittelyssä ilmenee virhe.
    */
   public static ArrayList<String> lueTiedosto(String tiedostonNimi) throws NullPointerException, IOException {
      // Luodaan tiedostoon liittyvä tiedosto-olio.
      File tiedosto = new File(tiedostonNimi);

      // Liistetään tiedosto-olioon lukija.
      Scanner lukija = new Scanner(tiedosto);

      // Luodaan uusi ArrayList-tyyppinen olio ja liitetään siihen viite.
      // Huomaa geneeriset määreet, joilla kokoelman alkoiden tyypiksi 
      // kiinnitetään String.
      ArrayList<String> rivit = new ArrayList<String>();

      // Luetaan niin kauan kuin löytyy uusi tekstirivi.
      while (lukija.hasNext())
         // Lisätään kokoelmaan rivi tekstiä.
         rivit.add(lukija.nextLine());

      // Palautetaan viite kokoelmaan.
      return rivit;
   }

   /* Tulostaa kokoelmaan tallennetut tekstitiedoston rivit näytölle.
    */
   public static void tulosta(ArrayList<String> rivit) throws NullPointerException {
      // Kokoelmaa voidaan selata myös for-each-lauseella (for-lauseen variaatio).
      for (String rivi : rivit)
         System.out.println(rivi);
   }

   public static void main(String[] args) {
      // Luetaan tekstitiedoston rivit kokoelmaan. Tiedoston nimi välitetään
      // ohjelmalle komentoriviparametrina.


   try {
     ArrayList<String> rivit = lueTiedosto(args[0]);
    // throw new FileNotFoundException("This is an error message");
     
   } catch (FileNotFoundException e) {
     System.out.println("File not found: " + e.getMessage());
     
   } catch (EOFException e) {
     System.out.println("End of file reached: " + e.getMessage());
     
   } catch (IOException e) { // catch all IOExceptions not handled by previous catch blocks
     System.out.println("General I/O exception: " + e.getMessage());
     e.printStackTrace();
     
   } 
  
      

      // Tulostetaan tiedosto näytölle. 
      tulosta(rivit);
   }
}