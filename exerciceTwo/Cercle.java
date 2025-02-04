package exerciceTwo;

public class Cercle implements CalculableAvance{

    public Cercle() {

    }

    @Override
    public double calculerSurface(double rayon) {
        return PI*(rayon*rayon);
    }
    
}
