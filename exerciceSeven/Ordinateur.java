package exerciceSeven;

public class Ordinateur extends AppareilElectrique implements Connectable{
    // Attributes

    // Constructor
    public Ordinateur(int puissance) {
        super(puissance);
    }

    @Override
    public void allumer() {
        System.out.println("Allumage de la TV");
    }

    @Override
    public void connecter() {
        System.out.println("Connexion de la TV");
    }
}