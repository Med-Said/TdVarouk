package tp18;

import tp17.PileDeReels;

public class CalculatricePile {
	double res;
	
	PileDeReels pile = new PileDeReels(7);
	public CalculatricePile(){
		this.res = 0;
	}
	
	public void entrerValeur(double d){
		pile.empiler(d);
	}
	
	public  String toString(){
		return String.valueOf(pile.valeurSommet());
	}
	
	public double ajouter(){
		res =  pile.depiler()+pile.depiler();
		pile.empiler(res);
		return res;
	}
	
	public double soustraire(){
		res =  pile.depiler()-pile.depiler();
		pile.empiler(res);
		return res;
	}
	
	public double multiplier(){
		res =  pile.depiler()*pile.depiler();
		pile.empiler(res);
		return res;
	}
	
	public double diviser(){
		res =  pile.depiler()/pile.depiler();
		pile.empiler(res);
		return res;//division par zero !!!
	}
}
