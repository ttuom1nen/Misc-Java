/*
*Harjoitus 3 tehtävä 2
*Kannykka-luokka
*
*Tommi Tuominen 2014
*/

public class Kannykka extends Sahkolaite{

	public boolean alykas;
	private boolean rikki;
        private boolean virta;
        
        //Konstruktorit
        public Kannykka(){
            alykas = false;
        }
        
        public Kannykka(boolean a){
            alykas = a;
        }
        
        //Aksessorit
	public boolean alykas(){
		return alykas;
	}
	
	public void alykas(boolean p){
                alykas = p;
	}

//Kannykan rikkoutuminen kokeillaan kaynnistyksessa
        public void kaynnisty() {
            virta = true;
            System.out.println("Virta: "+virta);             
        }
     
        public void sammu() {
            virta = false;
            System.out.println("Virta: "+virta);            
        }

	
        public boolean rikkoudu(){
            boolean rikki;

            if(alykas){
                rikki = Math.random() < 0.05;
            }else{
                rikki = Math.random() < 0.01;
            }

            return rikki;
        }

//Puhelimen rikkominen        
        public void riko(){
            System.out.println("Yritetaan rikkoa puhelin:");           
            if(rikkoudu()){
             System.out.println("Rikki meni!");
             sammu();
            }else{
             System.out.println("Ei rikkoutunut!");                
            }
        }

}