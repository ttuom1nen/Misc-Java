/*
 *Harjoitus 2 Tehtävä 7
 *
 *
 *Tommi Tuominen 2014
*/

public class Istuin extends Tuoli{
    
    private String materiaali;
    private String dummy;

    public String materiaali(){
        return materiaali;
    }
    public void materiaali(String m){
        dummy = m;
        materiaali = "Puu/Kangas";
        
        if(dummy.length() >= 2){
         materiaali = m;
        }       
    }
    
    public void tiedot(){
        System.out.println(materiaali);
        
        //Kutsutaan yläluokan metodeja:
        System.out.println(super.selkanoja());
        System.out.println(super.jalkoja());        
    }
}