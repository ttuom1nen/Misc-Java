public class GameSwordTest{
	public static void main(String[] args){

            GameSword miekka = new GameSword("pro miekka", 5,5,5,true,50);
	    GameSword miekka2 = new GameSword("pro miekka", 5,5,5,true,50);
	    GameSword miekka3 = new GameSword("huono miekka", 1,1,1,false,5);
	    GameSword miekka4 = new GameSword("huono miekka", 1,2,1,false,5);

	System.out.println("miekka ja miekka2  "+miekka.equals(miekka2));
	System.out.println("miekka2 ja miekka3 "+miekka2.equals(miekka3));
	System.out.println("miekka3 ja miekka4    "+miekka3.equals(miekka4));
	System.out.println("miekka ja miekka4   "+miekka.equals(miekka4));        
        }
}