/*
*
*Oope Teht 4 harj. 4
*
*Tommi Tuominen 2014
*/


public class IllegalArguments {
    
    public static void main(String[] args) {
        int[] taulu1 = {1,2,3,4};
        int[] taulu2 = {5,6,7,8};       
        int indeksi = 2;

	try{		
	    suoritus(taulu1,taulu2,indeksi);		    
        } catch(IllegalArgumentException ex) {
	    System.out.println("IllegalArgumentException "+ex); 
        }
    }

    
    public static void suoritus(int[] taulu1, int[] taulu2, int indeksi) throws IllegalArgumentException{
			
	if(taulu1 == null || taulu2 == null){
            throw new IllegalArgumentException("Null-arvo ei sallittu!!!");		
	}
        else if(taulu1.length != taulu2.length){
            throw new IllegalArgumentException("Taulut eri pituiset!");
        }
        else if(indeksi < 0 || indeksi > taulu1.length){
            throw new IllegalArgumentException("Indeksin arvo virheellinen!");               
        }			
        else{
	    for(int i=0;i<taulu2.length;i++){
		if(i>=indeksi){
		    taulu2[i] = taulu1[i];
		}
	    }
	}
        
        naytaArrayt(taulu1, taulu2);

    }
    
    public static void naytaArrayt(int[] taulu1, int[] taulu2){
	for(int i=0; i<taulu1.length; i++){
	    System.out.print(taulu1[i]);       
	}
	System.out.print(" ");    
	for(int i=0; i<taulu2.length; i++){
	    System.out.print(taulu2[i]);       
	}    
    }


   
}