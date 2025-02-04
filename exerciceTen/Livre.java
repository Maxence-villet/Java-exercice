package exerciceTen;

class Livre extends Ressource implements Empruntable {
    Livre() {}

    @Override
    void afficherInfos() {
        System.out.println("Livre: " + titre);
    }

    @Override
    public void emprunter() {
        System.out.println("Livre emprunte: " + titre);
    }

    @Override
    public void rendre() {
        System.out.println("Livre rendu: " + titre);
    }
}
