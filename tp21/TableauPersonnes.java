package tp21;

import java.util.ArrayList;

import tp19.Personne;

public class TableauPersonnes {
	ArrayList<Personne> personnes = new ArrayList<Personne>();
	
	public TableauPersonnes(){};
	
	public void ajouter(Personne p){
		personnes.add(p);
	}
	
	public String toStirng(){
		return toString();
	}
}
