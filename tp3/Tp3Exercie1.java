package tp3;
import java.util.Scanner;

public class Tp3Exercie1 {
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		//recuperation des donnees
		System.out.println("entez les trois nombres");
		System.out.println("num1: ");
		double a = scanf.nextDouble();
		System.out.println("num2: ");
		double b = scanf.nextDouble();
		System.out.println("num3: ");
		double c = scanf.nextDouble();
		
		//traitement
		if ((a>b && a>c) && b>c)
			System.out.println(a + " > " + b + " > " + c);
		else if((a>b && a>c) && b<c)
			System.out.println(a + " > " + c + " > " + b);
		else if ((b>a && b>c) && a>c)
			System.out.println(b + " > " + a + " > " + c);
		else if ((b>a && b>c) && a<c)
			System.out.println(b + " > " + c + " > " + a);
		else if ((c>a && c>b) && a>b)
			System.out.println(c + " > " + a + " > " + b);
		else if ((c>a && c>b) && a<b)
			System.out.println(c + " > " + b + " > " + a);
		else 
			System.out.println("veriviez s'il s'agit des nombres egaux");
		
	}
}