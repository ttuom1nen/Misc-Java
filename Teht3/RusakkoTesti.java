/*
*Harjoitus 3 teht‰v‰ 1
*RusakkoTesti
*
*Tommi Tuominen 2014
*/

public class RusakkoTesti{
	public static void main(String[] args){
		//Esitell‰‰n viite, luodaan olio
		//ja liitet‰‰n viite olioon
		Rusakko janis = new Rusakko(true,8,true);
		Rusakko janis2 = new Rusakko();

		//Testataan parametrillisella rakentajalla tehty olio:	
                System.out.println("Paino: "+janis.paino()+"kg");
		System.out.println("Turkki: "+janis.turkillinen());
                System.out.println("onkoIso: "+janis.onkoIso());
		janis.syo();                
		janis.moikkaa();
		
		//Testataan parametrittomalla rakentajalla tehty olio:
                System.out.println("----------");		
                System.out.println("Paino: "+janis2.paino()+"kg");
		System.out.println("Turkki: "+janis2.turkillinen());		
                System.out.println("onkoIso: "+janis2.onkoIso());
		janis2.syo();                
		janis2.moikkaa();		
	}
}