


public class VariAla extends Vari {
    
    private int red;
    private int green;
    private int blue;
    
    public VariAla(){
        red = 128;
        green = 128;
        blue = 128;
    }
    
    public VariAla(int r, int g, int b)throws IllegalArgumentException{
        if(r < 0 || g < 0 || b < 0 || r > 255 || g > 255 || b > 255){
            throw new IllegalArgumentException("Virheellisia arvoja!");
        }else{
            red = r;
            green = g;
            blue = b;    
        }
    }


    public void Vari sekoita(Vari v) throws IllegalArgumentException{
    
        
    }
    
    public void Vari vastavarita(){
    
    }
    
}