package exerciceOne;

public class Multiplication implements Calculable{

    public Multiplication() {

    }
    
    @Override
    public double calculer(double x, double y) {
        return x*y;
    }  
}
