 public class Vecteur {
        private double[] composantes;
    
        public Vecteur(double[] valeurs) {
            this.composantes = valeurs;
        }
    
        public double produitScalaire(Vecteur v) {
            if (v.composantes.length != this.composantes.length) {
                throw new IllegalArgumentException("Taille différente");
            }
            double produit = 0;
            for (int i = 0; i < composantes.length; i++) {
                produit += composantes[i] * v.composantes[i];
            }
            return produit;
        }
    
        public static Vecteur somme(Vecteur v1, Vecteur v2) {
            if (v1.composantes.length != v2.composantes.length) {
                return null;
            }
            double[] res = new double[v1.composantes.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = v1.composantes[i] + v2.composantes[i];
            }
            return new Vecteur(res);
        }
    
        public static Vecteur produit(Vecteur v1, Vecteur v2) {
            if (v1.composantes.length != v2.composantes.length) {
                return null;
            }
            double[] res = new double[v1.composantes.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = v1.composantes[i] * v2.composantes[i];
            }
            return new Vecteur(res);
        }
    
        public void afficher() {
            for (double d : composantes) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            Vecteur v1 = new Vecteur(new double[]{1.0, 2.0, 3.0});
            Vecteur v2 = new Vecteur(new double[]{4.0, 5.0, 6.0});
    
            System.out.print("Vecteur v1 : ");
            v1.afficher();
            System.out.print("Vecteur v2 : ");
            v2.afficher();
    
            Vecteur s = Vecteur.somme(v1, v2);
            if (s != null) {
                System.out.print("Somme : ");
                s.afficher();
            }
    
            Vecteur p = Vecteur.produit(v1, v2);
            if (p != null) {
                System.out.print("Produit : ");
                p.afficher();
            }
    
            System.out.println("Produit scalaire : " + v1.produitScalaire(v2));
        }
    }
    
