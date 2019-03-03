/*
*Harjoitus 3 tehtävä 1
*Rusakko-luokka
*
*Tommi Tuominen 2014
*/

public class Rusakko extends Nisakas{

    
    public Rusakko(){
      super(true, 5, true);
    }
    
    public Rusakko(boolean e, double p, boolean t){
      super(e, p, true);
    }

   public void syo() {
      System.out.println("Syon kuin janis...");
      aantely();
   }
   
   public boolean onkoIso() {
      return paino() > 6;
   }

    public void aantely(){
        System.out.println("nom nom nom");
    }
    
   public void moikkaa() { 
      System.out.println("pupupu"); 
   }
}