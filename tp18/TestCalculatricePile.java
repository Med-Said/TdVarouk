package tp18;

public class TestCalculatricePile {

	public static void main(String[] args) {
		CalculatriceStack calpile = new CalculatriceStack();
		
		calpile.entrerValeur(1);
		calpile.entrerValeur(2);
		calpile.entrerValeur(3);
		calpile.entrerValeur(4);
		calpile.entrerValeur(5);
		calpile.entrerValeur(6);
		calpile.entrerValeur(7);
		
		calpile.ajouter();
		
		System.out.println(calpile.stack.valeurSommet());
		System.out.println(calpile.soustraire());
		System.out.println(calpile.diviser());
		System.out.println(calpile.diviser());
		System.out.println(calpile.soustraire());
		System.out.println(calpile.soustraire());
		System.out.println(calpile.soustraire());
	}

}
