/*
*Harjoitus 3 tehtävä 2
*KannykkaTesti
*
*Tommi Tuominen 2014
*/

public class KannykkaTesti{
	public static void main(String[] args){

		Kannykka puhelin = new Kannykka(true);
		
		System.out.println("Alypuhelin?:" +puhelin.alykas());
                puhelin.kaynnisty();
                puhelin.riko();
		
	}
}