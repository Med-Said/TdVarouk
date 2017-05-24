package tp21;


import java.util.TreeSet;//pas tout a fait 

import tp19.Personne;

public class TableauTriePersonnes implements Comparable{
	TreeSet<Personne> personnes = new TreeSet<Personne>();
	
	public TableauTriePersonnes(){};
	
	public void ajouter(Personne p){
		personnes.add(p);
	}
	
	public String toStirng(){
		return toString();
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
