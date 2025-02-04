import exerciceOne.MainCalcul;
import exerciceThree.Cercle;
import exerciceThree.MainForme;
import exerciceThree.Rectangle;
import exerciceTwo.MainCalculAvance;
public class Main {
    public static void main(String[] args) {
        
        // Exercice 1
        double x, y;
        
        x = 5;
        y = 4; 

        MainCalcul mainCalcul = new MainCalcul();

        // output
        System.out.println("\n Exercice 1 : \n ");
        System.out.println("Addition : " + mainCalcul.getAddition(x, y));
        System.out.println("Multiplication : " + mainCalcul.getMultiplication(x, y));

        // Exercice 2

        double rayon = 2;


        MainCalculAvance mainCalculAvance = new MainCalculAvance();

        //output
        System.out.println("\n Exercice 2 : \n ");
        System.out.println("Surface : " + mainCalculAvance.getSurface(rayon));

        // Exercice 3

        exerciceThree.Rectangle rectangle = new Rectangle(x, y);
        exerciceThree.Cercle cercle = new Cercle(rayon);

        MainForme mainForme = new MainForme();
        
        // add forme
        mainForme.addForme(cercle);
        mainForme.addForme(rectangle);
        
        
        //output
        System.out.println("\n Exercice 3 : \n ");
        mainForme.getFormesSurface();
    }
}