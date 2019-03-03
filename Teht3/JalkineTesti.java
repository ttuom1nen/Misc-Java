/*
*Harjoitus 3 teht‰v‰ 3
*JalkineTesti
*
*Testataan tohveli ja saapas
*
*Tommi Tuominen 2014
*/

public class JalkineTesti{
	public static void main(String[] args){
		//Esitell‰‰n viite, luodaan olio
		//ja liitet‰‰n viite olioon
		Tohveli tohveli = new Tohveli(42,10,true);
		Saapas saapas = new Saapas(38,5,15);
		
		//Luetaan tietoja
		System.out.println("Ika: "+tohveli.ika());
		System.out.println("Numero: "+tohveli.numero());
                System.out.println("Reino: "+tohveli.reino());
                tohveli.katoa();
		System.out.println("-----------");
                System.out.println("Ika: "+saapas.ika());
		System.out.println("Numero: "+saapas.numero());
                System.out.println("Varsi: "+saapas.varrenPituus()+"cm");
                
                //Vanhennetaan tohveli ja saapas
                tohveli.vanhene();
                saapas.vanhene();
		System.out.println("-----------");
		//Luetaan uudet tiedot
		System.out.println("Ika: "+tohveli.ika());
		System.out.println("Numero: "+tohveli.numero());
                System.out.println("Reino: "+tohveli.reino());
                tohveli.katoa();
		System.out.println("-----------");
                System.out.println("Ika: "+saapas.ika());
		System.out.println("Numero: "+saapas.numero());
                System.out.println("Varsi: "+saapas.varrenPituus()+"cm");
                
	}
}