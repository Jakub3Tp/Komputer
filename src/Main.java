import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komputer> komputery = new ArrayList<>();
        KomputerWindows Levono = new KomputerWindows("Levono", "Intel UMD 350");
        KomputerWindows Mana = new KomputerWindows("Levono", "Intel UMD 350");
        KomputerMac Inote = new KomputerMac("Levono", "Intel UMD 350");
        KomputerMac Ilap = new KomputerMac("Levono", "Intel UMD 350");

        komputery.add(Levono);
        komputery.add(Mana);
        komputery.add(Inote);
        komputery.add(Ilap);

        for (Komputer k: komputery){
            System.out.println(k.getClass().getName());
            k.uruchom();
            k.zepsujSie();
            System.out.println("-------------------");
        }

        Collections.sort(komputery);
        System.out.println(komputery);
    }
}
