/*
 * Viikkoharjoitus 3, tehtävä 3.
 *
 * Olio-ohjelmoinnin perusteet, kevät 2014, Jorma Laurikkala.
 *
 * Konkreettinen saapasta mallintava luokka.
 *Tommi Tuominen
 */

public class Saapas extends Jalkine {

   /*
    * Vakiomuotoiset attribuutit.
    *
    */

   // Varren vähimmäispituus senttimetreinä. Määritellään luokka-attribuutiksi,
   // jotta vakion arvoa ei ole tarpeen säilöä kaikkiin olioihin.
   public static final int VARRENMINPITUUS = 15;

   /*
    * Attribuutit.
    *
    */

   // Saappaan varren pituus senttimetreinä. Pituus vähintään VARRENMINPITUUS.
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
