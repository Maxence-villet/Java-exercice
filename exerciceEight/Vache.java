package exerciceEight;

// Classe Vache
public class Vache extends Animal implements Mammifere {
    public Vache() {

    }

    @Override
    public void emettreSon() {
        System.out.println("La vache fait : Meuh");
    }

    @Override
    public void allaiter() {
        System.out.println("La vache allaite son veau.");
    }
}

