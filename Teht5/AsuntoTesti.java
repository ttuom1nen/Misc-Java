/*
*Harjoitus 5 tehtävä 1/2
*AsuntoTesti
*
*Tommi Tuominen 2014
*/

public class AsuntoTesti{
	public static void main(String[] args){
	//Esitellään viite, luodaan olio
	//ja liitetään viite olioon
	Asunto talo = new Asunto(55,15000);
	Asunto talo2 = new Asunto(55,15000);
	Asunto talo3 = new Asunto(32,11000);
	
	//talo.hinta = 200; ei onnistu, koska muuttuja private
	
	//Luetaan tietoja
	System.out.println("\nTalo1:");		
	System.out.println(talo.pintaala());
	System.out.println(talo.hinta());
	System.out.println("\nTalo2:");
	System.out.println(talo2.pintaala());
	System.out.println(talo2.hinta());
	System.out.println("\nTalo3:");
	System.out.println(talo3.pintaala());
	System.out.println(talo3.hinta());		
	System.out.println("");
	
	//Testataan toString
	System.out.println("talo: " + talo);
	System.out.println("talo2: " + talo2);
	System.out.println("talo3: " + talo3);
	
	//Testataan equals
	System.out.println("Viitteet samat? " + (talo == talo2));
	System.out.println("talo ja talo2 samat?(equals)" + talo.equals(talo2));
	System.out.println("talo2 ja talo3 samat?(equals)" + talo2.equals(talo3));
	System.out.println("talo ja talo samat?(equals)" + talo.equals(talo));
	System.out.println("");
	//Testataan compareTo
	//Tehtävässä käskettiin palauttamaan 0 jos pinta-ala ja hinta samat.
	System.out.println("talo ja talo2 samat?(compareTo) " + talo.compareTo(talo2));
	System.out.println("talo2 ja talo3 samat?(compareTo) "+ talo2.compareTo(talo3));
	System.out.println("talo ja talo samat?(compareTo) "+ talo.compareTo(talo));		
	}
}