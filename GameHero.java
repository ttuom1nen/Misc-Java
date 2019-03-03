/*
*Harjoitus 1 tehtävä 8
*Game
*
*Tommi Tuominen 2014
*/

public class Hero{
	
	private String name;
        private int str;
	private int health;

	public String name(){
	    return name;
	}
	
	public void nimi(String p){
	    name = p;
	}
	

	public int str(){
	    return str;
	}
	
	public void str(int h){
	    str = h;
	}

        public int health(){
	    return health;
	}
	
	public void health(int hp){
	    health = hp;
	}
        
        public void charSheet(){
            System.out.print("Hahmon nimi: "+name);
            System.out.print("Strength: "+str);         
            System.out.print("Strength: "+health); 
        }
        
}