/*
*Harjoitus 1 tehtava 8
*GameMonster
*Luokka johdettu GameChar-luokasta
*Tommi Tuominen 2014
*/

public class GameMonster extends GameChar{
	private int type;

	public int type(){
		return health;
	}	
	public void type(int t){
		type = t;
	}	
}