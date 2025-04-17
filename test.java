
import java.util.Scanner;

public class test {

    // Lecture 
    public static int lecture() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Entrez un entier strictement positif : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur");
            }
        } while (n <= 0);
        return n;
    }

    // Compter 
    public static int Compter(int n) {
        int s = 0;
        while (n != 0) {
            n = n / 10;
            s++;
        }
        return s;
    }

    // Affichage
    public static void main(String[] args) {
        int n = lecture();
        int nbrch = Compter(n);
        System.out.println("Le nombre contient " + nbrch + " chiffre(s).");
    }
}