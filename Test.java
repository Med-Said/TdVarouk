import java.util.ArrayList;
import java.util.Scanner;

import tp10.Tp10Exercice;


public class Test {

	
	 //estVide() : retourn true si tous les bateau d'un jour sont Coulés
	public static  boolean estVide(char joueur, char tab[][]){
		 int count=1;//on initialise a 1 ou lieu de 0 pour eviter la division par 0 a la suit
		 for(char sousTab[] : tab){
			 for(char c: sousTab){
				 if( ((c == ' ' || c == 'a') && joueur == 'b')    ||   ((c == ' ' || c == 'b') && joueur == 'a') ){
					 count++;
				 }
			 }
		 }
		 
		 /*expliquation de la methode estVide(): 
		  * la variable count sert a compter les cases vide si tous les case sont vide alors y a plus de bateaux
		  * comme que on compte tous les sous tableaux il va nous falloire de diviser le compteur sur tab.length 
		  * apres avoire retranger 1 car la variable est initialiser a 1 (pour eviter la division par 0)
		  * 
		  * cette methode doit etre utiliser apres l'utilisation (au moins une fois) de la methode afficher() */
		 
		//si (count-1)/tab.length == tab.length -> tous les bateaux sont Coulés
		 
		 return ((count-1)/tab.length == tab.length);
	 }
	
	
	public static boolean gagner(char j, char tab[][]){
		
		boolean ganTab = true;
		
		for(char sousTab[] : tab){
			boolean ganSousTab = true;
			if (j == 'a'){
				for(char c : sousTab){
					ganSousTab =  ganSousTab && (c==' ' || c=='A');//true si le tableau ne contien que les espaces ou la lettre representant le joueur adveseur
				}
				//true si le tableau donnee en parametre ne contien que les espaces ou la lettre representant le joueur adveseur, false sinon
				ganTab = ganTab && ganSousTab;
			}
			else if(j == 'b'){
				for(char c : sousTab){
					ganSousTab =  ganSousTab && (c==' ' || c=='B');
				}
				
				ganTab = ganTab && ganSousTab; 
			}
		}
		
		return ganTab;
	}
	
	
	public static void main(String[] args){
		
//		char tab[][] = {{'A','A','A'},{'B','B','B'}};
//		
//		char tab1[][] = {{' ',' ',' '},{' ',' ',' '}};
//		
//		char tab2[][] = {{'A','A','A'},{' ',' ',' '}};
//		
//		
//		char tab3[][] = {{'A','B','A'},{' ','B',' '}};
//		
//		char tab4[][] = {{'A',' ','A'},{' ','A',' '}};
//		
//		char tab5[][] = {{' ','B',' '},{' ','B',' '}};
//		
//		System.out.println(gagner('a',tab));
//		
//		System.out.println(gagner('b',tab1));
//		
//		System.out.println(gagner('a',tab2));
//		
//		System.out.println(gagner('b',tab2));
//		
//		System.out.println(gagner('a',tab3));
//		System.out.println(gagner('b',tab3));
//		
//		System.out.println("true" + gagner('a',tab4));
//		
//		System.out.println("true" + gagner('b',tab5));
//		
//		
		
		
		
		ArrayList al = new ArrayList();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.add("chain de caratere");
		al.add(3);
		al.trimToSize();
		String str = "Mohamed";
		System.out.println("str: " + str.length());
		System.out.println("str: " + str.charAt(6));
		System.out.println("array: " + al.size());
		System.out.println("array: " + al.isEmpty());
		
//		
//		String ch1 = "med";
//		System.out.println(ch1.equals("med"));
//		System.out.println(ch1.equalsIgnoreCase("Med"));
//		
//		System.out.println("compareto: " + "Zed".compareTo("aed"));
//		System.out.println(ch1.toUpperCase());
//		
//		String ch3 = ch1.toUpperCase();
//		System.out.println(ch1);
//		System.out.println(ch3);
//		
//		String s = String.valueOf(7);
//		System.out.println(s);
//		
//		
//		System.out.println(ch1.charAt(2));
//		
//		
//		
//		StringBuffer strbf = new StringBuffer(7);
//		
//		strbf.append("hello tous le 3alem");
//		System.out.println(strbf.capacity());
//		
//		strbf.insert(6,"med said m'bareck", 6, 9);
//	
//
//		System.out.println(strbf);
//		
//		String str = "   m   ";
//		System.out.println(str.trim());//efface les espace au debut et a la fin
//		
//		str = "med said";
//		System.out.println(str);
//		str.trim();
//		System.out.println(str.charAt(str.length()-1));
//		
		
	}
}
