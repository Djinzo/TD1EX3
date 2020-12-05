import com.sid.Distributeur;

public class Client {
    public static void main(String... arr){
        Distributeur d=new Distributeur();
        d.demarrer();
        d.introduirePice(20);
        d.introduirePice(20);
        d.getProduit();
        d.arreter();
    }
}
