package tp8;

import tp7.Tp7Exercice;

public class Tp8Exercice1 {
	public static void miniMaxi(int[] tab){
		int maxi = tab[0],mini = tab[0];
		for(int i = 0; i<tab.length; i++){
			if(maxi<tab[i])
				maxi=tab[i];
		}
		System.out.println("la plus garande valeur du tableau est: "+ maxi);
			//la plus petite valeur
		for(int j = 0; j<tab.length; j++){
			if(mini>tab[j])
				mini=tab[j];
		}
		System.out.println("la plus petite valeur du tableau est: "+ mini);
	}
	
	//la fonction miniMaxi()
	
	public static String miniMaxi2(int[] tab){
		int maxi = tab[0],mini = tab[0];
		for(int i = 0; i<tab.length; i++){
			if(maxi<tab[i])
				maxi=tab[i];
		}
			//la plus petite valeur
		for(int j = 0; j<tab.length; j++){
			if(mini>tab[j])
				mini=tab[j];
		}
		
		return "max: " + maxi + "\nmin: " + mini;
	}
	
	//la fonction main()
	public static void main(String[] args){
		Tp7Exercice tp7exo = new Tp7Exercice();
		int tab[] = tp7exo.saisieTableau();
		
		miniMaxi(tab);
		System.out.println(miniMaxi2(tab));
	}
}