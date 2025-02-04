package exerciceThree;

public abstract class Forme {
    // Attributes
    // Constructor
    public Forme() {

    }

    public abstract double calculerSurface();

    public void afficherSurface() {
        System.out.println("La surface est : " + calculerSurface());
    }
}
