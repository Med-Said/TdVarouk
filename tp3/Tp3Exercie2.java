package tp3;
import java.util.Scanner;

	public class Tp3Exercie2{
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("1. Café\n2. Lait\n3. Thé\n0. Quitter");
		System.out.println("saisissez votre choix");
		int choix  = scanf.nextInt();
		
		switch (choix){
			case 1 : System.out.println("votre cafe est en cours de preparation");break;
			case 2 : System.out.println("votre Lait est en cours de preparation");break;
			case 3 : System.out.println("votre Thé est en cours de preparation");break;
			case 0 : System.out.println("Au revoir...");break;
			default : System.out.println("Mauvais choix");
		}
	}
}
