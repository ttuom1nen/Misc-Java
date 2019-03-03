/*
*Harj 3 Teht. 7
*
*Tommi Tuominen 2014
*
**/

public class SormusTesti{
    public static void main(String[] args){
    
    Sormus ring = new Sormus(20);
    
    System.out.println("Lapimitta: "+ring.lapimitta());
    ring.hohtaa();
    ring.kayta();
    }
}