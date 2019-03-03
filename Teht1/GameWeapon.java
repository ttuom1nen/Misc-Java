/*
*Harjoitus 1 tehtava 8
*GameWeapon
*Aseluokka
*Tommi Tuominen 2014
*/

public class GameWeapon{
        private String wepname;
        private int type;
        private int dmg;
        private int dex;

        private String weptype;
 
 
//Rakentajat       
        public GameWeapon(){
            wepname = "";
            dmg = 1;
            dex = 1;           
        }
        public GameWeapon(String n, int t, int d, int x){
            if(n != null && t >= 0 && d >= 0 && x >= -20){
                wepname = n;
                type = t;
                dmg = d;
                dex = x;             
            }
        }        

//Randomoidun aseen luominen ja metodien kuormittaminen.
        public void randomwep(){
            wepname = "Basic Sword";
            type = 0;
            weptype = "Sword";
            dmg = (int)(Math.random()*10);
            dex = (int)(Math.random()*5);            
        }

        public void randomwep(String n, int maxdmg, int maxdex){
            if(n != null && maxdmg >= 0 && maxdex >= -20){
                wepname = n;
                type = (int)(Math.random()*2);
                weptype = weaponType(type);
                dmg = (int)(Math.random()*maxdmg);
                dex = (int)(Math.random()*maxdex);
            }
        }
            
//Aksessorit      
        public String wepname(){
            return wepname;
        }
        public String weptype(){
            return weptype;
        }
        public int type(){
            return type;
        }
        public int dmg(){
            return dmg;
        }
        public int dex(){
            return dex;
        }
        
//Päätetään aseen tyyppi        
        public String weaponType(int wept){
        
            if(wept == 0){
                weptype = "Sword";
            }else if(wept == 1){
                weptype = "Bow";
            }else{
                weptype = "Magic"; 
            }
        
        return weptype;
        }

//Aseen tarkastelu       
        public void viewWeapon(){
            System.out.println("----WEAPONS-----");
            System.out.print(wepname+"("+weptype+")");
            System.out.print(" Dmg: "+dmg);
            System.out.println(" Dex: "+dex);
            System.out.println("----------------");
        }
        
//Aseen käyttö
        public int useWeapon(int usrstr, int usrdex, int usrskill, int wepdmg, int wepdex){
                int finaldmg = 0;
                
                finaldmg = (usrstr + wepdmg + usrdex + wepdex)+((int)(Math.random()*usrskill));
                
                return finaldmg;                
        }
        
           // Korvataan toString ja equals
     
   public String toString() {
      return super.toString() + 
      ""+wepname+""+type+""+dmg+""+dex+""+weptype;
   }

   public boolean equals(Object obj) {
    GameWeapon gw = (GameWeapon)obj;
      try {     
        return (type == gw.type() && dmg == gw.dmg() && dex == gw.dex());
      }
      catch (Exception e) {
         return false;
      }
   } 
}