package tp20;

public class Main {
	public static void main(String[] args) {
		Mediatheque mdt = new Mediatheque();
		
		
		mdt.creeTabArticle(7);
		
		mdt.ajouterArticle(new Livre("re33r","just do it",false,"Omar",321));
		mdt.ajouterArticle(new Livre("ksd2","why note",true,"Sidi Med",31));
		mdt.ajouterArticle(new Livre("jfd3","untel when!!!",false,"Hamed",45));
		
		System.out.println(mdt.getNbrArticles());
		Article art = mdt.getArticle("re33r");
		
		System.out.println(art.isEmprunte());
		
		mdt.voirDetailArticle("re33r");
	}
}
