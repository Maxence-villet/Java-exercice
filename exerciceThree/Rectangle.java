package exerciceThree;

public class Rectangle extends Forme{
    // Attributes
    private double longueur;
    private double largeur;

    // Constructor
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    
    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }
}
