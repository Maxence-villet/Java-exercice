package exerciceThree;

public class Cercle extends Forme {
    // Attributes
    private double rayon;

    // Constructor
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * (this.rayon*this.rayon);
    }
}
