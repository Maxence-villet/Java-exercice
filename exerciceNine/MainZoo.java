package exerciceNine;

public class MainZoo {
    public MainZoo() {
        Zoo zoo = new Zoo();

        Enclos safari = new Enclos();
        safari.ajouterAnimal(new Lion());
        safari.ajouterAnimal(new Zebre());

        Enclos reptiles = new Enclos();
        reptiles.ajouterAnimal(new Animal()); 

        zoo.ajouterEnclos(safari);
        zoo.ajouterEnclos(reptiles);

        System.out.println("Sons des animaux dans le zoo :");
        zoo.faireEmettreSons();
    }
}
