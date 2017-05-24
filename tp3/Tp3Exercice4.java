package tp3;

import java.util.Scanner;

public class Tp3Exercice4 {

	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("C. Café\nL. Lait\nT. Thé\nQ. Quitter");
		System.out.println("saisissez votre choix: ");
		String choix  = scanf.next();
		 
		if (choix.equals("C") || choix.equals("c"))
				System.out.println("votre cafe est en cours de preparation");
		else if (choix.equals("L") || choix.equals("l"))
			System.out.println("votre Lait est en cours de preparation");
		else if (choix.equals("T") || choix.equals("t"))
			System.out.println("votre Thé est en cours de preparation");
		else if (choix.equals("Q") || choix.equals("q"))
			System.out.println("Au revoir...");
		else 
			System.out.println("Mauvais choix");
	}
}
