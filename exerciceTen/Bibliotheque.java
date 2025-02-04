package exerciceTen;

class Bibliotheque {
    java.util.List<Ressource> ressources;

    Bibliotheque() {
        ressources = new java.util.ArrayList<>();
    }

    void ajouterRessource(Ressource r) {
        ressources.add(r);
    }

    void supprimerRessource(Ressource r) {
        ressources.remove(r);
    }

    void listerRessources() {
        for (Ressource r : ressources) {
            r.afficherInfos();
        }
    }
}