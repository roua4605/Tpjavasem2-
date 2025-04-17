import java.util.Scanner;

public class test2 {

    //  addition 
    public static double addition(double a, double b) {
        return a + b;
    }

    //soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // multiplication 
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // division 
    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;

        //  Choix de l’opération
        do {
            System.out.print("Choisissez une opération (+, -, *, /) : ");
            op = sc.next();
        } while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/"));

        //  Lecture des deux nombres
        System.out.print("Entrez le premier nombre : ");
        double x = sc.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double y = sc.nextDouble();

        // Si division, s'assurer que y ≠ 0
        if (op.equals("/")) {
            while (y == 0) {
                System.out.print("Erreur : le diviseur ne peut pas être zéro.\n" +
                                 "Veuillez entrer un second nombre non nul : ");
                y = sc.nextDouble();
            }
        }

        //  Calcul du résultat
        double resultat;
        switch (op) {
            case "+":
                resultat = addition(x, y);
                break;
            case "-":
                resultat = soustraction(x, y);
                break;
            case "*":
                resultat = multiplication(x, y);
                break;
            case "/":
                resultat = division(x, y);
                break;
            default:
                // ne devrait jamais arriver
                resultat = Double.NaN;
        }

        // Affichage
        System.out.println("Résultat de " + x + " " + op + " " + y + " = " + resultat);
        sc.close();
    }
}