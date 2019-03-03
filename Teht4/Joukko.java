/*
*teht. 6
*Joukko-luokka
*Tommi Tuominen 2014
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Joukko{

    //Arrayhyn ei voi lisätä alkiota, joten tehtävässä kai haluttiin
    //ArrayList???
    private static ArrayList<Integer> taulu = new ArrayList<>(5);
    
    public Joukko(int[] t)throws IllegalArgumentException{
        
	if(t == null){
	 throw new NullPointerException("\n\nTaulu ei saa olla Null!!\n");
	}
	//Testataan onko taulussa samoja numeroita
	else if(tarkista(t) == false){
	 throw new IllegalArgumentException("\n\nSama arvo ei saa olla moneen kertaan!!!\n");              
	}
	//Jos kaikki kunnossa, niin suoritetaan:
	else{
	    //Luodaan parametrina saadun taulun kokoinen taulu,
	    //jonka tarkoitusta en ymmärrä, mutta tehtävässä niin vaaditaan.
	    int[] taulukko = new int[t.length];
	    
	    //kopioidaan parametrina saadun taulun arvot uuteen tauluun:
	    System.arraycopy(t,0,taulukko,0,t.length);
    
	    //Asetetaan attribuuttitaulun arvot vastaamaan uuden taulun arvoja:
	    for (int i=0; i<taulukko.length; i++){
	     taulu.add(taulukko[i]);
	    }
	}
    }

    //Tarkistetaan onko taulussa samoja lukuja:
    public static boolean tarkista(int[] t){
        
        int dummy = 0;       
        for(int i=0; i<t.length; i++){
            
            for(int k=0; k<dummy; k++){         
               if(t[k] == t[dummy]){
                return false;
               }
            }
        
        dummy++;
        }

    return true;
    }
    
    //Tarkistetaan onko taulussa jo luku jota yritetaan lisata:
    public static boolean tarkista(int luku){
        
        int dummy = 0;
        for(int i=0; i<taulu.size(); i++){
            
	    for(int k=0; k<dummy; k++){    
	       if(taulu.get(k) == luku){
		return false;
	       }
	    }
        
        dummy++;
        }

    return true;
    }    
  
    //Yritetaan lisata tauluun arvo. Jos luku on jo taulussa heitetaan exceptioni.
    public static void lisaaArvo(int a)throws IllegalArgumentException{
	if(tarkista(a)){
	 taulu.add(a);       
	}else{
	 throw new IllegalArgumentException("\n\n\nLuku jota yritat lisata on jo taulussa!!\n\n");
	}
    }

    public static int joukonKoko(){
        return taulu.size();
    }
    
    public static void tulosta(){
        for(int i=0;i<taulu.size();i++){
            System.out.print(taulu.get(i));
        }
    }

}