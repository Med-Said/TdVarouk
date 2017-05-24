package tp20;

public class Cd extends Article{
	protected String interprete;
	protected double duree;
	
	public Cd(String code,String titre,boolean emprunte,String interprete,double duree){
		super(code,titre,emprunte);
		this.interprete = interprete;this.duree=duree;
	}
	
	public String toString(){
		return "Titre: " + super.titre + "\tInterprete: " + this.interprete + "\tDuree: " + this.duree;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}
}
