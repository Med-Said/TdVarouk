package tp20;

public class Video extends Article{
	protected String realisateur;
	protected String[] listAuteurs;
	protected double duree;
	
	public Video(String code,String titre,boolean emprunte,String realisateur,String[] listAuteurs,double duree){
		super(code,titre,emprunte);
		this.realisateur = realisateur;this.listAuteurs = listAuteurs;this.duree = duree;
	}
	
	public String toString(){
		
		System.out.println("Liste d'Auteurs");
		for(int i=0;i<listAuteurs.length;i++){
			System.out.println(listAuteurs[i]);
		}
		return "Titre: " + super.titre + "\tRealisateur: " + this.realisateur + "\tDuree: " + this.duree; 
	}
	
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String[] getListAuteurs() {
		return listAuteurs;
	}
	public void setListAuteurs(String[] listAuteurs) {
		this.listAuteurs = listAuteurs;
	}
	public double getDuree() {
		return duree;
	}
	public void setDuree(double duree) {
		this.duree = duree;
	}
	
	
}
