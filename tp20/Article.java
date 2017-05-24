package tp20;

public class Article {
	protected String cote;
	protected String titre;
	protected boolean emprunte;
	
	public Article(String code,String titre,boolean emprunte){
		this.cote = code;this.titre = titre;this.emprunte = emprunte;
	}

	public String getCode() {
		return cote;
	}

	public String getTitre() {
		return titre;
	}

	public boolean isEmprunte() {
		return emprunte;
	}
}
