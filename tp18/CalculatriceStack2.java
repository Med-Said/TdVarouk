package tp18;

import java.util.Stack;

public class CalculatriceStack2 {
	Stack<Double> sck = new Stack<Double>();
	double res;
	
	public void entrerValeur(double d){
		sck.push(d);
	}
	
	public  String toString(){
		return String.valueOf(sck.peek());
	}
	
	public double ajouter(){
		res =  sck.pop()+sck.pop();
		sck.push(res);
		return res;
	}
	
	public double soustraire(){
		res =  sck.pop()-sck.pop();
		sck.push(res);
		return res;
	}
	
	public double multiplier(){
		res =  sck.pop()*sck.pop();
		sck.push(res);
		return res;
	}
	
	public double diviser(){
		res =  sck.pop()/sck.pop();
		sck.push(res);
		return res;//division par zero !!!
	}
}
