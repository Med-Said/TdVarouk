package tp8;

public class Tp8Exercice2 {
	
	public static void parcoursTab(int tab[]){
		for(int i = 0; i<tab.length; i++)
			System.out.println(tab[i]);
	}
	
	public static int[] sommeTableaux(int tab1[], int tab2[]){
		int somTab[] = new int[tab1.length];
		if(tab1.length == tab2.length){
			for(int i = 0; i<tab1.length; i++)
				somTab[i]=tab1[i]+tab2[i];
			return somTab;
		}
		else
			return null;
	}
	
	public static void main(String[] args){
		int tab1[] = {7,7,7};
		int tab2[] = {7,3,7};
		int tab3[] = {7,3,7,7};
		parcoursTab(sommeTableaux(tab1,tab2));
		System.out.println(sommeTableaux(tab1,tab3));
	}
}
