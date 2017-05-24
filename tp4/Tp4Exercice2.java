package tp4;

import java.util.Scanner;

public class Tp4Exercice2 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		System.out.printf("entrez un entier: ");
		int nombre = scanf.nextInt();
		
		System.out.println("\tpar " + (nombre-1) + "\t\tpar " + nombre + "\t\tpar " + (nombre+1));
		int i=1;
		while(i <=20){
			System.out.println(i + "\t" + (nombre-1)*i + "\t\t" + nombre*i + "\t\t" + (nombre+1)*i);
			i++;
		}
	}
}
