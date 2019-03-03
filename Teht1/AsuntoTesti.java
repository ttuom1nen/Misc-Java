/*
*Harjoitus 1 tehtävä 5
*AsuntoTesti
*
*Tommi Tuominen 2014
*/

public class AsuntoTesti{
	public static void main(String[] args){
		//Esitellään viite, luodaan olio
		//ja liitetään viite olioon
		Asunto talo = new Asunto();
		
		//Asetetaan arvoja
		talo.pintaala(39);
		talo.hinta(13000);
		
		//talo.hinta = 200; ei onnistu, koska muuttuja private
		
		//Luetaan tietoja
		System.out.println(talo.pintaala());
		System.out.println(talo.hinta());
	}
}