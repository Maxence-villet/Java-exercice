package exerciceSeven;

public class Television extends AppareilElectrique implements Connectable{
    // Attributes

    // Constructor
    public Television(int puissance) {
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
