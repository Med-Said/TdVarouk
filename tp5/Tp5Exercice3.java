package tp5;

import java.util.Scanner;

//classeConversion
public class Tp5Exercice3 {
	//les attributs
	int f,c;//f: farenheit & c: celsius
	
	//le sous-programme afficheFenC
	public void affichFenC(int f){
		System.out.println((f-32)*5/9);
	}
	
	 //le sous-programme afficheTableFenC
	static void afficheTableFenC(int fA, int fB){
		System.out.println("Farenheit\tCelsius");
		do{
			System.out.println(fA + "\t\t" + (fA-32)*5/9);
			fA += 20;
		}while(fA<=fB);
	}
	
	
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		afficheTableFenC(-20,20);
	}
}
