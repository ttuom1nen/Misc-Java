/*
*Harjoitus 2 tehtävä 2
*AsuntoTesti
*
*Tommi Tuominen 2014
*/

public class AsuntoTesti{
	public static void main(String[] args){
		//Esitellään viite, luodaan olio
		//ja liitetään viite olioon
		Asunto talo = new Asunto(55,15000);
		Asunto talo2 = new Asunto();
		
		//talo.hinta = 200; ei onnistu, koska muuttuja private
		
		//Luetaan tietoja
		System.out.println(talo.pintaala());
		System.out.println(talo.hinta());
		System.out.println("-----------");
		System.out.println(talo2.pintaala());
		System.out.println(talo2.hinta());		
	}
}