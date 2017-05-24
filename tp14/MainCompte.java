package tp14;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCompte {
	
	static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args) {
		Compte compte1 = new Compte("med",343);
		Compte compte2 = new Compte("sidi",743);
		
		compte1.crediter(70000000);
		compte2.crediter(300000);
		
		compte1.debiter(3000);
		
		System.out.println(compte1.getTitulaire());
		System.out.println(compte2.getSolde());
		
		//3
		ArrayList<Compte> comptes = new ArrayList<Compte>();
		int rep =0;
		do{
			System.out.println("1: ouvrir un nouveau compte");
			System.out.println("2: créditer un compte");//id=numCompte
			System.out.println("3: débiter un compte");//id=numCompte
			System.out.println("4: afficher le solde et le nom du titulaire d'un compte");//id=numcompte
			System.out.println("5: afficher le numéro de compte quand on connaît le nom du titulaire");
			System.out.println("6: afficher la somme et la moyenne des soldes de tous les comptes");
			System.out.println("7:  supprimer un compte existant ");
			System.out.println("0: quiter");
			rep = scanf.nextInt();
			
			switch(rep){
			case 1:{
				Compte c = new Compte();
				System.out.println("saisissez le nom du titulaire: ");
				c.setTitulaire(scanf.next());
				System.out.println("saisissez le numero du compte: ");
				c.setNumCompte(scanf.nextInt());
				comptes.add(c);
			}break;
			case 2:{
				System.out.println("saisissez le numero du compte: ");
				int id = scanf.nextInt();
				for(int i=0;i<comptes.size();i++){
					if(id==comptes.get(i).getNumCompte()){
						System.out.println("saisissez le montant: ");
						comptes.get(i).crediter(scanf.nextDouble());
					}break;
				}
			}break;
			case 3:{
				System.out.println("saisissez le numero du compte: ");
				int id = scanf.nextInt();
				for(int i=0;i<comptes.size();i++){
					if(id==comptes.get(i).getNumCompte()){
						System.out.println("saisissez le montant: ");
						comptes.get(i).debiter(scanf.nextDouble());
					}break;
				}
			}break;
			case 4:{
				System.out.println("saisissez le numero du compte: ");
				int id = scanf.nextInt();
				for(int i=0;i<comptes.size();i++){
					if(id==comptes.get(i).getNumCompte()){
						System.out.println("nom : " + comptes.get(i).getTitulaire());
						System.out.println("solde: " + comptes.get(i).getSolde());
					}break;
				}
			}break;
			case 5:{
				System.out.println("saisissez le nom du titulaire: ");
				String nom = scanf.next();
				for(int i =0;i<comptes.size();i++){
					if(nom.equalsIgnoreCase(comptes.get(i).getTitulaire())){
						 System.out.println("le numero du compte: " + comptes.get(i).getNumCompte());
					}
				}
			}break;
			case 6:{
				double somSolde =0;
				for(int i=0;i<comptes.size();i++){
					somSolde+=comptes.get(i).getSolde();
				}
				System.out.println("somme des soldes: " + somSolde);
				System.out.println("moyenne des soldes: " + somSolde/comptes.size());
			}break;
			case 7:{
				System.out.println("saisissez le numero du compte: ");
				int id = scanf.nextInt();
				for(int i=0;i<comptes.size();i++){
					if(id==comptes.get(i).getNumCompte()){
						if(comptes.get(i).getSolde()==0)
						comptes.remove(i);
						else{
							System.out.println("operation invalide, compte n'est pas vide!!!");
						}
					}break;
				}
			}break;
			default:{
				System.out.println("____-_-____");
			}
			}
		}while(rep!=0);
	}
	

}