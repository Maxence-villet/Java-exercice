package exerciceNine;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Enclos> enclos;

    public Zoo() {
        enclos = new ArrayList<>();
    }

    public void ajouterEnclos(Enclos enclos) {
        this.enclos.add(enclos);
    }

    public void faireEmettreSons() {
        for (Enclos enclos : enclos) {
            enclos.faireEmettreSons();
        }
    }
}