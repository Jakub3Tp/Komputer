public class KomputerWindows implements Komputer{

    private String Model;
    private String Procesor;

    public KomputerWindows(String model, String procesor) {
        this.Model = model;
        Procesor = procesor;
    }

    @Override
    public void uruchom() {
        System.out.println("*Dźwięki Windowsa Xp*");
    }

    @Override
    public void zepsujSie() {
        System.out.println("*Dźwięki błędów Windowsa Xp*");
    }

}
