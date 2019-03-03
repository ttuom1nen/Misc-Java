/*
 *harj. 6 teht. 6
 *Tommi Tuominen 2014
*/

public class Pysakki{
    
    private String paikka;
    private int numero;
    
    public Pysakki(String p, int n){
        paikka = p;
        numero = n;
    }
    
    public void paikka(String p){
        paikka = p;
    }     
    public void numero(int n){
        numero = n;
    }
    
    public String paikka(){
        return paikka;
    }
    public int numero(){
        return numero;
    }
    
}