/**
 * Kirjaston ja soittolistan luokka.
 * Luokka on peritty OmaLista luokasta.
 * 
 * @author Tommi Tuominen
 */
public class MediaLista extends OmaLista {
    private int maxKoko;
    
    public MediaLista(){
    }
    
    public MediaLista(int m){
        maxKoko(m);
    }
    
    public void maxKoko(int m){
        maxKoko = m;
    }

    public int maxKoko(){
        return maxKoko;
    }

    /**
     * Korvattu toString()-metodi
     * Palauttaa listan merkkijonoesityksen.
     * @return muodostettu teksti
     */
    public String toString(){
        String teksti = "";
        String ii = "";

        //Haetaan listan jokaisen median merkkijonoesitys
        for(int i=0; i<koko(); i++){
            Media obj = (Media)alkio(i);
            
            //Muutetaan kokonaisluku i Stringiksi jotta saadaan pituus.
            ii = Integer.toString(i);
            
            //kutsutaan objektin lisaaValit metodia
            teksti += obj.lisaaValit(ii.length(), 3, ii)+"|";
            
            //Lisätään objektin merkkijonoesitys
            teksti += obj.toString();
            
            //Lisätään rivinvaihto jos ei viimeinen alkio
            if(koko() > 0 && i < koko()-1){
                teksti += "\n";
            }
         }
        
        //Palautetaan esitysmuotoinen String
        return teksti;
    }
}