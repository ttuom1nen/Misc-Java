/**
 * Mediakirjasto-luokassa toteutetaan k�ytt�liittym�ss� p��tetyt komennot.
 * @author Tommi Tuominen
 */
public class Mediakirjasto {
    
    private MediaLista kirjasto;
    private MediaLista soittolista;
    private Tiedosto tiedosto;
    
    /**
     * Luokan rakentajassa luodaan kirjasto ja soittolista
     * MediaLista-oliot.
     * kirjasto luodaan MediaListan parametrittomalla
     * rakentajalla ja soittolista parametrillisella.
     * Lis�ksi luodaan tiedosto-olio joka saa parametreinaan
     * kirjaston ja soittolistan.
     */
    public Mediakirjasto(){
        kirjasto = new MediaLista();
        soittolista = new MediaLista(5);
        tiedosto = new Tiedosto(kirjasto, soittolista);
    }

    /**
     * Tekstitiedostojen lataaminen.
     * Ensin tyhjennet��n molemmat listat ja sen j�lkeen
     * kutsutaan tiedosto-olion lataa()-metodia.
     */
    public void lataa(){
        tyhjennaMolemmat();
        tiedosto.lataa();
    }

    /**
     * Tekstitiedostojen tallentaminen.
     * Kutsutaan tiedosto-olion tallenna()-metodia. 
     */
    public void tallenna(){
        tiedosto.tallenna();
    }

    /**
     * Tyhjent�� molemmat listat.
     * Kutsuu MediaListan yliluokan (OmaLista)
     * tyhjenna()-metodia.
     */
    public void tyhjennaMolemmat(){
        soittolista.tyhjenna();
        kirjasto.tyhjenna();
    }
    
    /**
     * Tulostetaan halutun listan sis�lt�.
     * Sis�lt� m��ritet��n p��asiassa listan omassa toString()-metodissa.
     * @param a m��r�� onko kyseess� soittolista vai kirjasto
     */
    public void naytaLista(boolean a){
        String teksti = "";
        
        //Jos kyseess� on soittolista, niin lis�t��n koko()/maxKoko()
        if(a){
            teksti += soittolista.koko()+" / "+soittolista.maxKoko();
            if(soittolista.koko() > 0){
                teksti += "\n"+soittolista;
            }        
        }else{
            teksti += kirjasto;       
        }
        System.out.println(teksti);
    }  

    /**
     * Tayttaa listan.
     *
     */
    public void tayta(){
        int max = soittolista.maxKoko();
        int koko = soittolista.koko();
        int miinus = max-koko;        
        
        if(koko<max){

            for(int i=0; i<miinus;i++){
                lisaa(i);
            }
        }
    }

    /**
     * Soittolistaan lis��minen
     * Jokainen kirjastosta lis�tt�v� media tarkistetaan
     * tarkista()-metodissa
     * @param param lis�tt�v�n median numero.
     */
    public void lisaa(int param){
        if(tarkista(param)){
            soittolista.lisaa(kirjasto.alkio(param));
        }else{
            Virhe();
        }
    }

    /**
     * Tarkistaessa testataan onko:
     * parametri oikeellinen
     * lista jo t�ynn�
     * kyseinen media jo listalla.
     * @param param tarkistettavan median numero
     * @return true jos virheellinen - false jos ei
     */
    public boolean tarkista(int param){
        
        //Parametri oikeellinen
        if(param >= 0 && param<=kirjasto.koko()){
            
            //Lista jo t�ynn�
            if(soittolista.koko() < soittolista.maxKoko()){
                
                //Kyseinen media jo listalla
                for(int i=0; i<soittolista.koko();i++){
                    if(kirjasto.alkio(param).equals(soittolista.alkio(i))){
                        return false;
                    }
                }
            }else{return false;}
        return true;
        }else{return false;}
    }
    
    /**
     * Poistaa listalta.
     * Testataan parametrin oikeellisuus.
     * @param param poistettavan alkion numero.
     */
    public void poista(int param){
        if(param < soittolista.koko() && param >= 0){
            soittolista.poista(param);
        }else{
            Virhe();
        }   
    }

    /**
     * Luo uuden soittolista.
     * Testataan parametrin oikeellisuus.
     * @param param uuden soittolistan maksimikoko;
     */
    public void luoUusi(int param){
        if(param > 0 && param <= kirjasto.koko()){
            soittolista.tyhjenna();
            soittolista.maxKoko(param);
        }else{
            Virhe();
        }
    }
    
    /**
     * Kirjaston lajittelu.
     * Metodi kutsuu kirjasto-olion kautta kirjaston yliluokan
     * lajittelumedotia.
     * @param param m��r�� onko suunta nouseva vai laskeva
     */
    public void lajittele(String param){
        kirjasto.lajittele(param);
    }
    
    /**
     * Virheen tulostus.
     */
    public void Virhe(){
       System.out.println("Virhe!");
    }
}