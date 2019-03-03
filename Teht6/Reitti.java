/*
 *harj. 6 teht. 6
 *Tommi Tuominen 2014
*/

public class Reitti{
    
    private String tunnus;
    private int ajoaika;
    
    private Pysakki pysak;
    
    public Reitti(String t, int a){
        tunnus = t;
        ajoaika = a;
        
    }
    
    public void tunnus(String t){
        tunnus = t;
    }    
    public String tunnus(){
        return tunnus;
    }
    
    
    public void ajoaika(int a){
        ajoaika = a;
    }   
    public int ajoaika(){
        return ajoaika;    
    }
   
    public void asetapysakki(String a, int b){
        pysak = new Pysakki(a,b);
    }
    
    public String tiedot(){      
        return pysak.paikka()+"\n"+pysak.numero();
    }   
  
}