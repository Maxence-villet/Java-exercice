package exerciceThree;

import java.util.ArrayList;

public class MainForme {
    private ArrayList<Forme> formes;

    public MainForme() {
        formes = new ArrayList<Forme>();
    }

    public void addForme(Forme forme) {
        formes.add(forme);
    }

    public void getFormesSurface() {
        for (Forme forme : formes) {
            forme.afficherSurface();
        }
    }
}
