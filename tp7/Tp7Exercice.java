package tp7;

import java.util.Scanner;

public class Tp7Exercice {
	
	//la procedure parcours
	public static void parcours(int[] tab, boolean gaucheAdroite){
		if (gaucheAdroite){
			for(int i=0; i<tab.length; i++){
				System.out.println(tab[i]);
			}
		}
		else{
			for(int i = tab.length-1; i>=0; i--){
				System.out.println(tab[i]);
			}
		}
	}
	
	//la procedure saisieTableau
	public static void saisieTableau(int tab[]){
		for(int i = 0; i<tab.length; i++){
			System.out.println("[" +i+"]");
			tab[i] = scanf.nextInt();
		}
	}
	
	static Scanner scanf = new Scanner(System.in);
	/*
	 public static void main(String[] args){
		System.out.println("saisissez la longueur du table: ");
		int longueur = scanf.nextInt();
		
		int tab[] = new int[longueur];
		for(int i = 0; i<longueur; i++){
			System.out.print("indice"+"["+i+"]: ");
			tab[i] = scanf.nextInt();
		}
		
		//appel de la procedure parcours
		parcours(tab,true);
		System.out.println("");
		parcours(tab,false);
	}
	 * */
	
	//4
	/*public static void main(String[] args){
		int rep ;// reponse d'utilisateur
		int tab[]={};//un table utilisable par tous selon l'utilite
		do{
			System.out.println("1. Saisir le tableau.");
			System.out.println("2. Afficher le contenu de gauche a droite.");
			System.out.println("3. Afficher le contenu de droite a gauche.");
			System.out.println("0. Quitter.");
			System.out.println("___: ");
			rep = scanf.nextInt();
			
			switch(rep){
				case 1: {
					System.out.print("combien d'entiers voullez-vous saisisser?: ");
					int logTab = scanf.nextInt();
					int tab1[] = new int[logTab];
					tab = tab1;
					saisieTableau(tab);
				}break;
				case 2: {
					if(tab.length==0){
						System.out.println("le tableau n'est pas encore remplie!!!");
					}
					else{
						parcours(tab,true);
					}
				}break;
				case 3: {
					if(tab.length==0){
						System.out.println("le tableau n'est pas encore remplie!!!");
					}
					else{
						parcours(tab,false);
					}
				}break;
				default : ;
			}
			
		}while(rep != 0);
		
		//l'appel de la fonction saisieTableau()
		int tab1[] =saisieTableau();
		parcours(tab1,true);
	}*/
	//la fonction saisieTableau() 
	public int[] saisieTableau(){
		System.out.print("combien d'entiers voullez-vous saisisser?: ");
		int logTab = scanf.nextInt();
		int tab[] = new int[logTab];
		for(int i = 0; i<logTab; i++)
			tab[i] = scanf.nextInt();
		return tab;
	}
}
