/**
 * Ääni-tyyppisen median luokka.
 * @author Tommi Tuominen
 */
public class Aani extends Media {
    
    /**
     * Aanitiedoston kesto minuuteissa.
     */
    private int kesto;
    
    public Aani(){
        super.nimi("unnamed");        
        kesto = 0;     
    }
    public Aani(int kest, String n){
        super.nimi(n);
        kesto = kest;
    }
    
    public void kesto(int k){
        kesto = k;
    }
    
    public int kesto(){
        return kesto;
    }
     
    /**
     * korvattu toString()-metodi
     * palauttaa yliluokan mediaInfon tiedot.
     * @return muodostettu String
     */
    public String toString() {
        String kestaa = String.valueOf(kesto);
        return super.toString()+"|"+super.lisaaValit(kestaa.length(), 8, kestaa)+"|";
    }
    
    /**
     * Medioiden nimien vertailussa käytettävä metodi
     * 
     * @param obj
     * @return vertailun tulos
     */
    public boolean equals(Object obj){      
        return super.equals(obj);
    }    
}
