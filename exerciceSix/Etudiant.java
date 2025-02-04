package exerciceSix;

public class Etudiant {
    // Attributes
    private String nom;
    private String prenom;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getName() {
        return this.nom;
    }

    
    public String getUsername() {
        return this.prenom;
    }
}
