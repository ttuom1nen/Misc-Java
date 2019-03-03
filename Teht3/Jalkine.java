/*
 * Viikkoharjoitus 3, tehtävä 3.
 *
 * 
 *
 * Tommi Tuominen
 *
 */

public abstract class Jalkine {

    private double numero;
    private int ika;
   
   /*
    * Rakentajat.
    *
    */

    public Jalkine(){
        numero = 42;
        ika = 0;
    }
    
    public Jalkine(double n, int i) {
        numero(n);
        ika(i);
    }

   //Aksessorit 
   public double numero() {
      return numero;
   }

   public void numero(double n) {
      if (n >= 0)
         numero = n;
   }

   public int ika() {
      return ika;
   }

   public void ika(int i) {
      if (i >= 0)
         ika = i;
   }

   //Olion Metodit   
   public void vanhene() {
      ika++;
   }
   
   // Korvataan toString ja equals
     
   public String toString() {
      return super.toString() + 
      "" + numero + "" + ika;
   }

   public boolean equals(Object obj) {
      try {
         Jalkine e = (Jalkine)obj;
         return (numero == e.numero()) && (numero == e.numero());
      }
      catch (Exception e) {
         return false;
      }
   } 
   
}
