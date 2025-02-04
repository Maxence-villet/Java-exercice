package exerciceNine;

import java.util.ArrayList;
import java.util.List;

class Enclos {
    private List<Animal> animaux;

    public Enclos() {
        animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void faireEmettreSons() {
        for (Animal animal : animaux) {
            animal.faireSon();
        }
    }
}