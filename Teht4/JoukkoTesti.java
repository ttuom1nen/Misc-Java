/*
*teht. 6
*JoukkoTesti
*Tommi Tuominen 2014
*/

public class JoukkoTesti{
	public static void main(String[] args){
  
        //int[] taulu1 = null;
        int[] taulu1 = {1,2,3,4};
		
		//Luodaan joukko parametrilla taulu1
	try{        
		Joukko jko = new Joukko(taulu1);
	} catch(NullPointerException ex) {
		System.out.println("NullPointerException "+ex);    
        } catch(IllegalArgumentException ex) {
		System.out.println("IllegalArgumentException "+ex);
        }
		
	//Lis‰t‰‰n tauluun arvo:
	try{
		Joukko.lisaaArvo(5);
        }catch(IllegalArgumentException ex){
		System.out.println("IllegalArgumentException "+ex);
        }				
		Joukko.tulosta();
		System.out.println("Taulun koko: "+Joukko.joukonKoko());
	}
}