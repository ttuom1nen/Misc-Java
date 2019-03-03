/*
*Harjoitus 5 tehtävä 1/2
*Asunto-luokka
*
*Tommi Tuominen 2014
*/

public class Asunto{
	//Asunnon pinta-ala neliömetreinä
	private double pintaala;
	
	//Asunnon hinta
	private int hinta;
	
	//Parametritön oletusrakentaja
	public Asunto(){
		pintaala = 80;
		hinta = 160000;
	}
	
	//Parametrillinen rakentaja
	public Asunto(double a, int b){
		if(a >= 20){
			pintaala = a;
		}		
		if(b > 0){
			hinta = b;
		}
	}
	
	//getteri ja setteri
	public double pintaala(){
		return pintaala;
	}
	
	public void pintaala(double p){
		if(p >= 20){
			pintaala = p;
		}
	}
	
	//getteri ja setteri
	public int hinta(){
		return hinta;
	}
	
	public void hinta(int h){
		if(h > 0){
			hinta = h;
		}
	}

   // Korvataan toString ja equals
     
   public String toString() {
      return super.toString() + 
      " | " + hinta + " | " + pintaala;
   }

   public boolean equals(Object obj) {
      try {
         Asunto e = (Asunto)obj;
         return (pintaala == e.pintaala()) && (hinta == e.hinta());
      }
      catch (Exception e) {
         return false;
      }
   }
   
   //CompareTo-metodi
	public int compareTo(Asunto T) {
     
	     if (pintaala == T.pintaala()){
	       
		     if(hinta == T.hinta){
			     return 0;
		     }
	     }
	     return 1;
	} 
}