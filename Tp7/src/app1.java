/**
 * @(#)app1.java
 *
 *
 * @author 
 * @version 1.00 2025/2/20
 */

public class app1 {
   
    public static void main(String[] args) {
    	int nl,nc,i,j,x;
    	int[][]M =new int[50][50];
    	
    	do{
        	System.out.println("Saisir nl:");
        	nl=Clavier.lireInt();
        	if(nl>= 50 || nl<0){
        		System.out.println("valeur invalide");
        	}
        }while(nl<0 || nl>=50 );
        System.out.println("la valeur de nl est: "+nl);
        
        do{
        	System.out.println("Saisir nc:");
        	nc=Clavier.lireInt();
        	if(nc>= 50 || nc<0){
        		System.out.println("valeur invalide");
        	}
        }while(nc<0 || nc>=50 );
        System.out.println("la valeur de nl est: "+nc);
       
        for(i=0;i<nl;i++){
        	 for(j=0;j<nc;j++){
        	System.out.println("remplir M["+i+","+j+"]");
        	M[i][j]=Clavier.lireInt();}
        	}
        
        	do{
        	System.out.println("Saisir x:");
        	x=Clavier.lireInt();
        }while(x % 2==0);
        	}
        	if ((M, x)) {
            System.out.println("L'élément " + x + " existe dans la matrice.");
        } else {
            System.out.println("L'élément " + x + " n'existe pas dans la matrice.");
        }
    }

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                if (M[i][j] == x) {
                    return true; 
                }
            }
        }
        return false; 
    }
}
^}       		       	