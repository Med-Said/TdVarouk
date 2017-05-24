package tp3;

import java.util.Scanner;

public class Tp3Exercice3 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("1. Café\n2. Lait\n3. Thé\n0. Quitter");
		System.out.println("saisissez votre choix: ");
		int choix  = scanf.nextInt();
		
		if (choix == 1) 
				System.out.println("votre cafe est en cours de preparation");
		else if (choix == 2)
			System.out.println("votre Lait est en cours de preparation");
		else if (choix == 3)
			System.out.println("votre Thé est en cours de preparation");
		else if (choix == 0)
			System.out.println("Au revoir...");
		else 
			System.out.println("Mauvais choix");
	}
}
