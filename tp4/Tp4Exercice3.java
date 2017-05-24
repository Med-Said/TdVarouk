package tp4;

import java.util.Scanner;

public class Tp4Exercice3 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args) {
		String choixRep ="";
		System.out.println("C. Café\nL. Lait\nT. Thé\nQ. Quitter");
		String choix;
		do{
			System.out.println("saisissez votre choix: ");
			choix  = scanf.next();
		}while(! choix.equals("C") && ! choix.equals("C") &&! choix.equals("t") && ! choix.equals("T") && ! choix.equals("l") && ! choix.equals("L") && ! choix.equals("q") && ! choix.equals("Q"));
		
		switch(choix){
		case "c": choixRep = "Cafe";break;
		case "C": choixRep = "Cafe";break;
		case "T": choixRep = "The";break;
		case "t": choixRep = "The";break;
		case "L": choixRep = "Lait";break;
		case "l": choixRep = "Lait";break;
		default : ;
		}
		
		System.out.println("votre " +  choixRep + " est en coure de préparation");
	}
}