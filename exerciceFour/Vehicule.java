package exerciceFour;

public abstract class Vehicule {
    // Attributes 
    
    // Constructor
    public Vehicule() {

    }

    public abstract void demarrer(); 

    public void arreter() {
        System.out.println("je m'arrete");
    }
}
