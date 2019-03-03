/**
 * Medioiden yliluokka.
 * Medioiden yhteinen attribuutti nimi.
 * @author Tommi Tuominen
 */
public abstract class Media implements Comparable<Media> {
    protected String nimi;
    
    public Media(){
        nimi = "unnamed";
    }

    public Media(String n){
        nimi(n);
    }

    public void nimi(String n){
        if(n.length() >= 1 && n.length() <= 30){
            nimi = n;
        }
    }

    public String nimi(){
        return nimi;
    }

    /**
     * Esitysmuodon tekemisessä käytettävä metodi.
     * @param pituus merkkijonon pituus
     * @param maara lisättävien välien määrä
     * @param teksti medialle ominainen teksti
     * @return palauttaa muodostetun merkkijonon
     */
    public String lisaaValit(int pituus, int maara, String teksti){
        
        //Asetetaan muuttujan arvoksi parametrina tuotu String
        String valit = teksti;

        //Lisätään välilyöntejä riippuen halutuista arvoista
        for(int i=pituus;i<maara;i++){
         valit += " ";
        }
        
        //Palautetaan valmis String
        return valit;
    }

    /**
     * Median informaation esitysmuodossa palauttava metodi.
     * @return palauttaa muodostetun merkkijonon
     */
    public String toString() {
         String teksti = "";
         
         //Käytetään median tyyppinä luokan nimeä
         String luoknimi = getClass().getSimpleName();

         //Muodostetaan näytettävä teksti hyödyntäen lisaaValit metodia
         teksti += lisaaValit(luoknimi.length(),8,luoknimi);
         teksti += "|"+lisaaValit(nimi.length(),30,nimi());    

         //palautetaan muodostettu teksti
         return teksti;
    }

    /**
     * Medioiden nimien vertailussa kätettävä metodi
     * @param obj verrattava objekti
     * @return palauttaa muodostetun merkkijonon
     */
    public boolean equals(Object obj) {
        
          //Tehdään objektista media tyyppinen
          Media e = (Media)obj;
          
          //palautetaan true jos nimet täsmäävät
          return (nimi().equals(e.nimi()));
    }

    /**
     * Lajittelussa käytettävä metodi
     * @param g verrattava media
     * @return vertailun tulos
     */
    public int compareTo(Media g){
        
        //Palautetaan vertailun tulos
        return nimi().compareToIgnoreCase(g.nimi());
    }
}