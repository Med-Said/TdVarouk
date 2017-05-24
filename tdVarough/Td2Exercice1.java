package tdVarough;
import java.util.Scanner;

public class Td2Exercice1 {
	
	static Scanner scanf = new Scanner(System.in);//pour lire les valeurs de l'utillisateur
	public static void main(String[] args){
		
		double var = 0.0d;
		//le traitement (le programme!!!)
		System.out.println("calcule de la valeur absolut");
		System.out.println("entrez le nobre: ");
		var = scanf.nextDouble();
		if (var>0)
			System.out.println(var);
		else
			System.out.println(-var);
	}
}
