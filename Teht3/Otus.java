/*
 *Harjoitus 3 Tehtävä 5
 *
 *
 *Tommi Tuominen 2014
*/

public abstract class Otus{
    
    private boolean vihainen;


    public Otus(boolean v){
        vihainen = v;
    }

    public boolean vihainen(){
        return vihainen;
    }
    public void vihainen(boolean h){
        vihainen = h;
    }
    
    public abstract void murisee(){
        murmur();
    }
}