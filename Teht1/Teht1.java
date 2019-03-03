/*
*
* Olio-ohjelmoinnin perusteet
* Viikkoharjoitus 1 tehtava 1
* Tommi Tuominen 2014
* 
*/

public class Teht1 {
    
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String merkkijono;
        String uinput;
        int luku1 = 0;
        int luku2 = 3;
        int pituus;

  
    //Tulostetaan valmis merkkijono
    System.out.println("Uusi merkkijono: "+merkkienpoisto(merkkijono,luku1,luku2));
    System.out.println("");

    }  
     
    public static String merkkienpoisto(String teksti, int num1, int num2){
        //Luodaan substringillä uusi merkkijono
        String uusimerkkijono = teksti.substring(0,num1)+""+teksti.substring(num2+1,teksti.length());
        return uusimerkkijono;
    }

    public static boolean isNumeric(String str){
      try{
        double d = Double.parseDouble(str);       
      }catch(NumberFormatException nfe){
        return false;
      }
      return true;
    }   
}