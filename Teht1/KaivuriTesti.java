/*
*Harjoitus 1 teht‰v‰ 4
*KaivuriTesti
*
*Tommi Tuominen 2014
*/

public class KaivuriTesti{
	public static void main(String[] args){
	double kpaino;
        boolean ktelat;
        String kvari;
        
		//Esitell‰‰n viite, luodaan olio
		//ja liitet‰‰n viite olioon
		Kaivuri kaivuri = new Kaivuri();

		//Asetetaan arvoja
		kaivuri.paino(16.12323233);
		kaivuri.telat(true);
		kaivuri.vari("Keltainen");
                
		//Tallennetaan arvot muuttujiin
                kpaino=kaivuri.paino();
		ktelat=kaivuri.telat();
		kvari=kaivuri.vari();
		
		//Luetaan tietoja
		System.out.println("Kaivurin paino: "+kaivuri.paino()+"t");
		System.out.println("Kaivurin telat: "+ktelat);
		System.out.println("Kaivurin vari: "+kvari);	
	}

}

