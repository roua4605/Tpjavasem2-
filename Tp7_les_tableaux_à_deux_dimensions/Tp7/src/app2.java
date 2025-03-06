/**
 * @(#)app2.java
 *
 *
 * @author 
 * @version 1.00 2025/2/20
 */

public class app2 {
        
   
    public static void main(String[] args) {
        
        int nl, nc,i,j,s,p;
        float moy;
        do {
            System.out.print("Entrez la valeur de n1 : ");
            nl=Clavier.lireInt();
        } while (nl <= 0 || nl >= 30);

        do {
            System.out.print("Entrez la valeur de nc : ");
            nc=Clavier.lireInt();
        } while (nc <= 0 || nc >= 30);

        
        int[][] M = new int[30][30];
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Élément [" + i + "][" + j + "] : ");
                M[i][j] = Clavier.lireInt();}
            }
        }

        int s = 0;
        double moy;
        long p = 1;
        int totalElements = nl * nc;

        for (i= 0; i < nl; i++) {
            for (j= 0; j < nc; j++) {
                s =s+ M[i][j];
                
                if (M[i][j] != 0 && p <=  / M[i][j]) {
                    p =p* M[i][j];
                } else {
                    produit = 0;

                
            }
        }

        moyenne = (double) s / totalElements;

       
            }
   
        }
        System.out.println("\nSomme des éléments : " + s);
        System.out.println("Produit des éléments : " + p);
        System.out.println("Moyenne des éléments : " + moy);
		s= Clavier.lireInt();
		p= Clavier.lireInt();
		moy= Clavier.lireInt();
        
    }
}

    }
}
