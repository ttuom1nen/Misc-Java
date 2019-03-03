/*
*Harjoitus 1 tehtävä 6
*SanomalehtiTesti
*
*Tommi Tuominen
*/

public class SanomalehtiTesti{
	public static void main(String[] args){
	
		//Esitellään viite, luodaan olio
		//ja liitetään viite olioon
		Sanomalehti nyheter = new Sanomalehti();
		
		//Asetetaan arvoja
		nyheter.nimi("Dagens News");
		nyheter.vuosi(1860);
		nyheter.levikki(55);
		
		//Luetaan tietoja
		System.out.println("Lehden nimi: "+nyheter.nimi());
		System.out.println("Lehden vuosi: "+nyheter.vuosi());
		System.out.println("Lehden levikki: "+nyheter.levikki());	
	}

}