package tp17;

import java.util.Stack;

public class StackDeReels {
	//on peut stocker pulusier type de variable dans le stack
	Stack<Double> stack = new  Stack<Double>();
	
	public double valeurSommet(){
		return  stack.peek().doubleValue();
	}
	
	public void empiler(double d){
		stack.push(d);//add object
	}
	
	public double depiler(){
		if(stack.size()==1){
			System.out.println("un seule element disponible ");
			return 0;
		}else{
			double res = this.stack.peek();
			this.stack.pop();
			return res;	
		}
	}
	
	public boolean estVide(){
		return stack.isEmpty();
	}
	
	public boolean estPleine(){
		return false;
		
	}
	
	public static void main(String[] args) {
		StackDeReels stackR = new StackDeReels();
		stackR.empiler(3);
		System.out.println(stackR.estPleine());
		System.out.println(stackR.valeurSommet());
	}

}
