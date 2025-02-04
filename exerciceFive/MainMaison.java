package exerciceFive;

public class MainMaison {
    Maison maison;
    
    public MainMaison() {
        this.maison = new Maison();
        this.maison.addPiece("Cuisine");
        this.maison.addPiece("Chambre");
        this.maison.addPiece("Salle de bain");
        this.maison.addPiece("Salon");
        this.maison.addPiece("Toilette");
        this.maison.getPieces();
    }
}

