/**
 * Kuva-tyyppisen median luokka
 * @author Tommi Tuominen 
 */
public class Kuva extends Media {
    
    /**
     * Kuvalle ominainen boolean, joka m‰‰r‰‰ onko kuva bittikartta.
     */
    private boolean bittikartta;
    
    public Kuva(){
        super.nimi("unnamed");
        bittikartta = false;     
    }
    public Kuva(boolean bit, String n){
        super.nimi(n);        
        bittikartta = bit;
    }
    
    public void bittikartta(boolean b){
        bittikartta = b;
    }
    
    public boolean bittikartta(){
        return bittikartta;
    }
    
    /**
     * korvattu toString()-metodi
     * palauttaa yliluokan mediaInfon tiedot.
     * @return muodostettu String
     */    
    public String toString() {
        String bitmap = String.valueOf(bittikartta);
        return super.toString()+"|"+super.lisaaValit(bitmap.length(), 8, bitmap)+"|";
    }
    
    /**
     * Medioiden nimien vertailussa k‰ytett‰v‰ metodi
     * 
     * @param obj
     * @return vertailun tulos
     */    
    public boolean equals(Object obj){      
        return super.equals(obj);
    }
}