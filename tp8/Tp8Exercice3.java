package tp8;

import java.util.Scanner;

public class Tp8Exercice3 {
	
	//la fonction sontEgaux()
	public static boolean sontEgaux(int[] tab1, int[] tab2){
		boolean res = true;
		if(tab1.length != tab2.length)
			return false;
		else {
			for(int i = 0; i<tab1.length; i++){
				res = res && (tab1[i] == tab2[i]);
			}
			return res;
		}
	}
	
	Scanner scanf = new Scanner(System.in);
	public static void main(String[] args){
		int tab1[] = {1,2,3,7};
		int tab2[] = {1,2,3,7};
		int tab3[] = {1,2,4,7};
		int tab4[] = {1,2,4};
		System.out.println(sontEgaux(tab1,tab2));
		System.out.println(sontEgaux(tab1,tab3));
		System.out.println(sontEgaux(tab1,tab4));
	}
}
