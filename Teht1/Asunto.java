/*
*Harjoitus 1 tehtävä 5
*Asunto-luokka
*
*Tommi Tuominen 2014
*/

public class Asunto{
	//Asunnon pinta-ala neliömetreinä
	private double pintaala;
	
	//Asunnon hinta
	private int hinta;

	
	//Parametritön oletusrakentaja
	public Asunto(){
		pintaala = 80;
		hinta = 160000;
	}
	
	//Parametrillinen rakentaja
	public Asunto(double a, int b){
		if(a >= 20){
			pintaala = a;
		}		
		if(b > 0){
			hinta = b;
		}
	}
	
	//getteri ja setteri
	public double pintaala(){
		return pintaala;
	}
	
	public void pintaala(double p){
		if(p >= 20){
			pintaala = p;
		}
	}
	
	//getteri ja setteri
	public int hinta(){
		return hinta;
	}
	
	public void hinta(int h){
		if(h > 0){
			hinta = h;
		}
	}
}