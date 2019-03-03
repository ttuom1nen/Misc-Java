/*
*Pullonpalautusautomaattia mallintava luokka.
*Tommi Tuominen 2014
*/

//Pullonpalautusautomaatti voisi koostua esim. seuraavista
//luokista:

//Lukupää:
Scanner lukulaite = new Scanner();

//Etupaneelin toiminnot:
UserInterface frontPanel = new UserInterface();

//Takahuoneen toiminnot, kuten liukuhihnat, säiliöt,
//pullojen 'ohjaimet'
BackRoom takahuone = new BackRoom();

//Ensin tunnistetaan käyttäjän syöttämä pullo/tölkki.
//Tunnistustieto saadaan lukulaitteelta.
//Lukulaitteen getScanned metodi palauttaa scannatun ID:n
//Oletetaan ID:n olevan pitkä luku
long scannedid;
float pantti;
int tyyppi = 0;
scannedid = lukulaite.getScanned();

//Pullon/tölkin tunnistuksen jälkeen haetaan sitä vastaava pantti.
//Maksettavat pantit lasketaan yhteen.
tyyppi = lukulaite.type(scannedid);
pantti = lukulaite.getPantti(scannedid);

//Automaatin etupaneelissa olevaan näyttöön tulostetaan tieto käyttäjälle.
frontPanel.drawToDisplay(pantti);

//Pullon/tölkin tunnistustiedon mukaan kone osaa ohjata sen oikeaan paikkaansa automaatin takahuoneessa.
//Tölkit ohjataan rutistimeen ja rutistimesta ne tippuvat niille varattuun säiliöön.
//Lasipullot tippuvat niille varattuun säiliöön.
//Muovipullot rutistimen kautta omaan säiliöönsä.
   takahuone.ohjaapullo(1);
    
//Kaikissa säiliöissä on infrapunatunnistin säiliön täyttymisen tunnistamiseksi.
if(sailiotaynna)
    error(6);

//Jos pulloa/tölkkiä ei tunnisteta, ohjataan se tiettyyn paikkaan, josta työntekijä lajittelee myöhemmin.
if(tunnistettu = false){
    takahuone.ohjaapullo(0);
}

//Mahdollisissa virhetilanteissa tuupataan pullo tai tölkki pihalle lukijasta.
//Virhetilanteita voi olla esim. sopimaton pullo,
//säiliö täynnä,
//pullo tai tölkki jumissa,
//virhe lukupäässä.

public int error(int code){
//errorin määritys

return errorcode;
}

//Etupaneelissa näytetään virhenumero.
frontPanel.drawError(error());

//Onnistuneen pullonpalautuksen jälkeen käyttäjä painaa nappulaa ja kuitti tulostuu.
if(finished){
    frontPanel.tulostakuitti(pantti);    
}