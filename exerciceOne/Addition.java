package exerciceOne;

public class Addition implements Calculable{

    public Addition() {
        
    }

    @Override
    public double calculer(double x, double y) {
        return x+y;
    }

}
