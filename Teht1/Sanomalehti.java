/*
*Harjoitus 1 tehtävä 6
*Sanomalehti
*
*Tommi Tuominen
*/

public class Sanomalehti{

	//Luodaan muuttujat
	private String nimi;
	private int vuosi;
	private int levikki;	
	
	public Sanomalehti(){
		nimi = "Ei annettu";
		vuosi = 1600;
		levikki = 1;
	}
	
	//getteri ja setteri
	public String nimi(){
		return nimi;
	}	
	public void nimi(String p){
		if(p != null && p.length() != 0){
			nimi = p;
		}
	}
	
	//getteri ja setteri
	public int vuosi(){
		return vuosi;
	}	
	public void vuosi(int h){
		if(h >= 1600){
			vuosi = h;
		}
	}

	//getteri ja setteri	
	public int levikki(){
		return levikki;
	}	
	public void levikki(int k){
		if(k >= 0){
			levikki = k;
		}
	}
}