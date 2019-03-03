/*
*Harjoitus 1 tehtava 8
*GameMain
*
*Tommi Tuominen 2014
*/
/*
Suht. simppeli peliaiheinen luokkakokeilu. GameHero ja GameMonster -luokat periytyvät
GameChar-luokasta. GameHero-luokka on ainakin vielä aika turha, mutta ehkä keksin sinne jotain.

'Peli' arpoo pelaajan hahmolle sattumanvaraiset kykyarvot. Pelaaja voi halutessaan arpoa arvot uudestaan.
Hahmonluonnin jälkeen tulee viholliskohtaaminen. Viholliselle arvotaan myös kykyarvot.
Viholliskohtaamisessa pelaaja voi valita hyökkääkö, juokseeko karkuun vai tarkkaileeko vihollista.
Tarkkailu näyttää vihollisen tiedot. Hyökkäyksessä huomioidaan pelaajan hahmon voima, näppäryys ja taito, sekä
vihollisen puolustus.

Hyökkäyksen ja karkuun pääsemisen yhteydessä käytettävää onnistumisprosenttia en ole vielä onnistunut
toteuttamaan.
Vihollisen dead/alive -tarkistus puuttuu vielä kokonaan.
*/
import java.util.Scanner;

public class GameMain{
	public static void main(String[] args){
            Scanner user_input = new Scanner(System.in);
            String uinput;
            int numinput;
            int randoms = 2;
            
            GameHero hero = new GameHero();
            GameMonster monster = new GameMonster();
	    GameWeapon randwep = new GameWeapon();
	    
	    //Testasin vihollisen luomista constructorilla, mutta päätin että
	    //tässä tapauksessa get ja set ehkä selvempi
            //GameMonster monster = new GameMonster("Orkki", 0,"testi",3,3,3,3,3,3);       
            
            System.out.print("Hahmon nimi:");
            uinput = user_input.next();
            
            hero.name(uinput);
            
            //Luodaan pelaajan hahmo.
            //Randomointikertoja on 3
            while(randoms >= 0){
                hero.health((int) (Math.random()*100));
                hero.str((int) (Math.random()*30));
                hero.def((int) (Math.random()*30));
                hero.mana((int) (Math.random()*30));
                hero.dex((int) (Math.random()*30));
                hero.skill_sword((int) (Math.random()*10));
                hero.skill_bow((int) (Math.random()*10));
                hero.skill_magic((int) (Math.random()*10));
		hero.desc("");
                hero.charSheet();
                
		randwep.randomwep("Mahtiase", 5, 5);
		randwep.viewWeapon();
		
		//Pelaaja paattaa hyvaksyyko hahmon vai randomoidaanko uudestaan.     
                System.out.println("Arvotaanko uudestaan? Y/N? Kertoja jaljella: "+randoms);
                uinput = user_input.next();
                
                if(uinput.equals("y") || uinput.equals("Y")){
                    uinput = "";
                    randoms--;
                }else{
                    System.out.println("Hahmo luotu onnistuneesti!");
                    break;
                }
            }
	    
	    
            //Luodaan testivihollinen ja kohtaaminen
            makeMonster(monster, "Orkki", "Aika heikon nakoinen orkki", 25, 1);
            encounter(monster, randwep, user_input, hero);
	}
    //Vihollisen luontiin käytettävä metodi
    public static void makeMonster(GameMonster mon, String name, String desc, int random, int type){
		mon.type(type);
		mon.name(name);
		mon.desc(desc);
		mon.health((int) (Math.random()*random));
		mon.str((int) (Math.random()*random));
		mon.def((int) (Math.random()*random));
		mon.mana((int) (Math.random()*random));
		mon.dex((int) (Math.random()*random));
		mon.skill_magic((int) (Math.random()*50));
    }
    
    //Viholliskohtaamisen logiikkaa käsittelevä metodi
    public static void encounter(GameMonster mon, GameWeapon randwep, Scanner scan, GameHero player){
            String uinput;
            int numinput;
            int dmg;
            int percent;

                System.out.println("");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");            
                System.out.println("Kohtasit vihollisen!");
                percent = calcPercent(player.dex(), mon.dex());
                
                while(true){                   
                    System.out.println("1)Taistele 2)Juokse karkuun("+percent+"%) 3)Tarkkaile");
                    uinput = scan.next();
                    numinput = Integer.parseInt(uinput);

                    if(numinput == 1){
                        fight(mon, randwep, scan, player);
                    }else if(numinput == 2){
                       
                        if(chance(percent,mon.dex())){
                            System.out.println("Paasit karkuun!");
                            break;
                        }else{
                            dmg = (int)(((Math.random()*20)*mon.str())/player.def());
                            System.out.println("Paasit karkuun, mutta menetit "+dmg+" healthia!");
                            mon.health(dmg*-1);
                            System.out.println("Jaljella: "+player.health());
                            break;
                        }

                    }else{
                        mon.charSheet();
                    }
                }
    }
    
    //Tässä metodissa olisi tarkoitus laskea onnistumisprosentin mukainen lopputulos,
    //mutta en ole keksinyt järkevää tapaa toteuttaa kyseistä.
    public static boolean chance(int value1, int value2){
        int random;
        
        random = (int)(Math.random()* value2);
        
        if(random%value1 <= value1){
            return true;
        }else{
            return false;
        }
    }

    //Taistelussa käytettävät toiminnot
    public static void fight(GameMonster mon, GameWeapon randwep, Scanner scan, GameHero player){
                String uinput;
                int numinput;
                int damage = 0;
                int damagedealt = 0;
                
                System.out.println("---------------------");
                System.out.println("Valitse ase: 0)Nyrkit("+calcPercent(player.dex(), mon.dex())+"%) 1)"+randwep.wepname()+" 9)Peruuta");
                uinput = scan.next();
                numinput = Integer.parseInt(uinput);
                
                if(numinput == 0){
                    damage = ((int)(Math.random()*player.str())+10)+player.dex();
                    damagedealt = damage-(mon.def()+mon.dex());
                    onHit(mon, damagedealt);              

                }else if(numinput == 1){
			damage = randwep.useWeapon(player.str(), player.dex(), player.getSkill(randwep.type()), randwep.dmg(), randwep.dex());
			damagedealt = damage-(mon.def()+mon.dex());
			onHit(mon, damagedealt);			
                }
                else if(numinput == 9){
                    
                }else{
                    
                }
    }
	//Jos hyökkäys osuu
	public static void onHit(GameMonster mon, int dmgdealt){
		if(dmgdealt > 0){
		    mon.health(dmgdealt*-1);
		    System.out.println("Iskit viholliseen "+dmgdealt+" vahinkoa!");
		    System.out.println("Vihollisella on "+mon.health()+" hp jaljella.");
		}else{
		System.out.println("Hyokkayksesi ei tehnyt yhtaan vahinkoa!");
		}
	}
	
    //Prosentin lasku ei ihan worki halutulla tavalla.....
    public static int calcPercent(int value1, int value2){
		int percent = 0;
		int dummy;
       // int reminder = Math.abs(value1-value2);
		
		if(value1 > 0 && value2 > 0){
			if(value1 > value2){
				dummy = (int)(value1-value2 / value1);
				percent = (int)(dummy*100);
			}else{
				dummy = (int)(value2-value1 / value2);
				percent = (int)(dummy*100);			
				//i. (a - b) / a [45 - 12] / 45 = 0.733...
				//ii. Ans (i) x 100 [0.733 x 100] 
			}
			
		}
		if(percent > 100){
			percent = 100;
		}else if(percent == 0){
			percent = 1;
		}

        return percent;
    }    
}