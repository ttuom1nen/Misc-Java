/**
 * Oope-kurssin lopputyö.
 * Mediakirjastoa simuloiva ohjelma
 * 
 * @author Tommi Tuominen
 *  
 */
public class Oope2014HT {

    public static void main(String[] args) {

        //Luodaan mediakirjasto ja käyttöliittymä
        Mediakirjasto medkirj = new Mediakirjasto();
        Kayttoliittyma kayttis = new Kayttoliittyma(medkirj);

        //käynnistetään ohjelma
        kayttis.start();
    }    
}