/*
 *harj. 6 teht. 2
 *
 *Tommi Tuominen 2014
 *
*/

public class ALPinoTesti{
   public static void main(String[] args) {

      ALPino pino1 = new ALPino(5);
      
      //T‰ytet‰‰n
      for (int i = 1; i < 4; i++) {
         pino1.lisaa(Integer.toString(i));
         System.out.println("Lisatty: " + i);
      }
      System.out.println(pino1);

      //Testataan metodeja:
      System.out.println("Pinon koko: "+pino1.koko());
      System.out.println("Viimeksi lisatty: "+pino1.ylin()+"\n");      
      
      //Poistetaan kaikki pinosta:
      while (!pino1.onkoTyhja()){
        //Tarkastetaan pinon ensimmainen:
        System.out.println("pinon paallimmainen:");
        System.out.println(pino1.ylin()+"\n");
        
        System.out.println("Poistetaan: "+pino1.poista());
        System.out.println(pino1);
      }
      
   }
}
