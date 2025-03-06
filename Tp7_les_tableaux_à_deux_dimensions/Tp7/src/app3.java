/**
 * @(#)app3.java
 *
 *
 * @author 
 * @version 1.00 2025/2/26
 */

public class app3 {
    
    public static void main(String[] args) {
    	
    int nl,nc;
    	
         
        System.out.print("entrer le nombre de (nl) <= 20: ");
         nl = Clavier.lireInt();
        System.out.print("Entrer le nombre de (nc) <= 30: ");
         nc = Clavier.lireInt();
        
        int[][] M = new int[nl][nc];
        int[] T = new int[nl];
        
        
        for (int i = 0; i < nl; i++) {
            System.out.println("Enter le nombre de ligne  " + (i + 1) + " valeur: ");
            for (int j = 0; j < nc; j++) {
                M[i][j] = Clavier.lireInt();
            }
        }
        
       
        for (int i = 0; i < nl; i++) {
            int somligne = 0;
            for (int j = 0; j < nc; j++) {
               somligne += M[i][j];
            }
            T[i] = somligne ;
        }
        
       
        int minSom = T[0];
        int maxSom = T[0];
        for (int i = 1; i < nl; i++) {
            if (T[i] < minSom) {
                minSom = T[i];
            }
            if (T[i] > maxSom) {
                maxSom = T[i];
            }
        }
        
       
        System.out.print("la somme des lignes : ");
        for (int som : T) {
            System.out.print(som + " ");
        }
        System.out.println();
        System.out.println("Minimum som: " + minSom);
        System.out.println("Maximum som: " )
        
        
    }
}
