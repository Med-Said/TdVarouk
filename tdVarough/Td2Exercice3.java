package tdVarough;
import java.util.Scanner;

public class Td2Exercice3 {
	static Scanner scanf = new Scanner(System.in);
	final static double PI = 3.14d;
	public static void main(String[] args){
		double circonference, aire;
		
		System.out.println("entrez le rayon : ");
		int r = scanf.nextInt();
		circonference = 2*PI*r;
		aire = PI*r*r;
		
		System.out.println("la circonference : " + circonference);
		System.out.println("l'aire est : " + aire);
	}
}
