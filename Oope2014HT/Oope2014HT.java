/**
 * Oope-kurssin lopputy�.
 * Mediakirjastoa simuloiva ohjelma
 * 
 * @author Tommi Tuominen
 *  
 */
public class Oope2014HT {

    public static void main(String[] args) {

        //Luodaan mediakirjasto ja k�ytt�liittym�
        Mediakirjasto medkirj = new Mediakirjasto();
        Kayttoliittyma kayttis = new Kayttoliittyma(medkirj);

        //k�ynnistet��n ohjelma
        kayttis.start();
    }    
}