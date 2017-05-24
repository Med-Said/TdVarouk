package tp20;

public class Livre extends Article{
	protected String auteur;
	protected int nbrPages;
	
	public Livre(String code,String titre,boolean emprunte,String auteur,int nbrPages){
		super(code,titre,emprunte);
		this.auteur = auteur;this.nbrPages = nbrPages;
	}
	
	public String toString(){
		return "Titre: " + super.titre + "\tAuteur: " + this.auteur + "\tNombre de pages: " + this.nbrPages; 
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrPages() {
		return nbrPages;
	}

	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}
}
