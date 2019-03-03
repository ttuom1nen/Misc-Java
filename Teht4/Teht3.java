/*
*
* Olio-ohjelmoinnin perusteet
* Viikkoharjoitus 4 tehtava 3
* Tommi Tuominen 2014
* 
*/

public class Teht3 {
    
    public static void main(String[] args) {
        String merkkijono = "abc";
        int luku1 = 0;
        int luku2 = 1;


        System.out.println("Vanha merkkijono: "+merkkijono); 
        System.out.println("Uusi merkkijono:  "+merkkienpoisto(merkkijono,luku1,luku2)); 
        System.out.println("");

    }  
     
    public static String merkkienpoisto(String teksti, int num1, int num2){
    String uusimerkkijono = "";
       
        try{       
            if(teksti != null){
     
                if(num1 <= num2){
                    
                    if(num1 >= 0 && num2 < teksti.length()){
                        uusimerkkijono = teksti.substring(0,num1)+""+teksti.substring(num2+1,teksti.length());                
                    }else{
                        throw new IllegalArgumentException("\n\nVirheellisia arvoja!!\n");               
                    }
                    
                }else{
                    throw new IllegalArgumentException("\n\nLuku 2 oltava suurempi kuin luku 1!!\n");   
                }
                
            }else{
                throw new NullPointerException("\n\nEi saa olla Null!!\n");
            }           
           return uusimerkkijono;
        
        }catch(NullPointerException ex){
           System.out.println("NullPointerException "+ex);             
           return teksti;
        }catch(IllegalArgumentException ex){
           System.out.println("IllegalArgumentException "+ex);             
           return teksti;
        }
    }
}