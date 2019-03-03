/*
*
* Olio-ohjelmoinnin perusteet
* Viikkoharjoitus 1 tehtava 2
* Tommi Tuominen 2014
* 
*/

public class Teht2 {
    
    public static void main(String[] args) {
        int taulunkoko = 3;
        int luku1 = 0;
        String sisalto = "";
        int[][] numArray = new int[taulunkoko][taulunkoko];
      
        //Taytetaan Array
        //Luodaan taulukkomuotoinen String-muuttuja
        for(int i = 0; i<taulunkoko;  i++){
            for(int k = 0; k<taulunkoko;  k++){
                luku1++;
                numArray[i][k] = luku1;
                
                if(luku1<10){
                    sisalto += "|"+numArray[i][k]+"| ";        
                }else{
                    sisalto += "|"+numArray[i][k]+"|";
                }
            }
         sisalto += "\n";
        }
        System.out.println(sisalto);
        
        //Alustetaan sisalto
        sisalto = "";
        
        //Ilmoitetaan lävistäjät
        //Täytetään sisalto-String uusilla arvoilla
        for(int i = 0; i<taulunkoko;  i++){
            for(int k = 0; k<taulunkoko;  k++){

                //Jos i=k on kyse päähalkaisijasta.
                //Jos i+(k+1) == arrayn pituus on kyse toisesta halkaisijasta.
                if(i==k || i+(k+1) == numArray.length){
                    //Testataan onko kyseinen numero yli vai alle 10.
                    //Jos on, niin se muotoillaan erilaiseen esitysmuotoon.
                    if(numArray[i][k]<10){
                        sisalto += "|"+numArray[i][k]+"| ";
                    }else{
                        sisalto += "|"+numArray[i][k]+"|";
                    }
                }else{
                    if(numArray[i][k]<10){
                        sisalto += "    ";
                    }else{
                        sisalto += "    "; 
                    }
                }

            }
         sisalto += "\n";           
        }
        
        //Tulostetaan luvut esitysmuodossa:
        System.out.println(sisalto); 
 
        System.out.println("Tulos: "+laskesumma(numArray));       
    }
    
    public static Long laskesumma(int[][] numTable){
        long tulos = 0;
        int summa1 = 0;
        int summa2 = 0;
    
       //Lasketaan lavistajien numerot yhteen
       for(int i=0; i<numTable.length; i++){
            for(int k=0; k<numTable.length; k++){
                if(i==k){
                   summa1 += numTable[i][k]; 
                }
                if(i+(k+1) == numTable.length){
                    summa2 += numTable[i][k];
                }
            }
        }      
        //Tulostetaan summat
        System.out.println("Summa1: "+summa1+" Summa2: "+summa2);
        
        //Testataan summien suuruudet toisiinsa nähden.
        //Jos sivut ovat yhtä pitkiä, pitäisi tuloksen olla aina 0
        if(summa1 == summa2){
            tulos = 0;
        }else if(summa1 > summa2){
            tulos = 1;
        }else if(summa1 < summa2){
            tulos = 2;
        }
        
        return tulos;
    }  
}
