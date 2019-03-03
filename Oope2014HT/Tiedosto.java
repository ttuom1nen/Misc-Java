import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Tekstitiedostojen k�sittelyyn omistettu luokka, jossa hoituu
 * soittolista.txt ja kirjasto.txt lataaminen ja tallennus.
 * 
 * @author Tommi Tuominen
 */
public class Tiedosto{
    
    private MediaLista kirjasto;
    private MediaLista soittolista;
    private Mediakirjasto medkirj;
    
    /**
     * Rakentajaan tuodaan kirjasto ja soittolista MediaListat.
     * @param kirj kirjasto
     * @param soit soittolista
     */
    public Tiedosto(MediaLista kirj, MediaLista soit){
        kirjasto = kirj;
        soittolista = soit;
    }

    /**
     * Lataa()-metodi suorittaa tiedostojen lataamiseen
     * k�ytett�v�n lueTiedosto()-metodin.
     */ 
    public void lataa(){
        try {
            lueTiedosto("soittolista.txt",soittolista);
            lueTiedosto("kirjasto.txt",kirjasto);
        }catch(NullPointerException e){
            medkirj.Virhe();
        }catch(IOException e){
            medkirj.Virhe();
        }   
    }
    
    /**
     * Luetaan haluttu tiedosto ja muutetaan sen tietueet media-objekteiksi,
     * jotka lis�t��n joko kirjastoon tai soittolistalle.
     * @param tiedostonNimi tiedoston nimi
     * @param lista k�sitelt�v� lista
     * @throws NullPointerException
     * @throws IOException
     */   
    public void lueTiedosto(String tiedostonNimi, MediaLista lista)throws NullPointerException, IOException{
        File tiedosto = new File(tiedostonNimi);
        Scanner lukija = new Scanner(tiedosto);

        String readlines = "";
        int alkuarvo = 0;
        int k = 0;

        //Luetaan tiedostoa niin kauan kun l�ytyy uusi tekstirivi
        while (lukija.hasNext()){
           readlines += lukija.nextLine();
        }
 
        lukija.close();

        if(readlines.length() > 0){
            
            //Pilkotaan luetut rivit arrayhyn putkimerkin perusteella
            String[] osaset = readlines.split("\\|");
            
            //Korvataan tietueen putkimerkit ja trimmataan v�lily�nnit
            for(int i=0; i<osaset.length;i++){
                osaset[i] = osaset[i].replace("|", "");
                osaset[i] = osaset[i].trim();
            }

            if(tiedostonNimi.equals("soittolista.txt")){
                soittolista.maxKoko(Integer.parseInt(osaset[0]));
                
                //Jos kyseess� soittolista niin alkuarvoksi asetetaan 1, koska
                //varsinaisten mediatietueiden lukeminen alkaa vasta toiselta
                //rivilt�.
                alkuarvo = 1;
            }
 
            //Lis�t��n listaan arrayn arvojen mukaiset mediat.
            for(int i=alkuarvo; i<osaset.length;i++){
                
                //Joka kolmas kentt� on median tyyppi
                if(k%3==0){
                    if(osaset[i].equals("Kuva")){
                        Kuva kuva = new Kuva(Boolean.parseBoolean(osaset[i+2]), osaset[i+1]);
                        lista.lisaa(kuva);
                    }
                    else if(osaset[i].equals("Video")){
                        Video video = new Video(osaset[i+2],osaset[i+1]);
                        lista.lisaa(video);
                    }
                    else if(osaset[i].equals("Aani")){
                        Aani aani = new Aani(Integer.parseInt(osaset[i+2]),osaset[i+1]);
                        lista.lisaa(aani);
                    }        
                }
                k++;
            }
         }else if(readlines.length() == 0 && tiedostonNimi.equals("kirjasto.txt")){
            //Kirjastossa on aina oltava v�hint��n yksi media, joten jos tiedosto
            //on tyhj� niin lis�t��n dummy-kuva.
            Kuva kuva = new Kuva(true, "dummy");
            lista.lisaa(kuva);
         }
     }    

    /**
     * Suorittaa tallennaTiedosto()-metodin.
     */
    public void tallenna(){
        try{
            tallennaTiedosto("soittolista.txt",soittolista);
            tallennaTiedosto("kirjasto.txt",kirjasto);   
        }catch(UnsupportedEncodingException e){
            medkirj.Virhe();
        }catch(IOException e){
            medkirj.Virhe();
        }
    }
        
    /**
     * Tiedoston tallentaminen.
     * Haetaan alkion median tiedot ja kirjoitetaan tiedostoon.
     * @param tiednimi tiedoston nimi
     * @param lista k�sitelt�v� lista
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    public void tallennaTiedosto(String tiednimi,MediaLista lista) throws UnsupportedEncodingException, IOException{

        PrintWriter writer = new PrintWriter(tiednimi, "utf-8");
        
        //Kirjoitetaan oikeanlainen esitysmuoto soittolistalle
        if(tiednimi.equals("soittolista.txt")){

            writer.print(lista.maxKoko());
            String max = Integer.toString(lista.maxKoko());

            for(int i=0;i<8-max.length();i++){
                writer.print(" ");
            }
            writer.print("|");
            writer.println("");
        }

        //Kirjoitetaan alkion median tiedot
        for(int i=0; i<lista.koko(); i++){
            writer.println(lista.alkio(i));
        }

        writer.close();
    }
}