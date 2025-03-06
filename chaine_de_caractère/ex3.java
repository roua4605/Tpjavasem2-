import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();

       
        System.out.print("Entrez la lettre à compter : ");
        char lettre = scanner.next().charAt(0);

       
        int compteur = compterOccurrences(chaine, lettre);

        
        System.out.println("La lettre '" + lettre + "' apparaît " + compteur + " fois dans la chaîne.");

        scanner.close();
    }

    
    public static int compterOccurrences(String chaine, char lettre) {
        int compteur = 0;
        for (char c : chaine.toCharArray()) {
            if (c == lettre) {
                compteur++;
            }
        }
        return compteur;
    }
}