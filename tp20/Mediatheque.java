package tp20;

public class Mediatheque {
	protected Article[] tabArticle;
	protected int nbrArticles=0;
	
	public void creeTabArticle(int taille){
		tabArticle = new Article[taille];
	}
	
	public void ajouterArticle(Article a){
		nbrArticles++;
		if(nbrArticles<tabArticle.length)
			tabArticle[nbrArticles-1]=a;
		else{
			System.out.println("operation invalid,tableau plein !!!");
		}
	}
	
	public void emprunterArticle(String cote){
		for(int i=0;i<tabArticle.length;i++){
			if(cote.equalsIgnoreCase(tabArticle[i].cote)){
				tabArticle[i].emprunte=true;break;	
			}
		}
	}
	
	public void rendreArticle(String cote){
		for(int i=0;i<tabArticle.length;i++){
			if(cote.equalsIgnoreCase(tabArticle[i].cote)){
				tabArticle[i].emprunte = false;
			}
		}
	}

	public int getNbrArticles() {
		return nbrArticles;
	}
	
	public void listerArticles(){
		for(int i =0;i<tabArticle.length;i++){
			System.out.println(tabArticle[i].toString());
		}
	}
	
	public void voirDetailArticle(String cote){
		for(int i =0;i<tabArticle.length;i++){
			if(cote.equalsIgnoreCase(tabArticle[i].cote)){
				System.out.println("cote: " + tabArticle[i].cote);
				System.out.println("emprunte: " + tabArticle[i].emprunte);
				System.out.println(tabArticle[i].toString());
			}break;
		}
	}
	
	public Article getArticle(String cote){
		Article res = null;
		for(int i =0;i<tabArticle.length;i++){
			if(cote.equalsIgnoreCase(tabArticle[i].cote)){
				res = tabArticle[i];break;
			}else{
				res = null;
			}
		}
		return res;
	}
	
	
}
