package tp17;

import java.util.ArrayList;

public class PileDeReels {
	double sommet;
	ArrayList<Double> elements;
	int hauteurMax = 0;
	
	public PileDeReels(int hauteruMax){
		this.hauteurMax = hauteruMax;
		elements = new ArrayList<Double>(hauteruMax);
	}
	
	public double valeurSommet(){
		double res = this.elements.get(this.elements.size()-1);
		this.sommet = res;
		return res;
	}
	
	public void empiler(double d){
		this.elements.add(d);
	}
	
	public double  depiler(){
		if(elements.size()==1){
			System.out.println("un seule element disponible ");
			return 0;//
		}else{
			double res = this.elements.get(this.elements.size()-1).doubleValue();
			this.elements.remove(this.elements.get(this.elements.size()-1));//
			return res;	
		}
	}
	
	public boolean estVide(){
		return this.elements.isEmpty();
	}
	
	public boolean estPleine(){
		if(this.elements.size()>this.hauteurMax)
			System.out.println("vous depassez la taille");
		return this.elements.size() == this.hauteurMax;
	}
	
	public static void main(String[] args){
		PileDeReels pile = new PileDeReels(3);
		System.out.println(pile.estVide());
		pile.empiler(7.3);
		pile.depiler();
		pile.empiler(3.2);
		pile.empiler(9.2);
		System.out.println(pile.estPleine());
		pile.depiler();
		System.out.println(pile.estPleine());
		pile.empiler(43.43);
		System.out.println(pile.estPleine());
		pile.empiler(43.43);
		System.out.println(pile.estPleine());
	}
}
