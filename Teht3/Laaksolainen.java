/*
*Harj 3 Teht. 6
*
*Tommi Tuominen 2014
*
**/

public class Laaksolainen{

//Laaksolaista kuvaavia muuttujia, joita voisi tietenkin olla enemmankin.
    private int jalkoja; //Kuinka monta jalkaa?
    private String kuvaus; //Yleinen kuvaus otuksesta
    private boolean alykas; //Onko otus alykas?
    private boolean osaapuhua; //Osaako puhua?
   
//Parametrillinen rakentaja.
    public Laaksolainen(int j, String k, boolean a, boolean o){
        jalkoja(j);
        kuvaus = k;
        alykas = a;
        osaapuhua = o;
    }

//Aksessorit

//Jalkojen lkm. testataan ettei luku ole negatiivinen.
//Jalaton kaarmeolio on mahdollinen.
    public int jalkoja(){
        return jalkoja;
    }
    public void jalkoja(int j){
        if(jalkoja >= 0){
            jalkoja = j;
        }
    }

//Kuvauksessa voidaan kertoa tarkempia piirteita otuksesta.
    public String kuvaus(){
        return kuvaus;
    }
    public void kuvaus(String k){
        kuvaus = k;
    }

//alykas -boolean-muuttuja kertoo onko otus alykas.
//Toki molemmat otukset ovat melko alykkaita, koska osaavat puhua.
    public boolean alykas(){
        return alykas;
    }
    public void alykas(boolean a){
        alykas = a;
    }

//Kaikki laakson otukset tuskin osaavat puhua.
//Sen varalle osaapuhua boolean.
    public boolean osaapuhua(){
        return osaapuhua;
    }
    public void osaapuhua(boolean o){
        osaapuhua = o;
    }

//Otuksen syomista kuvaava metodi.
//Ruokailutavat maaraytyvat alykkyyden mukaan.
    public void syo(){
        if(alykas){
            System.out.println("\"Syon tassa juuri perunamuusia ja lihapullia.\"");
        }else{
            System.out.println("\"nomnomnomROYH\"");
        }
    }

//Arsytetaan otusta.
//Reagointi perustuu taas otuksen alykkyyteen.
    public void arsyta(){
        if(alykas){        
            System.out.println("\"Hei ala viitti!\"");        
        }else{
            System.out.println("\"MURRSHHHRRRAY!!!\"");            
        }
    }  
}