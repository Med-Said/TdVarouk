package tp15;

import java.util.ArrayList;
import java.util.Scanner;

import tp14.Compte;


public class MainBanque {
	
	public static Scanner scanf = new Scanner(System.in);
	public static void main(String[] args) {
//		ArrayList<Compte> comptes = new ArrayList<Compte>();
		Banque rimB = new Banque(new ArrayList<Compte>() );
		
		
		int rep = 0;
		do{
			System.out.println("1: ouvrir un nouveau compte");
			System.out.println("2: créditer un compte");//id=numCompte
			System.out.println("3: débiter un compte");//id=numCompte
			System.out.println("4: afficher le solde et le nom du titulaire d'un compte");//id=numcompte
			System.out.println("5: afficher le numéro de compte quand on connaît le nom du titulaire");
			System.out.println("6: afficher la somme et la moyenne des soldes de tous les comptes");
			System.out.println("7:  supprimer un compte existant ");
			System.out.println("pour compte à découvert ???");
			System.out.println("0: quiter");
			System.out.print(" : ");
			rep = scanf.nextInt();
			
			switch(rep){
			case 1:{
				System.out.println("saisissez le nom du titulaire: ");
				String titulaire = scanf.next();
				System.out.println("saisissez le numero du compte: ");
				int num = scanf.nextInt();
				rimB.ouvrireCompte(titulaire,num);
			}break;
			case 2:{
				System.out.println("saisissez le numero du compte: ");
				int num = scanf.nextInt();
				System.out.println("saisissez le montant: ");
				double mon = scanf.nextDouble();
				rimB.crediter(num,mon);
			}break;
			case 3:{
				System.out.println("saisissez le numero du compte: ");
				int num = scanf.nextInt();
				System.out.println("saisissez le montant: ");
				double mon = scanf.nextDouble();
				rimB.debiter(num,mon);
			}break;
			case 4:{
				System.out.println("saisissez le numero du compte: ");
				int num = scanf.nextInt();
				rimB.afficheSoldeEtNomTitulaire(num);
			}break;
			case 5:{
				System.out.println("saisissez le nome du titulaire: ");
				String nom = scanf.next();
				rimB.afficheNumCompte(nom);
			}break;
			case 6:{
				rimB.afficheSomEtMoy();
			}break;
			case 7:{
				System.out.println("saisissez le numero du compte: ");
				int num = scanf.nextInt();
				rimB.supprimerCompte(num);
			}break;
			default:System.out.println("________ :) ___");
			}
		}while(rep!=0);
	}
}
