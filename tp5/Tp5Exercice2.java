package tp5;

import java.util.Scanner;

public class Tp5Exercice2 {
	Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		
		for(int  i=1; i<=10; i++){
			System.out.print("\tpar " + i);
		}
		int j = 1;
		do{
			System.out.println();
			for(int i=1; i<=10; i++){
				System.out.print("\t" + i*j);
			}
			j++;
		}while(j<=10);
	}
}
