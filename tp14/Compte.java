package tp14;

public class Compte {
	private String titulaire;
	private int numCompte;
	private double solde;
	
	public Compte(String titulaire,int numCompte){
		this.titulaire = titulaire;
		this.numCompte = numCompte;
		this.solde = 0.0d;
	}
	
	public Compte() {//3
		this.solde = 0;
	}

	public void crediter(double montant){
		this.solde+=montant;
	}
	
	public void debiter(double montant){
		this.solde-=montant;//on peut verifier si le solde est !=0
	}

	public String getTitulaire() {
		return titulaire;
	}

	public double getSolde() {
		return solde;
	}
	
	//compte est à découvert???
	//3
	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public int getNumCompte() {
		return numCompte;
	}
	
	//pour tp15
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
