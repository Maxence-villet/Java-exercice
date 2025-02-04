package exerciceTwo;

public class MainCalculAvance {
    Cercle cercle;

    public MainCalculAvance() {
        cercle = new Cercle();
    }

    public double getSurface(double rayon) {
        return cercle.calculerSurface(rayon);
    }
}
