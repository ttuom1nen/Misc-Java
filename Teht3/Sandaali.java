/*
 * Viikkoharjoitus 3, tehtävä 4
 *
 *Sandaali-luokka
 *Tommi Tuominen
 */

public class Sandaali extends Jalkine {


   public Sandaali(double n, int i) {
      super(n,i);
   }

   /*
   * Oliometodit.
   *
   */

   public void rikki() {
      if (Math.random() < 0.50)
         System.out.println("Sandaalit meni rikki...");
   }   
   
}
