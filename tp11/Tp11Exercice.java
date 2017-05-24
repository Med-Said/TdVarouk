package tp11;

import java.util.Scanner;

public class Tp11Exercice {
	public static int[] indicesDesNegatifs(int[] tab){
		
		int nombresNegatif = 0;//pour compter le nombre des nombres negatif
		for(int i = 0; i<tab.length; i++){
			if(tab[i]<=0)
				nombresNegatif += 1;
		}
				
		int[] tabRes = new int[nombresNegatif];//le tableau a retorner
		int j = 0;
		for(int i =0; i<tab.length; i++){/*cette boucle sert a recuperer
		 les nombres negatifs a partir du tableau donne en parametre et les 
		 enregestre dans la table a retourner */
			if(tab[i]<0){
				tabRes[j] = i;
				j++;
			}	
		}
		return tabRes;
	}
	
	// une fonction pour la remplissage d'un tableau
	public static int[] saisiTab(){
		System.out.println("nombre des cases: ");
		int nombreCases = scanf.nextInt();
		int[] tab = new int[nombreCases];//le tableau a retourner
		
		for(int i =0; i<nombreCases; i++){
			System.out.println(": ");
			tab[i]= scanf.nextInt();
		}
		return tab;
	}
	
	//la procedure afficheTab(), cette procedure donne un asumilation d'un tableau,
	public static void afficheTab(int tab[]){
		String res = "";
		int i = 0;
		while(i<tab.length){
			res = res + tab[i]+", ";
			i++;
		}		
		System.out.println("le tableau d'indices des nombres negatifs: ");
		System.out.println("{" + res + "}");
	}
	
	static Scanner scanf = new Scanner(System.in);
	// la fonction main()
	public static void main(String[] args){
		
		int[] tab1 = indicesDesNegatifs(saisiTab());
		afficheTab(tab1);
	}
}
