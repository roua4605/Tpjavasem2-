import java.util.Scanner;
public class ex3 {

    public static void remplir(int[] t) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            System.out.print("Entier " + (i + 1) + " : ");
            t[i] = sc.nextInt();
        }
    }

    public static void trier(int[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[j] < t[i]) {
                    int tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
    }

    public static void afficher(int[] t) {
        for (int val : t) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] t = new int[5];
        remplir(t);
        System.out.print("Tableau initial : ");
        afficher(t);
        trier(t);
        System.out.print("Tableau trié : ");
        afficher(t);
    }
}
