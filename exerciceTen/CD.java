package exerciceTen;

class CD extends Ressource implements Empruntable {
    CD() {}

    @Override
    void afficherInfos() {
        System.out.println("CD: " + titre);
    }

    @Override
    public void emprunter() {
        System.out.println("CD emprunté: " + titre);
    }

    @Override
    public void rendre() {
        System.out.println("CD rendu: " + titre);
    }
}