/*
*Harjoitus 1 tehtava 8
*GameChar
*Pääluokka
*Tommi Tuominen 2014
*/

public class GameChar{
                        
private String name;
private String desc = "";
private int lvl = 1;
private int exp = 0;
private int maxexp = 10;
private int health;
private int mana;
private int str;
private int def;
private int dex;
private int skill_sword = 0;
private int skill_bow = 0;
private int skill_magic = 0;

public String name(){
        return name;
}	
public void name(String p){
        name = p;
}
                        
//Health
public int health(){
        return health;
}	
public void health(int hp){
        health += hp;
}
//Strength
public int str(){
        return str;
}	
public void str(int h){
        str = h;
}
//Defence
public int def(){
        return def;
}	
public void def(int h){
        def = h;
}
//Mana
public int mana(){
        return mana;
}	
public void mana(int h){
        mana = h;
}         
//Dexterity
public int dex(){
        return dex;
}	
public void dex(int h){
if(h==0){
  h = h+1;
}
        dex = h;
}
//Sword skill
public int skill_sword(){
        return skill_sword;
}	
public void skill_sword(int h){
        skill_sword = h;
}        
//Bow skill
public int skill_bow(){
        return skill_bow;
}	
public void skill_bow(int h){
        skill_bow = h;
}        
//Magic skill
public int skill_magic(){
        return skill_magic;
}	
public void skill_magic(int h){
        skill_magic = h;
}
                
//Description
public String desc(){
        return desc;
}	
public void desc(String h){
        desc = h;
}

public int getSkill(int sk){
if(sk == 0){
return skill_sword;            
}else if(sk == 1){
return skill_bow;
}else{
return skill_magic;                        
}  
}
			
        public void charSheet(){
            System.out.println("~~~~"+name+"~~~~");
            System.out.println("Level:          "+lvl);         
            System.out.println("Experience:     "+exp);
            System.out.println("---------------");       
            System.out.println("Health:         "+health);
            System.out.println("Strength:       "+str);
            System.out.println("Defence:        "+def);
            System.out.println("Mana:           "+mana);
            System.out.println("Dexterity:      "+dex);
            System.out.println("---------------");
            System.out.println("Sword Skill:    "+skill_sword);
            System.out.println("Bow Skill:      "+skill_bow);
            System.out.println("Magic Skill:    "+skill_magic);
			System.out.println("---------------");
			System.out.println("Description:    ");
			System.out.println(desc);
            System.out.println("~~~~~~~~~~~~~");    
        }			
        			
	}