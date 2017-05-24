package tp20;

import java.util.ArrayList;

public class MediathequeArrayList {//add(),remove(),clear()....
	protected ArrayList<Article> array = new ArrayList<Article>();
	
	public void ajouterArticle(Article a){
		array.add(a);
	}
	
	public void emprunterArticle(String cote){
		for(int i=0;i<array.size();i++){
			if(cote.equalsIgnoreCase(array.get(i).cote)){
				array.get(i).emprunte=true;break;	
			}
		}
	}
	
	public void rendreArticle(String cote){
		for(int i=0;i<array.size();i++){
			if(cote.equalsIgnoreCase(array.get(i).cote)){
				array.get(i).emprunte = false;
			}
		}
	}

	public int getNbrArticles() {
		return array.size();
	}
	
	public void listerArticles(){
		for(int i =0;i<array.size();i++){
			System.out.println(array.get(i).toString());
		}
	}
	
	public void voirDetailArticle(String cote){
		for(int i =0;i<array.size();i++){
			if(cote.equalsIgnoreCase(array.get(i).cote)){
				System.out.println("cote: " + array.get(i).cote);
				System.out.println("emprunte: " + array.get(i).emprunte);
				System.out.println(array.get(i).toString());
			}
		}
	}
	
	public Article getArticle(String cote){
		Article res = null;
		for(int i =0;i<array.size();i++){
			if(cote.equalsIgnoreCase(array.get(i).cote)){
				res = array.get(i);break;
			}else{
				res = null;
			}
		}
		return res;
	}
}
