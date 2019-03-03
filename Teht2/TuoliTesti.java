/*
*Harjoitus 2 tehtävä 3
*TuoliTesti
*
*Tommi Tuominen 2014
*/

public class TuoliTesti{
	public static void main(String[] args){
		//Esitellään viite, luodaan olio
		//ja liitetään viite olioon
		Tuoli tuoli = new Tuoli(6,true);
		Tuoli tuoli2 = new Tuoli();		
		//Luetaan tietoja
		System.out.println(tuoli.jalkoja());
		System.out.println(tuoli.selkanoja());
		System.out.println(tuoli2.jalkoja());
		System.out.println(tuoli2.selkanoja());		
	}
}