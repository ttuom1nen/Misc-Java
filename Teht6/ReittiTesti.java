/*
 *harj. 6 teht. 6
 *Tommi Tuominen 2014
*/

public class ReittiTesti{

    public static void main(String[] args){
        Reitti route = new Reitti("sdsd",55);
        route.asetapysakki("pysakki", 5325);
        
        System.out.println(route.tunnus());
        System.out.println(route.ajoaika());
        System.out.println(route.tiedot());

    }

}