/*
*Harj 3 Teht. 6
*
*Tommi Tuominen 2014
*
**/


public class LaaksolainenTesti{
    public static void main(String[] args){
        
        Rottaolio rottis = new Rottaolio(4,"Erittain vihainen",false,true,35);
        Luupaa luu = new Luupaa(2,"Alykas ja seurallinen otus",true,true,"Tahvo");
        
        System.out.println("Rottaolio:");
        System.out.println("Kuvaus       "+rottis.kuvaus());        
        System.out.println("Jalkoja:     "+rottis.jalkoja());        
        System.out.println("Alykas?:     "+rottis.alykas());
        System.out.println("Osaa puhua?: "+rottis.osaapuhua());
        System.out.println("Hanta pituus:"+rottis.hantapituus()+"cm");
        rottis.syo();
        rottis.arsyta();
        System.out.println("--------------------------------");        
        System.out.println("Luupaa:");
        System.out.println("Kuvaus       "+luu.kuvaus());        
        System.out.println("Jalkoja:     "+luu.jalkoja());        
        System.out.println("Alykas?:     "+luu.alykas());
        System.out.println("Osaa puhua?: "+luu.osaapuhua());
        System.out.println("Nimi:        "+luu.nimi());
        luu.syo();
        luu.arsyta();
    }
}