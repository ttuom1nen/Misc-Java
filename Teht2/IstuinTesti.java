/*
*Harjoitus 2 tehtävä 7
*
*
*Tommi Tuominen 2014
*/

public class IstuinTesti{
	public static void main(String[] args){

		//Luodaan Tuoli olio.
		Tuoli penkki = new Istuin();
		
		//Asetetaan Istuin-luokan materiaali ja
		//Suoritetaan tiedot()-metodi.
		((Istuin)penkki).materiaali("Keinonahka");
		((Istuin)penkki).tiedot();

	}
}