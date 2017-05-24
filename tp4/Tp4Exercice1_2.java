package tp4;

import java.util.Scanner;

public class Tp4Exercice1_2 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		int nombre;
		System.out.printf("saisissez un nombre: ");
		nombre = scanf.nextInt();
		
		while (nombre >=0){
			System.out.printf("%d\n",nombre);
			nombre--;
		}
		
		System.out.println("Au revoir...");
	}
}
