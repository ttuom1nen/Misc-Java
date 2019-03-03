/*
 * Viikkoharjoitus 2, tehtävä 1.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Tiedosto-käsitettä karkeasti mallintava luokka, jossa on virhe.
 * Muokannut: Tommi Tuominen
 */

public class Tiedosto {

   /*
    * Attribuutit.
    *
    */

   // Tiedoston nimi.
   private String nimi;

   // Tiedoston koko tavuina.
   private int koko;

   /*
    * Metodit.
    *
    */

   //Ongelma korjaantui, kun loin parametrittömän constructorin
   public Tiedosto() {
   }    
    
   public Tiedosto(String n, int k) {
      nimi(n);
      koko(k);
   }

   public String nimi() {
      return nimi;
   }

   public void nimi(String n) {
      if (n != null && n.length() > 0)
         nimi = n;
   }

   public int koko() {
      return koko;
   }

   public void koko(int k) {
      if (koko >= 0)
         koko = k;
   }
}
