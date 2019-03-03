/*
*Harjoitus 3 teht‰v‰ 4
*SandaaliTesti
*
*Tommi Tuominen 2014
*/

public class SandaaliTesti{
	public static void main(String[] args){
		//Esitell‰‰n viite, luodaan olio
		//ja liitet‰‰n viite olioon
		Sandaali sandal = new Sandaali(42,1);
		
		//Luetaan tietoja
		System.out.println("Ika: "+sandal.ika());
		System.out.println("Numero: "+sandal.numero());
                sandal.rikki();

	}
}