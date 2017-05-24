package tp21;

import tp19.Personne;

public class Main {
	public static void main(String[] args) {
		Personne p1 =new Personne("med",7);
		Personne p2 = new Personne("bechir",11);
		Personne p3 =new Personne("jean",5);
		Personne p4 = new Personne("liza",17);
		
		TableauPersonnes tabperso = new TableauPersonnes();
		tabperso.ajouter(p1);tabperso.ajouter(p2);tabperso.ajouter(p3);
		tabperso.ajouter(p4);
		
		for(int i=0;i<tabperso.personnes.size();i++){
			System.out.println(tabperso.personnes.get(i).toString());
		}
	}
}
