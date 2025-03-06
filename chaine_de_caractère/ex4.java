import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
          System.out.print("Entrez un entier : ");
          int nombre = scanner.nextInt();
  
          
          String chaine = String.valueOf(nombre);
  
       
          System.out.println("L'entier converti en chaîne : " + chaine);
  
         
          System.out.println("Les caractères de la chaîne :");
          for (int i = 0; i < chaine.length(); i++) {
              System.out.println("Caractère à l'index " + i + " : " + chaine.charAt(i));
          }
  
          scanner.close();
      }
  }