/*
*Harj 3 Teht. 6
*
*Tommi Tuominen 2014
*
**/

public class Rottaolio extends Laaksolainen{
    
    private int hantapituus;
    
    public Rottaolio(int j, String k, boolean a, boolean o, int h){
        super(j,k,a,o);
        hantapituus = h;
    }

    public int hantapituus(){
        return hantapituus;
    }
    public void hantapituus(int h){
        if(h >= 0){
            hantapituus = h;
        }
    }    
}