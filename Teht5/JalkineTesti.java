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
		Tohveli tohveli2 = new Tohveli(42,10,true);
		Tohveli tohveli3 = new Tohveli(38,1,false);
		
		Saapas saapas = new Saapas(38,5,15);
		Saapas saapas2 = new Saapas(38,5,15);
		Saapas saapas3 = new Saapas(38,5,12);
		
		//Testataan toString
		System.out.println("tohveli: " + tohveli);
		System.out.println("tohveli2: " + tohveli2);
		System.out.println("tohveli3: " + tohveli3);
		System.out.println("saapas: " + saapas);
		System.out.println("saapas2: " + saapas2);
		System.out.println("saapas3: " + saapas3);

		
		//Verrataan olioita:		
		System.out.println("\ntohveli ja tohveli2  "+tohveli.equals(tohveli2));
		System.out.println("tohveli2 ja tohveli3 "+tohveli2.equals(tohveli3));
		System.out.println("\nsaapas ja saapas2    "+saapas.equals(saapas2));
		System.out.println("saapas2 ja saapas3   "+saapas2.equals(saapas3));
            
	}
}