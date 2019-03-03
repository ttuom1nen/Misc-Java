/*
 *Harj. 6 teht. 2
 *
 *Tommi Tuominen 2014
*/

//tuodaan tarvittavat paketit:
import java.util.*;

public class ALPino extends AbstraktiPino{

  //private static ArrayList<Integer> taulu = new ArrayList<>(5);
    private ArrayList<String> taulu = new ArrayList<String>();
    int gg; 
   
    public ALPino(int m){
       super(m);
    }
   //<Object>
   //Lis‰‰ pinoon/listaan
/*   public boolean lisaa(Object o) {
    if (koko() < maxKoko()){
      taulu.add(o);
      return true;
    }
    else
      return false;
   }*/

    public boolean lisaa(String o) {
    if (koko() < maxKoko()){
      taulu.add(o);
      return true;
    }
    else
      return false;
   }

   //Poistaa ylimm‰n/ekan alkion
   public Object poista(){  
    return taulu.remove(ylin());
   }

   //Palauttaa alkioiden lukum‰‰r‰n
   public int koko(){
      return taulu.size();
   }
   
   //Testaa onko pino tyhj‰
   public boolean onkoTyhja(){
      return taulu.isEmpty();
   }

   //Palauttaa ylimm‰n alkion
   public Object ylin(){
    gg = koko()-1;
    return taulu.get(gg);
   }
    
   //Korvataan toString metodi:   
   public String toString(){

      final String viiva = "------";
      final String viivain = "<\n";
      final String viivaout = ">\n";
      String jonostring = viiva+viivaout;

      for (int i = 0; i < koko(); i++){
        jonostring += taulu.get(i) + "\n";
      }
      jonostring += viiva+viivain;
  
      //Palautetaan muodostettu merkkijono.
      return jonostring;
   }
}