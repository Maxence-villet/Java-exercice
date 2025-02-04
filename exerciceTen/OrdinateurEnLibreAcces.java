package exerciceTen;

class OrdinateurEnLibreAcces extends Ressource implements ConsultableSurPlace {
    OrdinateurEnLibreAcces() {}

    @Override
    void afficherInfos() {
        System.out.println("Ordinateur en libre acces: " + titre);
    }

    @Override
    public void consulterSurPlace() {
        System.out.println("Consultation sur place de l'ordinateur: " + titre);
    }
}