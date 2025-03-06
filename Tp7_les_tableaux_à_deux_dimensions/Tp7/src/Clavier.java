//------------programme Clavier------------------- 

//nom du fichier="Clavier.java" 
//classe fournissant des fonctions d lecture au clavier 
import java.io.*; 
public class Clavier{
	
	
	
///////////*******************************************  
public  static char lireChar()  // Lire un caractere
	{
	    String tmp=lireString();
	    if (tmp.length()==0)
		return '\n';
	    else 
	    {
		return tmp.charAt(0);
	    }
	}

///////////******************************************* 
	public static String lireString(){//lecture d'une chaine 
		String ligne_lue=null; 
		try{ 
		InputStreamReader lecteur=new InputStreamReader(System.in); 
		BufferedReader entree=new BufferedReader(lecteur); 
		ligne_lue=entree.readLine(); 
		} 
		catch(IOException err){ 
		System.exit(0); 
		} 
		return ligne_lue; 
	} 
	////////////////************************************** 
	public static float lireFloat(){//lecture d'un float 
		float x=0; //valeur � lire 
		try{ 
		String ligne_lue=lireString(); 
		x=Float.parseFloat(ligne_lue); 
		} 
		catch(NumberFormatException err){ 
		System.out.println("***Erreur de donn�es R�el attendu***"); 
		System.exit(0); 
		} 
		return x; 
	} 
	///////////////********************************************* 
	public static double lireDouble(){//lecture d'un double 
		double x=0; //valeur � lire 
		try{ 
		String ligne_lue=lireString(); 
		x=Double.parseDouble(ligne_lue); 
		} 
		catch(NumberFormatException err){ 
		System.out.println("***Erreur de donn�es Double attendu***"); 
		System.exit(0); 
		} 
		return x; 
	} 
	///////////******************************************* 
	public static int lireInt(){//lecture d'un double 
		int x=0; //valeur � lire 
		try{ 
		String ligne_lue=lireString(); 
		x=Integer.parseInt(ligne_lue); 
		} 
		catch(NumberFormatException err){ 
		System.out.println("***Erreur de donn�es Entier attendu***"); 
		System.exit(0); 
		} 
		return x; 
	} 
///////////******************************************* 



////Programme de test de la classe clavier 
public static void main(String[] args){ 
	System.out.println("Donner un flottant"); 
	float x; x=Clavier.lireFloat(); 
	System.out.println("Merci pour"+x); 
	System.out.println("Donner un entier"); 
	float n; n=Clavier.lireInt(); 
	System.out.println("Merci pour"+n); 


} 
}