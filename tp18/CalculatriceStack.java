package tp18;

import tp17.StackDeReels;

public class CalculatriceStack {
	StackDeReels stack = new StackDeReels();
	double res;
	
	public CalculatriceStack(){
		this.res = 0;
	}
	
	public void entrerValeur(double d){
		stack.empiler(d);
	}
	
	public  String toString(){
		return String.valueOf(stack.valeurSommet());
	}
	
	public double ajouter(){
		res =  stack.depiler()+stack.depiler();
		stack.empiler(res);
		return res;
	}
	
	public double soustraire(){
		res =  stack.depiler()-stack.depiler();
		stack.empiler(res);
		return res;
	}
	
	public double multiplier(){
		res =  stack.depiler()*stack.depiler();
		stack.empiler(res);
		return res;
	}
	
	public double diviser(){
		res =  stack.depiler()/stack.depiler();
		stack.empiler(res);
		return res;//division par zero !!!
	}
}
