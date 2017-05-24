package tp4;

import java.util.Scanner;

public class Tp4Exercice1 {
	// affiche Au revoir lorsqu'on entre 0 au clavier
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args) {
	int nombre;
	System.out.println("Entrez un nombre entier : ");
	nombre=scanf.nextInt(); // lecture au clavier
	if (nombre == 0) // si on a saisi 0
	System.out.println("Au revoir...");
	}
}
