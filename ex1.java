public class ex1 {

    public static double somme(double[] tab) {
        double total = 0;
        for (double v : tab) {
            total += v;
        }
        return total;
    }

    public static void inc(double[] tab, double valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += valeur;
        }
    }

    public static void afficher(double[] tab) {
        for (double v : tab) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] t = {1.5, 2.0, 3.5};
        System.out.print("Tableau initial : ");
        afficher(t);
        System.out.println("Somme = " + somme(t));

        inc(t, 1.0);
        System.out.print("Après incrémentation : ");
        afficher(t);
    }
}
