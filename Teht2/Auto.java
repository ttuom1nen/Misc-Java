/*
 *Harjoitus 2 Tehtävä 5
 *
 *
 *Tommi Tuominen 2014
*/

public class Auto{
    
    private double tehokw;
    private int valmnum;
    static int laskuri;
   
    public Auto(){
        tehokw = 60;
        laskuri++;
        valmnum = laskuri;
    }

    public int valmnum(){
        return valmnum;
    }
    
    public int laskuri(){
        return laskuri;
    }

    public double tehokw(){
        return tehokw;
    }
    public void tehokw(double t){
        if(t > 0){
         tehokw = t;
        }       
    }
    
}