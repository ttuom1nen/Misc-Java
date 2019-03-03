/*
*Harj 3 Teht. 6
*
*Tommi Tuominen 2014
*
**/

public class Luupaa extends Laaksolainen{
    
    private String nimi;
    
    public Luupaa(int j, String k, boolean a, boolean o, String n){
        super(j,k,a,o);
        nimi = n;
    }
    
    public String nimi(){
        return nimi;
    }
    public void nimi(String n){
        nimi = n;
    }   
}