public class KomputerMac implements Komputer{
    private int starty = 0;
    private String Model;
    private String Procesor;

    public KomputerMac(String model, String procesor) {
        this.Model = model;
        Procesor = procesor;
    }

    @Override
    public void uruchom() {
        System.out.println("*Dźwięki jakiegoś Macboocka*");
    }

    @Override
    public void zepsujSie() {
        System.out.println("*Dźwięki błędów w jakimś Macboocku*");
    }

    @Override
    public int compareTo(Komputer o) {
        if (o.getClass().equals(getClass())){
            return Model.length() - ((KomputerMac)o).Model.length();
        } else if (o.getClass().getName().endsWith("KomputeryWindows")) {
            
        }
        return 1;
    }
}
