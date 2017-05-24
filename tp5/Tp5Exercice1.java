package tp5;

import java.util.Scanner;

public class Tp5Exercice1 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("saisissez un entier: ");
		int nombre = scanf.nextInt();
		int i =1;
		
		while(i<=nombre){
			
			if (i%10==0){
				System.out.print(i + "\t");
				System.out.println();
				i++;
			}
			else{
				System.out.print(i + "\t");
				i++;
			}
		}
	}
}
