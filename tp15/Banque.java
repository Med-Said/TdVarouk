package tp15;
import java.util.ArrayList;
import java.util.Scanner;

import tp14.Compte;

public class Banque {
	private ArrayList<Compte> comptes;
	
	Scanner scanf = new Scanner(System.in);
	
	public Banque(ArrayList<Compte> comptes){
		this.comptes = comptes;
	}
	
	public void ouvrireCompte(String nomTitulaire,int numCompte){
		Compte c = new Compte();
		c.setTitulaire(nomTitulaire);
		c.setNumCompte(numCompte);
		comptes.add(c);
	}
	
	public void crediter(int numCompte,double montant){
//		for(int i =0;i<comptes.size();i++){
//			if(comptes.get(i).getNumCompte()==numCompte){
//				comptes.get(i).setSolde(comptes.get(i).getSolde()+montant);
//			}break;
//		}
		Compte c = chercherCompte(numCompte);
		c.setSolde(c.getSolde()+montant);
	}
	
	public void debiter(int numCompte,double montant){
//		for(int i =0;i<comptes.size();i++){
//			if(comptes.get(i).getNumCompte()==numCompte){
//				comptes.get(i).setSolde(comptes.get(i).getSolde()- montant);
//			}break;
//		}
		Compte c = chercherCompte(numCompte);
		c.setSolde(c.getSolde()- montant);
	}
	
	public void afficheSoldeEtNomTitulaire(int numCompte){
//		for(int i=0;i<comptes.size();i++){
//			if(comptes.get(i).getNumCompte()==numCompte){
//				System.out.println("Solde: " + comptes.get(i).getSolde());
//				System.out.println("Nome Titulaire: " + comptes.get(i).getTitulaire());
//			}
//		}
		
		Compte c = chercherCompte(numCompte);
		System.out.println("Solde: " + c.getSolde());
		System.out.println("Nome Titulaire: " + c.getTitulaire());
	}
	
	public void afficheNumCompte(String nomTitulaire){
		for(int i=0;i<comptes.size();i++){
			if(nomTitulaire.equalsIgnoreCase(comptes.get(i).getTitulaire())){
				System.out.println("Le numero de compte: "+comptes.get(i).getNumCompte());
			}
		}
	}
	
	public void afficheSomEtMoy(){
		double som=0;
		for(int i=0;i<comptes.size();i++){
			som+=comptes.get(i).getSolde();
			System.out.println("Somme: " + som);
			System.out.println("Moyenne: " + som/comptes.size());
		}
	}
	
	//les numéros des comptes qui sont à découvert???
	
	public void supprimerCompte(int numCompte){
//		for(int i=0;i<comptes.size();i++){
//			if(numCompte==comptes.get(i).getNumCompte() && comptes.get(i).getSolde()==0){
//				comptes.remove(i);
//			}
//		}
		
		Compte c = chercherCompte(numCompte);
		if(c.getSolde()==0)
			comptes.remove(c);
	}
	
	//2
			private Compte chercherCompte(int num){
				System.out.println("saisissez le numero du compte: ");
				Compte c = null;
				for(int i=0;i<comptes.size();i++){
					if(comptes.get(i).getNumCompte()==num){
						 c =  comptes.get(i);
					}break;
//					else{
//						c = new Compte(" ",0);//compte vide
//					}
				}
				return c;
			}
			
}
