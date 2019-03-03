/*
*Harjoitus 1 tehtävä 8
*AsuntoTesti
*
*Tommi Tuominen 2014
*/
import java.util.Scanner;

public class GameMain{
	public static void main(String[] args){
            Scanner user_input = new Scanner(System.in);
            String uinput;
            
            Hero hero = new Hero();
            
            
            System.out.print("Hahmon nimi:");
            uinput = user_input.next();
            
            hero.name(uinput);  
            
            hero.str(Math.random());
            hero.health(Math.random());

            Hero.charSheet();
	}
}
