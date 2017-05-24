package tp11ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void afficheList(ArrayList<String> array){//b
		for(int i =0;i<array.size();i++){
			System.out.print(array.get(i) + "\t");
		}
	}
	
	public static int compteTextesCommencantPar(ArrayList<String> array,char c){//c
		int res=0;//le resultat a retourner
		for(int i = 0; i<array.size();i++){//String.valueOf(c): pour convertire char vers String
			if(array.get(i).trim().startsWith(String.valueOf(c))){//si la chaine de position i commence par la char c (trim supprime les espace au debut et a la fin
				res++;
			}
		}
		return res;
	}
	
	 public static void supprimeTextesSeTerminantPar_e(ArrayList<String> array){//d
		 for(int i=0;i <array.size();i++){
			 if(  array.get(i).trim().charAt(array.get(i).trim().length()-1) == 'e'  )
				 array.remove(i);
		 }
	 }
	 
	 public static boolean testNomHyppolite(ArrayList<String> array){//e
		 
		 return array.contains("Hyppolite");
	 }
	 
	 public static void nameToUpper(ArrayList<String> array){//f
		 for(int i =0;i <array.size();i++){
			 array.set(i, array.get(i).toUpperCase());//les chaine sont emmuable
		 }
	 }
	 
	 public static void insererTrie(ArrayList<String> array, String nom){//g,(le tableau est supposé trié)
		 for(int i=0; i<array.size();i++){
			 if(nom.compareToIgnoreCase(array.get(i))<=0){
				 array.add(i, nom);
				 break;
			 }
			 if(nom.compareToIgnoreCase(array.get(array.size()-1))>0)
				 array.add(nom);break;
		 }
	 }
	 
	 public static double nombreMoyenneDeChar(ArrayList<String> array){//h
		 int somCharDeNom=0;
		 if(array.size() == 0){
			 System.out.println("liste vide !!!");
			 return 0.0;
		 }else{
			 for(int i = 0; i<array.size();i++){
				 somCharDeNom += array.get(i).length();
			 }
			 return somCharDeNom/array.size(); 
		 }
	 }
	
	public static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> noms; 
		String nom;
		int i;
		//debut,la traduciton d'algorithme
//		noms = new ArrayList<String>();
//		System.out.println("entrez le nom d'une personne (tapez \"stop\" pour arrêter): ");
//		nom = scanf.next();
//		while(!nom.equalsIgnoreCase("stop")){
//			noms.add(nom);
//			System.out.println("entrez le nom d'une personne (tapez \"stop\" pour arrêter): ");
//			nom = scanf.nextLine();
//		}
		
		noms = new ArrayList<String>();//mon propre algo :)
		nom = " ";
		while(!nom.equalsIgnoreCase("stop")){
			System.out.println("entrez le nom d'une personne (tapez \"stop\" pour arrêter): ");
			nom = scanf.nextLine();
			if(!nom.equalsIgnoreCase("stop"))
			noms.add(nom);
		};
		
//		for(i=0;i<noms.size();i++){
//			System.out.print(noms.get(i) + "\t");
//		}
		afficheList(noms);
		System.out.println();
		
		System.out.println(compteTextesCommencantPar(noms,'f'));
		System.out.println(noms.size());
		
		System.out.println("testNomHyppolite: " + testNomHyppolite(noms));
		
		supprimeTextesSeTerminantPar_e(noms);
		afficheList(noms);
		System.out.println();
		System.out.println(noms.size());
		
		nameToUpper(noms);
		afficheList(noms);
		System.out.println();
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("a");test.add("b");test.add("d");test.add("e");
		insererTrie(test,"c");//pour
		insererTrie(test,"f");
		
		afficheList(test);
		System.out.println();
		
		System.out.println("nombreMoyenneDeChar: " + nombreMoyenneDeChar(noms));
	}
}