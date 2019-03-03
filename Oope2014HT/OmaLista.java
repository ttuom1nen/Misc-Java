import fi.uta.csjola.oope.lista.LinkitettyLista;

/**
 * Luokka on peritty LinkitettyLista-luokasta.
 * T‰ss‰ luokassa listojen muokkaamisessa k‰ytett‰v‰t metodit.
 * @author Tommi Tuominen
 */
public class OmaLista extends LinkitettyLista {
    
    private LinkitettyLista lista;

    public OmaLista() {
     lista = new LinkitettyLista();
    }

    /**
     * Objektin lis‰ys.
     * K‰ytet‰‰n yliluokan lisaaLoppuun()-metodia.
     * @param o lis‰tt‰v‰ objekti
     */
    public void lisaa(Object o) {
       lista.lisaaLoppuun(o);
    }

    /**
     * Poistaa listan alusta.
     * K‰ytt‰‰ yliluokan metodia.
     * @return palauttaa poistetun alkion
     */
    public Object poista() {
       return lista.poistaAlusta();
    }

    /**
     * Poistaa alkion.
     * K‰ytt‰‰ yliluokan metodia.
     * @param p poistettavan alkion numero
     * @return palauttaa poistetun alkion
     */
    public Object poista(int p) {
       return lista.poista(p);
    }

   /** {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    public Object alkio(int a){      
        return lista.alkio(a);
    }

   /** {@inheritDoc}
     *
     * @return {@inheritDoc}
     */    
    public int koko() {
       return lista.koko();
    }

   /** {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    public boolean onkoTyhja() {
       return lista.onkoTyhja();
    }

    /**
     * Tyhjent‰‰ listan.
     * Hyˆdynt‰‰ poista()-metodia.
     */
    public void tyhjenna(){
        while (!onkoTyhja()){
            poista();
        }
    }

    /**
     * Palauttaa listan ensimm‰isen alkion
     * @return palauttaa alkion
     */
    public Object ylin() {
       return lista.alkio(0);
    }
    
   /** {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    public Object korvaa(int i, Object o){
        return lista.korvaa(i, o);
    }
    
    /**
     * Kirjaston lajittelu
     * Haetaan listan alkio ja verrataan sit‰ seuraavaan alkioon
     * Alkiot muutetaan Media tyyppisiksi mahdollistaen vertailun
     * Lajittelun suunta m‰‰r‰ytyy jarjestys-booleanin mukaan
     * joko nousevaksi tai laskevaksi.
     * @param s lajittelun suunta
     */  
    public void lajittele(String s){
            //true nouseva, false laskeva
            boolean jarjestys;
       
            //mediaobjektit
            Media aa;
            Media bb;
            
            //M‰‰r‰t‰‰n haluttu j‰rjestys booleanin mukaan, jotta suunnan testaaminen
            //silmukassa olisi nopeampaa.
            if(s.equals("nouseva")){
                jarjestys = true;
            }else{
                jarjestys = false;
            }
            
            //Muuttujien alustus
            int k = 0;
            int i = 0;
            
            //Lajittelun p‰‰silmukka jota suoritetaan listan koon mukaan.
            //silmukassa asetetaan muuttuja k:n arvoksi silmukan kierros
            //ja i:n arvoksi yksi enemm‰n.
            //silmukan sis‰ll‰ on toinen silmukka jota suoritetaan muuttujan
            //i arvosta listan kokoon.
            //i on aina yhden enemm‰n kuin k t‰m‰ mahdollistaa alkioiden valinnan
            //ja vertailun.    
            for(int g=0;g<koko()-1;g++){
                
                //Muuttuja k vastaa kierrosten lkm.
                k = g;
                //Muuttuja i on aina yhden enemm‰n kuin kierros g.
                i = g + 1;
    
                //Suoritetaan arvosta i listan kokoon
                while (i<koko()){
                    //Tehd‰‰n listan alkioista Media-tyyppisi‰ objekteja
                    aa = (Media)alkio(i);
                    bb = (Media)alkio(k);
    
                    //Testataan lajittelun j‰rjestys.
                    //Verrataan media-objekteja toisiinsa compareTo-metodin avulla.
                    //Muutetaan muuttujan k arvoksi i jos vertailu on positiivinen
                    //tai negatiivinen. Jos vertailu tuottaa 0 ei toimenpiteit‰.
                    if(jarjestys){
                      //Jos vertailu palauttaa negatiivisen luvun
                      if(aa.compareTo(bb) < 0){
                        k = i;
                      }
                    }       
                    else{                  
                      //Jos vertailu palauttaa positiivisen luvun  
                      if(aa.compareTo(bb) > 0){
                        k = i;
                      }
                    }
    
                    //Muuttujan i incrementointi
                    i++;
                }
                
                //Suoritetaan korvaus.
                //Korvausmetodi palauttaa korvatun alkion, jota k‰ytet‰‰n
                //korvaamaan korvaaja.
                korvaa(g, korvaa(k, alkio(g)));
            }
        }
    
}