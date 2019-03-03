/*
 *Harjoitus 2 Tehtävä 3/7
 *
 *
 *Tommi Tuominen 2014
*/

public class Tuoli{
    
    private int jalkoja;
    private boolean selkanoja;
    
    
    public Tuoli(){
        jalkoja = 4;
        selkanoja = true;
    }
    
    public Tuoli(int j, boolean s){
        if(j >= 0){
         jalkoja = j;
         selkanoja = s;
        }       
    }

//------

    public int jalkoja(){
        return jalkoja;
    }
    public void jalkoja(int jalklkm){
        if(jalklkm >= 0){
         jalkoja = jalklkm;
        }       
    }
  
    public boolean selkanoja(){
        return selkanoja;
    }
    public void selkanoja(boolean selk){
        selkanoja = selk;
    }    
    
}