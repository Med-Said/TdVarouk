package tdVarough;
import java.util.Scanner;

public class Td2Exercice4 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.println("saisissez les deux enteirs ");
		
		System.out.println("a: ");
		int a = scanf.nextInt();
		
		System.out.println("b: ");
		int b = scanf.nextInt();
		
		//le traitement
		
		if( (a>=0 && b>=0) || (a<0 && b<0) )
			System.out.println("le signe du produit de a et b est: " + " + ");
		else 
			System.out.println("le signe du produit de a et b est: " + " - ");
		
		/*
		 * lorsque le programme sexecute
		 * -reservation d'espaces memoire (32 bit) pour le variable a 
		 * -remplissage de de cet espace 
		 * -reservation d'espaces memoire (32 bit) pour le variable b
		 * -remplissage de de cet espace 
		 * - vidage de la memoire a la fin du programme*/
	}
}
