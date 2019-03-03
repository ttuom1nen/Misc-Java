/*
 * Oope viikkoharj. 6 teht. 1
 *
 * LinkitettyJonoTesti
 * Tommi Tuominen 2014
*/

public class LinkitettyJonoTesti {
   public static void main(String[] args) {
      // Luodaan kolmen alkion kokoinen jono.
      LinkitettyJono jono1 = new LinkitettyJono(3);

      //T‰ytet‰‰n jono.
      for (int i = 1000; i < 1003; i++){
         Integer alkio = new Integer(i);
         jono1.lisaa(alkio);
         System.out.println("Lisatty: "+alkio);
      }
      System.out.println(jono1);
           
      //Poistetaan kaikki jonosta:
      while (!jono1.onkoTyhja()){
        //Tarkastetaan jonon ensimmainen:
        System.out.println("Jonon ensimmainen:");
        System.out.println(jono1.ylin()+"\n");
        
        System.out.println("Poistetaan: "+jono1.poista());
        System.out.println(jono1);
      }

      Jono jono2 = new LinkitettyJono(5);

      //Lisataan jonoon:
      jono2.lisaa("A");
      jono2.keula();
      jono2.lisaa("B");
      jono2.lisaa("C");
      
      //Tulostetaan jonon koko:
      System.out.print("Listan koko:");
      System.out.println(jono2.koko());

      //Testataan onko jono tyhja:
      System.out.print("onko tyhja? ");
      System.out.println(jono2.onkoTyhja());

      System.out.print("Jonon koko:");
      System.out.println(jono2.koko());
           
      //Tulostetaan jono:
      System.out.println(jono2);
      
      //Poistetaan jonosta:
      System.out.println("Poistetaan ensimmainen: ");
      System.out.println(jono2.poista());
      
      //Tulostetaan jono uudestaan:
      System.out.println(jono2);

   }
}
