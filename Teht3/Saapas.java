/*
 * Viikkoharjoitus 3, teht�v� 3.
 *
 * Olio-ohjelmoinnin perusteet, kev�t 2014, Jorma Laurikkala.
 *
 * Konkreettinen saapasta mallintava luokka.
 *Tommi Tuominen
 */

public class Saapas extends Jalkine {

   /*
    * Vakiomuotoiset attribuutit.
    *
    */

   // Varren v�himm�ispituus senttimetrein�. M��ritell��n luokka-attribuutiksi,
   // jotta vakion arvoa ei ole tarpeen s�il�� kaikkiin olioihin.
   public static final int VARRENMINPITUUS = 15;

   /*
    * Attribuutit.
    *
    */

   // Saappaan varren pituus senttimetrein�. Pituus v�hint��n VARRENMINPITUUS.
   private int varrenPituus;

   /*
    * Rakentajat.
    *
    */

   public Saapas(double n, int i, int p) {
      super(n,i);
      varrenPituus(p);
   }

   /*
    * Aksessorit.
    *
    */

   public double varrenPituus() {
      return varrenPituus;
   }

   public void varrenPituus(int p) {
      if (p >= VARRENMINPITUUS)
         varrenPituus = p;
   }
   
   // Korvataan toString ja equals
     
   public String toString() {
      return super.toString() + 
      "" + numero + "" + ika;
   }

   public boolean equals(Object obj) {
      try {
         Saapas s = (Saapas)obj;
       
         if(super.equals(obj) && varrenPituus == s.varrenPituus()){    
            return true;  
         }else{
            return false;
         }
      }
      catch (Exception e) {
         return false;
      }
   }    
   
   
}
