/**
 * Video-median luokka.
 * @author Tommi Tuominen
 */
public class Video extends Media {
    
    /**
     * Videon tyylilaji
     */
    private String tyylilaji;
    
    public Video(){
        super.nimi("unnamed");        
        tyylilaji = "";     
    }
    public Video(String tyyli, String n){
        super.nimi(n);        
        tyylilaji = tyyli;
    }
    
    public void tyylilaji(String t){
        tyylilaji = t;
    }
    
    public String tyylilaji(){
        return tyylilaji;
    }

    /**
     * korvattu toString()-metodi
     * palauttaa yliluokan mediaInfon tiedot.
     * @return muodostettu String
     */     
    public String toString() {
        return super.toString()+"|"+super.lisaaValit(tyylilaji.length(), 8, tyylilaji)+"|";
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