/*
 * Luento 11.
 *
 * Olio-ohjelmoinnin perusteet, Jorma Laurikkala.
 *
 * Luokka, jossa testataan pinoa.
 *
 */

public class LinkitettyPinoTesti {
   public static void main(String[] args) {
      // Luodaan kolmen alkion kokoinen pino.
      LinkitettyPino pino1 = new LinkitettyPino(3);

      // T‰ytet‰‰n pinoa.
      for (int i = 1000; i < 1003; i++) {
         Integer alkio = new Integer(i);
         pino1.lisaa(alkio);
         System.out.println("Lis‰tty: " + alkio);
      }
      System.out.println(pino1);

      // Poistetaan kaikki alkiot.
      while (!pino1.onkoTyhja())
         System.out.println("Poistettu: " + pino1.poista());
      System.out.println(pino1);

      // Luodaan viiden alkion kokoinen pino. (Rajapinnasta ei voida luoda olioita,
      // mutta kaikki luokan toteuttamat rajapinnat k‰yv‰t toteuttavan luokan
      // olioon liitett‰v‰n viitteen tyypiksi.)
      Pino pino2 = new LinkitettyPino(5);

      // lis‰‰(A)
      System.out.println("lis‰‰(A)");
      pino2.lisaa("A");

      // koko() = 1
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // onkoTyhj‰() = false
      System.out.print("onkoTyhj‰() = ");
      System.out.println(pino2.onkoTyhja());

      // Tulostetaan pino.
      System.out.println(pino2);

      // lis‰‰(B)
      System.out.println("lis‰‰(B)");
      pino2.lisaa("B");

      // koko() = 2
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // Tulostetaan pino.
      System.out.println(pino2);

      // lis‰‰(C)
      System.out.println("lis‰‰(C)");
      pino2.lisaa("C");

      // koko() = 3
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // lis‰‰(D)
      System.out.println("lis‰‰(D)");
      pino2.lisaa("D");

      // koko() = 4
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // Tulostetaan pino.
      System.out.println(pino2);

      // lis‰‰(E)
      System.out.println("lis‰‰(E)");
      pino2.lisaa("E");

      // Pino t‰ynn‰: koko() = 5
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // Tulostetaan pino.
      System.out.println(pino2);

      // poista() = E
      System.out.print("poista() = ");
      System.out.println(pino2.poista());

      // koko() = 4
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // ylin() = D
      System.out.print("ylin() = ");
      System.out.println(pino2.ylin());

      // koko() = 4
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // Tulostetaan pino.
      System.out.println(pino2);

      // poista() = D
      System.out.print("poista() = ");
      System.out.println(pino2.poista());

      // koko() = 3
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // poista() = C
      System.out.print("poista() = ");
      System.out.println(pino2.poista());

      // koko() = 2
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // poista() = B
      System.out.print("poista() = ");
      System.out.println(pino2.poista());

      // koko() = 1
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // Tulostetaan pino.
      System.out.println(pino2);

      // poista() = A
      System.out.print("poista() = ");
      System.out.println(pino2.poista());

      // Pino tyhj‰: koko() = 0
      System.out.print("koko() = ");
      System.out.println(pino2.koko());

      // onkoTyhj‰() = true
      System.out.print("onkoTyhj‰() = ");
      System.out.println(pino2.onkoTyhja());
   }
}
