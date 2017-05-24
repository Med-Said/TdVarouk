package tp6;

public class Tp6Exercice2 {

	//la fonction commission()
	public static float commission(float euro){
		if (euro>=1000f){
			return (euro*10/100);
		}
		else{
			if((euro*5/100)<20){
				return 20;
			}
			else{
				return (euro*5/100);
			}
		}
	}
	
	//la fonction cumul()
	
	public static int cumul(int i, int j){
		if(i<j){
			int ii=0;
			for(i=i; i<=j; i++){
				ii+=i;
			}
			return ii;
		}
		else{
			return -1;
		}
	}
	
	//la fonction valeurEuro()
	public static double valeurEuro(double fran){
		double conversion = (int) (fran/6.55957*100.0);
		return (conversion/100);
	}
	
	//la fonction estMultiple()
	public static boolean estMultiple(int i, int j){
		return ((i%j)==0);
	}
	
	public static void main(String[] args) {
		System.out.println("commission: "+commission(1000));
		System.out.println("cumul: "+cumul(4,5));
		System.out.println("cumul: "+cumul(7,5));
		System.out.println("valeurEuro: "+valeurEuro(74145.14521));
		System.out.println("estMultiple: "+estMultiple(7,5));
		System.out.println("estMultiple: "+estMultiple(25,5));
	}

}
