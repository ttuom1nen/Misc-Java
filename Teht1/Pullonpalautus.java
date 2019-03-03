/*
*Pullonpalautusautomaattia mallintava luokka.
*Tommi Tuominen 2014
*/

//Pullonpalautusautomaatti voisi koostua esim. seuraavista
//luokista:

//Lukup��:
Scanner lukulaite = new Scanner();

//Etupaneelin toiminnot:
UserInterface frontPanel = new UserInterface();

//Takahuoneen toiminnot, kuten liukuhihnat, s�ili�t,
//pullojen 'ohjaimet'
BackRoom takahuone = new BackRoom();

//Ensin tunnistetaan k�ytt�j�n sy�tt�m� pullo/t�lkki.
//Tunnistustieto saadaan lukulaitteelta.
//Lukulaitteen getScanned metodi palauttaa scannatun ID:n
//Oletetaan ID:n olevan pitk� luku
long scannedid;
float pantti;
int tyyppi = 0;
scannedid = lukulaite.getScanned();

//Pullon/t�lkin tunnistuksen j�lkeen haetaan sit� vastaava pantti.
//Maksettavat pantit lasketaan yhteen.
tyyppi = lukulaite.type(scannedid);
pantti = lukulaite.getPantti(scannedid);

//Automaatin etupaneelissa olevaan n�ytt��n tulostetaan tieto k�ytt�j�lle.
frontPanel.drawToDisplay(pantti);

//Pullon/t�lkin tunnistustiedon mukaan kone osaa ohjata sen oikeaan paikkaansa automaatin takahuoneessa.
//T�lkit ohjataan rutistimeen ja rutistimesta ne tippuvat niille varattuun s�ili��n.
//Lasipullot tippuvat niille varattuun s�ili��n.
//Muovipullot rutistimen kautta omaan s�ili��ns�.
   takahuone.ohjaapullo(1);
    
//Kaikissa s�ili�iss� on infrapunatunnistin s�ili�n t�yttymisen tunnistamiseksi.
if(sailiotaynna)
    error(6);

//Jos pulloa/t�lkki� ei tunnisteta, ohjataan se tiettyyn paikkaan, josta ty�ntekij� lajittelee my�hemmin.
if(tunnistettu = false){
    takahuone.ohjaapullo(0);
}

//Mahdollisissa virhetilanteissa tuupataan pullo tai t�lkki pihalle lukijasta.
//Virhetilanteita voi olla esim. sopimaton pullo,
//s�ili� t�ynn�,
//pullo tai t�lkki jumissa,
//virhe lukup��ss�.

public int error(int code){
//errorin m��ritys

return errorcode;
}

//Etupaneelissa n�ytet��n virhenumero.
frontPanel.drawError(error());

//Onnistuneen pullonpalautuksen j�lkeen k�ytt�j� painaa nappulaa ja kuitti tulostuu.
if(finished){
    frontPanel.tulostakuitti(pantti);    
}