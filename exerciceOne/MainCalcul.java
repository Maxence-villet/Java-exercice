package exerciceOne;

public class MainCalcul {
    
    // Attributes
    private Addition addition;
    private Multiplication muliplication;

    // Constructor
    public MainCalcul() {
        this.addition = new Addition();
        this.muliplication = new Multiplication();
    }

    public double getMultiplication(double x, double y) {
        return this.muliplication.calculer(x, y);
    }

    public double getAddition(double x, double y) {
        return this.addition.calculer(x, y);
    }
}
