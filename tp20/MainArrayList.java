package tp20;

public class MainArrayList {
	public static void main(String[] args) {
		MediathequeArrayList mdt = new MediathequeArrayList();
		
		
		String[] auteurs = {"auteru1","auteur2","auteur3"};
		mdt.ajouterArticle(new Video("34a","what do you think when you look at me",false,"Daila Mojahid",auteurs,15.43));
		mdt.ajouterArticle(new Livre("re33r","just do it",false,"Omar",321));
		mdt.ajouterArticle(new Livre("ksd2","why note",true,"Sidi Med",31));
		mdt.ajouterArticle(new Livre("jfd3","untel when!!!",false,"Hamed",45));
		
		System.out.println(mdt.getNbrArticles());
		Article art = mdt.getArticle("re33r");
		
		System.out.println(art.isEmprunte());
		
		mdt.voirDetailArticle("re33r");
	}
}
