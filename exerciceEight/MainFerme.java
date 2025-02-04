package exerciceEight;

import java.util.ArrayList;
import java.util.List;

public class MainFerme {
    public MainFerme() {
        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Chat());
        animaux.add(new Chien());
        animaux.add(new Vache());

        for (Animal animal : animaux) {
            animal.emettreSon();

            if (animal instanceof Vache) {
                Vache vache = (Vache) animal;
                vache.allaiter();
            }
        }
    }
}
