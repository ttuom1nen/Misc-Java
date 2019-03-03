/*
*Harjoitus 2 teht‰v‰ 5
*Autotesti
*
*Tommi Tuominen 2014
*/

public class AutoTesti{
	public static void main(String[] args){
		//Esitell‰‰n viite, luodaan olio
		//ja liitet‰‰n viite olioon
		Auto kaara1 = new Auto();
                kaara1.tehokw(1233.42);	
		System.out.println("Auton teho: "+kaara1.tehokw()+"kw");
		System.out.println("Auton valmnum: "+kaara1.valmnum());
		System.out.println("-----------------");
		
		Auto kaara2 = new Auto();
                kaara2.tehokw(5555.55);	
		System.out.println("Auton teho: "+kaara2.tehokw()+"kw");
		System.out.println("Auton valmnum: "+kaara2.valmnum());
		System.out.println("-----------------");
		
		Auto kaara3 = new Auto();
                kaara3.tehokw(3242.123);	
		System.out.println("Auton teho: "+kaara3.tehokw()+"kw");
		System.out.println("Auton valmnum: "+kaara3.valmnum());
		System.out.println("-----------------");
	}
}