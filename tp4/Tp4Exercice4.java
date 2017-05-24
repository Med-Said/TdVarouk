package tp4;

import java.util.Scanner;

public class Tp4Exercice4 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		short n;
		do{
			System.out.println("saisissez un entier entre 1 et 10: ");
			n = scanf.nextShort();
		}while(n>10 || n <0);
		
		if (n==0)
			System.out.println("0!=1");
		else{
			short factN = n;
			short nn = n;
			
			while(n>1){
				factN*=(n-1);
				System.out.println(factN);
				n--;
			}
			
			System.out.println(nn+"!="+factN);
		}
	}
}
