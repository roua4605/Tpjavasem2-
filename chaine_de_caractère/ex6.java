import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un mot : ");
        String word = scanner.nextLine();

        
        int[] vowelsCount = new int[5]; 

        
        for (char c : word.toCharArray()) {
            switch (Character.toLowerCase(c)) {
                case 'a':
                    vowelsCount[0]++;
                    break;
                case 'e':
                    vowelsCount[1]++;
                    break;
                case 'i':
                    vowelsCount[2]++;
                    break;
                case 'o':
                    vowelsCount[3]++;
                    break;
                case 'u':
                    vowelsCount[4]++;
                    break;
            }
        }

        
        System.out.println("La voyelle 'a' apparaît " + vowelsCount[0] + " fois.");
        System.out.println("La voyelle 'e' apparaît " + vowelsCount[1] + " fois.");
        System.out.println("La voyelle 'i' apparaît " + vowelsCount[2] + " fois.");
        System.out.println("La voyelle 'o' apparaît " + vowelsCount[3] + " fois.");
        System.out.println("La voyelle 'u' apparaît " + vowelsCount[4] + " fois.");
    }
}