import java.util.Currency;
import java.util.Scanner;

/*
 *
 * Tommi Tuominen 2014
*/

public class Valuutta {
    
    public static void main(String[] args){
        String tunnus;
        
        Scanner user_input = new Scanner(System.in);
        System.out.print("Syota valuutan tunnus:");
        tunnus = user_input.next( );

        haeKoodi(tunnus);
        //haeKoodi(null);
    }    

    public static void haeKoodi(String k){
        try{
            Currency valuutta = Currency.getInstance(k);
            System.out.println("Koodi: "+valuutta.getDisplayName());
            System.out.println("Koodi: "+valuutta.getNumericCode());
        }catch(IllegalArgumentException ex){
	    System.out.println("IllegalArgumentException\n\n "+ex);
        }catch(NullPointerException ex){
	    System.out.println("NullPointerException\n\n "+ex);
        }
     

    }
}