/**
 * Ohjelman käyttöliittymää mallintava luokka, joka sisältää
 * mm. valikon silmukan ja käyttäjän syöttämien komentojen
 * mukaisen toiminnan.
 * 
 * @author Tommi Tuominen
 * 
 */
public class Kayttoliittyma{

    private final Mediakirjasto medkirj;
    private int paramb;
    
    
    public Kayttoliittyma(Mediakirjasto o){  
        medkirj = o;
    }
    
    /**
     * Tehdään käyttöliittymän otsikko
     * @param o otsikko, joka ympäröidään *-merkeillä
     */
    public void teeOtsikko(String o){
       String otsikko = o;

       for(int i=0;i<otsikko.length()+4;i++){
           System.out.print("*");
       }

       System.out.print("\n");
       System.out.print("* "+otsikko+" *\n");

       for(int i=0;i<otsikko.length()+4;i++){
           System.out.print("*");
       }        
       System.out.print("\n");
    }

    /**
     * start-metodi käynnistää ohjelman valikkosilmukan, jossa
     * kysytään käyttäjältä komentoja. Silmukan suorittaminen
     * päättyy komennolla lopeta. Muut komennot lähetetään komento()
     * metodille. 
     */
    public void start(){
        
        medkirj.lataa();
        
        teeOtsikko("SOITTOLISTA");
        String inputString = "";
        
        while(true){
            System.out.println("Kirjoita komento:");
            inputString = In.readString();

            if(inputString.equals("lopeta")){
                System.out.println("Ohjelma lopetettu.");
                break;
            }else{
                try{
                    komento(inputString);
                }catch (NumberFormatException e){
                    medkirj.Virhe();
                }catch (IllegalArgumentException e){
                    medkirj.Virhe();
                }catch (NullPointerException e){
                    medkirj.Virhe();
                }
            }
        }
    }

    /**
     * komento-metodissa käsitellään käyttäjän syöttämä komento ja
     * toimitaan sen mukaisesti.
     * 
     * @param cmd käyttäjän syöttämä komento.
     * @throws NumberFormatException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void komento(String cmd)throws NumberFormatException, IllegalArgumentException, NullPointerException{
        
        //Testataan onko komento jokin ohjelman parametrittomista komennoista
        if(cmd.equals("lataa")) {
            medkirj.lataa();
        }else if(cmd.equals("kirjasto")){
            medkirj.naytaLista(false);
        }else if(cmd.equals("soittolista")){
            medkirj.naytaLista(true);
        }else if(cmd.equals("tayta")){
            medkirj.tayta();
        }
        else if(cmd.equals("tallenna")){
            medkirj.tallenna();
        }
        
        //Jos komentoa ei tunnisteta yhdeksikään yllä olevista
        else{
            
            //Erotetaan parametri itse komennosta
            String[] osaset = cmd.split("\\s+");
            
            //Jos osaset-arrayn pituudeksi tuli 2,
            //voi kyseessä olla parametrillinen komento           
            if(osaset.length == 2){
                
                //Testataan, onko komennon parametri numeraalinen
                //ja ettei kyseessä ole string-muotoisen parametrin tarvitseva
                //lajittele komento.
                if(isInteger(osaset[1]) && !osaset[0].equals("lajittele")){
                    paramb = Integer.parseInt(osaset[1]);
                    if(osaset[0].equals("poista")){
                        medkirj.poista(paramb);    
                    }else if(osaset[0].equals("lisaa")){
                        medkirj.lisaa(paramb);            
                    }else if(osaset[0].equals("luo")){
                        medkirj.luoUusi(paramb);    
                    }else{
                        medkirj.Virhe();
                    }
                
                //Testataan onko kyseessä lajittelu ja sen parametrit.
                }else if(osaset[0].equals("lajittele") && osaset[1].equals("nouseva") ||  osaset[1].equals("laskeva")){
                    medkirj.lajittele(osaset[1]);
                }else{
                    medkirj.Virhe();
                }
            }else{
                medkirj.Virhe();
            }
        }
    }
    
    /**
     * Testataan onko String numeraalinen vai ei
     * @param s tarkastettava merkkijono
     * @return true jos on numero - false jos ei
     */
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
    
}