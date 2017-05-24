package tp3;

import java.util.Scanner;

public class Tp3Exercice4_2 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("C. Café\nL. Lait\nT. Thé\nQ. Quitter");
		System.out.println("saisissez votre choix: ");
		String choix  = scanf.next();
		 
			switch (choix){
			case "C" : System.out.println("votre cafe est en cours de preparation");break;
			case "c" : System.out.println("votre cafe est en cours de preparation");break;
			case "L" : System.out.println("votre Lait est en cours de preparation");break;
			case "l" : System.out.println("votre Lait est en cours de preparation");break;
			case "T" : System.out.println("votre Thé est en cours de preparation");break;
			case "t" : System.out.println("votre Thé est en cours de preparation");break;
			case "Q" : System.out.println("Au revoir...");break;
			case "q" : System.out.println("Au revoir...");break;
			default : System.out.println("Mauvais choix");
		}
	}
}
