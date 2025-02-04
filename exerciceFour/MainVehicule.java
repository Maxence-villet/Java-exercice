package exerciceFour;

import java.util.ArrayList;

public class MainVehicule {
    private ArrayList<Vehicule> Vehicules;

    public MainVehicule() {
        Vehicules = new ArrayList<Vehicule>();
    }

    public void addVehicule(Vehicule Vehicule) {
        Vehicules.add(Vehicule);
    }

    public void getVehiculesActions() {
        for (Vehicule Vehicule : Vehicules) {
            Vehicule.demarrer();
            Vehicule.arreter();
        }
    }
}
