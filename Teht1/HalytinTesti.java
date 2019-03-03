/*
*Harjoitus 1 tehtävä 7
*HalytinTesti
*
*Tommi Tuominen
*/
import java.util.Scanner;

public class HalytinTesti{
	public static void main(String[] args){
            Scanner user_input = new Scanner(System.in);
            String uinput = "";
            int keycode = 0;
            int newcode = 0;
            int menuIndex = 0;
            
            //Esitellään viite, luodaan olio
            //ja liitetään viite olioon
            Halytin alarm = new Halytin();
	    
            //Ohjelman pääsilmukka.
            //Kolmen virheellisen syöttökerran jälkeen
            //käyttäjä heitetään pihalle järjestelmästä.
            mainloop:                
            while(alarm.virheita()<3){
                
                System.out.println("Syota koodi: ");
                uinput = user_input.next();
                keycode = Integer.parseInt(uinput);
                
                if(alarm.koodiOikein(keycode)){
                    
                  while(alarm.virheita()<3){
                    System.out.println("---------------------");
                    System.out.println("Vaihda koodi   (1): ");               
                    System.out.println("Lopeta Halytys (2): ");
                    System.out.println("Diagnosoi      (3): ");
                    System.out.println("Testaa Halytys (4): ");
                    System.out.println("Lopeta         (0): ");
                    System.out.println("---------------------");                    
                    uinput = user_input.next();

                    menuIndex = Integer.parseInt(uinput);
                
		//Valikon toiminta
                    if(menuIndex == 1){
                        System.out.println("Syota vanha koodi:");
                        keycode = Integer.parseInt(user_input.next());
                        
                        if(alarm.koodiOikein(keycode)){
                            System.out.println("Syota uusi koodi:");
                            newcode = Integer.parseInt(user_input.next());
                            alarm.vaihdaKoodi(keycode,newcode);
                            System.out.println("Koodi vaihdettu");
                        }else{
			    alarm.virheita(1);
                            System.out.println("Vaara koodi!");
                        }              
                    }else if(menuIndex == 2){
                        System.out.println("Syota koodi:");
                        keycode = Integer.parseInt(user_input.next());        
                        alarm.pysaytaHalytys(keycode);
                    }else if(menuIndex == 3){
                        alarm.diagnosoi();      
                    }else if(menuIndex == 4){
                        alarm.halyttaa(true);
                        System.out.println("Halytys aktivoitu!");
                    }else if(menuIndex == 0){
                        break mainloop;
                    }                         
                  }              
                }else{
                    alarm.virheita(1);
                }
            }	
	}

}                    