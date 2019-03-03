/*
*Harj 3 Teht. 7
*
*Tommi Tuominen 2014
*
**/

public class Sormus implements Maaginen{
    private int lapimitta;
    
    public Sormus(int l){
        lapimitta(l);
    }
    
    public int lapimitta(){
        return lapimitta;
    }
    public void lapimitta(int l){
        if(l > 5){
            lapimitta = l;
        }        
    }

    public void hohtaa(){
        System.out.println("Sormus hohtaa sinista valoa!");
    }
    public void kayta(){
        System.out.println("Sormuksen kaytto vaatii harjoittelua...");
    }    
}