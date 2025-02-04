package exerciceFive;

import java.util.ArrayList;

public class Maison {
    // Attributes
    ArrayList<Piece> pieces;

    public Maison() {
        this.pieces = new ArrayList<Piece>();
    }

    public void getPieces() {
        for (Piece piece : pieces) {
            System.out.println("Cette piece est : " + piece.getName());
        }
    }

    public void addPiece(String name) {
        pieces.add(new Piece(name));
    }
}
