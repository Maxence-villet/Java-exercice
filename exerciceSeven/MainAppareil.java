package exerciceSeven;

import java.util.ArrayList;

public class MainAppareil {
    // Attributes
    private ArrayList<AppareilElectrique> appareils;
    // Constructor
    public MainAppareil() {
        this.appareils = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            appareils.add(new Television(450));
            appareils.add(new Ordinateur(700));
        }

        for (AppareilElectrique appareil : appareils) {
            if (appareil instanceof Ordinateur) {
                Ordinateur ordinateur = (Ordinateur) appareil;
                ordinateur.allumer();
                ordinateur.connecter();           
            } else if (appareil instanceof Television) {
                Television television = (Television) appareil;
                television.allumer();
                television.connecter();
            }
        }
    }
}
