
public class GameSword extends GameWeapon implements GameWepInterFace{
 
    private boolean magical;
    private int condition;
    
    public GameSword(String n, int t, int d, int x, boolean m, int c){
        super(n, t, d, x);
        magical(m);
        condition(c);
    }
    
    public boolean magical(){
        return magical;
    }
    public void magical(boolean m){
        magical = m;
    }

    public int condition(){
        return condition;
    }
    public void condition(int c){
        condition = c;
    }
    
    public void usemagic(){
        if(magical){
            System.out.println("Taika kaytetty!");
        }else{
            System.out.println("Miekassa ei ole taikaa!");            
        }
    }
    public void viewinfo(){
            System.out.println("Taika?: "+magical);
            System.out.println("Kunto?: "+condition);
    }
    
    // Korvataan toString ja equals
         
    public String toString() {
       return super.toString() + 
       "" + magical() + "" + condition();
    }
 
    public boolean equals(Object obj) {
     GameSword gs = (GameSword)obj;
     
       try {
         return (super.equals(obj) && magical == gs.magical() && condition == gs.condition());
       }
       catch (Exception e) {
          return false;
       }
    } 
}