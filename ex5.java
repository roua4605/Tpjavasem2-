public class ex5 {

    // Méthode pour afficher le tableau
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }

    // Vérifie si le tableau est régulier (toutes les lignes ont la même taille)
    public static boolean regulier(double[][] t) {
        int taillePremiereLigne = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != taillePremiereLigne) {
                return false;
            }
        }
        return true;
    }

    // Calcule la somme de chaque ligne et retourne un tableau avec les sommes
    public static double[] sommesLignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (double valeur : t[i]) {
                somme += valeur;
            }
            sommes[i] = somme;
        }
        return sommes;
    }

    // Additionne deux tableaux 2D s'ils sont réguliers et de même taille
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || t1.length != t2.length || t1[0].length != t2[0].length) {
            return null; // Retourne null si les tableaux ne sont pas compatibles
        }

        double[][] resultat = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        double[][] tableau1 = { {1.2, 3.4, 5.6}, {7.8, 9.0, 1.1} };
        double[][] tableau2 = { {2.2, 4.4, 6.6}, {8.8, 10.0, 2.2} };

        System.out.println("Tableau 1:");
        affiche(tableau1);

        System.out.println("\nTableau 2:");
        affiche(tableau2);

        System.out.println("\nTableaux réguliers ? " + regulier(tableau1));

        double[] sommes = sommesLignes(tableau1);
        System.out.println("\nSommes des lignes du Tableau 1:");
        for (double somme : sommes) {
            System.out.print(somme + " ");
        }
        System.out.println();

        double[][] sommeTableaux = somme(tableau1, tableau2);
        if (sommeTableaux != null) {
            System.out.println("\nSomme des deux tableaux:");
            affiche(sommeTableaux);
        } else {
            System.out.println("\nLes tableaux ne sont pas compatibles pour l'addition.");
        }
    }
}