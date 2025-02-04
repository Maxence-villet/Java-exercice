import exerciceFive.MainMaison;
import exerciceFour.MainVehicule;
import exerciceFour.Moto;
import exerciceFour.Voiture;
import exerciceOne.MainCalcul;
import exerciceSix.Etudiant;
import exerciceSix.Universite;
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

        // Exercice 4

        MainVehicule mainVehicule = new MainVehicule();
        
        // add forme
        for (int i = 0; i < 1; i++) {
            Moto moto = new Moto();
            Voiture voiture = new Voiture();

            mainVehicule.addVehicule(voiture);
            mainVehicule.addVehicule(moto);
        }
        
        
        //output
        System.out.println("\n Exercice 4 : \n ");
        mainVehicule.getVehiculesActions();

        // Exercice 5
        System.out.println("\n Exercice 5 : \n ");
        MainMaison mainMaison = new MainMaison();

        // Exercice 6
        System.out.println("\n Exercice 6 : \n ");
        
        Etudiant etudiant1 = new Etudiant("Turing", "Alan");
        Etudiant etudiant2 = new Etudiant("Lovelace", "Ada");
        Etudiant etudiant3 = new Etudiant("Boole", "Goerge");

        Universite universite = new Universite();
        universite.addEtudiant(etudiant1);
        universite.addEtudiant(etudiant2);
        universite.addEtudiant(etudiant3);
        
        universite.removeEtudiant(1); // Ada Lovelace

        //output
        universite.displayEtudiant();


    }
}