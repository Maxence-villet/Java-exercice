package exerciceSix;

import java.util.ArrayList;

public class Universite {
    // Attributes
    ArrayList<Etudiant> etudiants;

    // Constructor
    public Universite() {
        etudiants = new ArrayList<>();
    }

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    public void removeEtudiant(int index) {
        this.etudiants.remove(index);
    }

    public void displayEtudiant() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getName() + " " +  etudiant.getUsername() + " est etudiant a cette universite");
        }
    }
}
