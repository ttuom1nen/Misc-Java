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
            if(n != null && t != null && d >= 0){
                wepname = n;
                type = t;
                dmg = d;
                dex = x;             
            }
        }        

//Randomoidun aseen luominen ja metodien kuormittaminen.
        public randomwep(){
            wepname = "Basic Sword";
            type = 0;
            weptype = "Sword";
            dmg = (int)(Math.random()*10);
            dex = (int)(Math.random()*5);            
        }

        public randomwep(String n, int maxdmg, int maxdex){
            if(n != null && t != null && d >= 0){
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
        public int dmg(){
            return dmg;
        }
        public int dex(){
            return dex;
        }
        
//P‰‰tet‰‰n aseen tyyppi        
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
        
        public void viewWeapon(){
            System.out.print("Tyyppi: "+weptype);
            System.out.print(" Dmg: "+dmg);
            System.out.print(" Dex: "+dex);
            System.out.println("---------");
        }
}