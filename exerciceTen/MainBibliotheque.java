package exerciceTen;

public class MainBibliotheque {
    public MainBibliotheque() {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre = new Livre();
        livre.titre = "Le Petit Prince";
        bibliotheque.ajouterRessource(livre);

        CD cd = new CD();
        cd.titre = "Thriller - Michael Jackson";
        bibliotheque.ajouterRessource(cd);

        OrdinateurEnLibreAcces ordinateur = new OrdinateurEnLibreAcces();
        ordinateur.titre = "PC-01";
        bibliotheque.ajouterRessource(ordinateur);

        bibliotheque.listerRessources();

        livre.emprunter();
        livre.rendre();

        ordinateur.consulterSurPlace();
    }
}
