/*
 *Harjoitus 2 Tehtävä 4
 *
 *
 *Tommi Tuominen 2014
*/

public class Morokolli extends Otus{
    
    private int hampaita;
    public boolean osaasyoda = true;
       
    public Morokolli(int j){
        if(j >= 0){
         hampaita = j;
        }
    }
    public Morokolli(int j, boolean v){
        if(j >= 0){
         hampaita = j;
        }
        super(v);
    }
//------

    public int hampaita(){
        return hampaita;
    }
    public void hampaita(int h){
        if(h >= 0){
         hampaita = h;
        }
    }
    
    public void syo(){
        System.out.println("Hampaita: "+hampaita);
        if(osaasyoda){
         System.out.println("Morokolli syo");
        }else{
         System.out.println("Morokolli ei osaa syoda"); 
        }
    }
    public void syo(String d){
        System.out.println("Hampaita: "+hampaita);
        if(osaasyoda){
         System.out.println("Morokolli syo "+d);
        }else{
         System.out.println("Morokolli ei osaa syoda");
        }
    }
    public void murmur(){
        if(vihainen){
            System.out.println("Murrr!");
        }
    }
}