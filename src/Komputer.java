public interface Komputer extends Comparable<Komputer>{
    void uruchom();
    void zepsujSie();

    int compareTo(Komputer o);
}
