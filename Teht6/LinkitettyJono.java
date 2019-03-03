/*
 * Oope viikkoharj. 6 teht. 1
 *
 * LinkitettyJono
 * Tommi Tuominen 2014
*/

//tuodaan lista-paketti
import fi.uta.csjola.oope.lista.*;

public class LinkitettyJono extends AbstraktiJono {
    
   private LinkitettyLista lista;
    
   public LinkitettyJono(int m) {
    super(m);
    lista = new LinkitettyLista();
   }

   //Lis‰‰ pinoon/listaan
   public boolean lisaa(Object o) {
    if (koko() < maxKoko()) {
      lista.lisaaLoppuun(o);
      return true;
    }
    else
      return false;
   }

   //Poistaa ylimm‰n/ekan alkion
   public Object poista() {
      return lista.poistaAlusta();
   }

   //Palauttaa alkioiden lukum‰‰r‰n
   public int koko() {
      return lista.koko();
   }
   
   //Testaa onko lista/pino tyhj‰
   public boolean onkoTyhja() {
      return lista.onkoTyhja();
   }

   //Palauttaa ylimm‰n/ekan alkion
   public Object ylin() {
      return lista.alkio(0);
   }
    
   //Korvataan toString metodi:   
   public String toString() {

      final String viiva = "------";
      final String viivain = "<\n";
      final String viivaout = ">\n";
      String jonostring = viiva+viivaout;

      for (int i = 0; i < koko(); i++){
        jonostring += lista.alkio(i) + "\n";
      }
      jonostring += viiva+viivain;
  
      //Palautetaan muodostettu merkkijono.
      return jonostring;
   }
}