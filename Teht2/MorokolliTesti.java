/*
*Harjoitus 2 teht‰v‰ 4
*
*
*Tommi Tuominen 2014
*/

public class MorokolliTesti{
	public static void main(String[] args){
		//Esitell‰‰n viite, luodaan olio
		//ja liitet‰‰n viite olioon
		Morokolli moro = new Morokolli(10);
		
		//Testataan kuormitettu:
                moro.syo();
		moro.syo("Lihapullia");
	}
}