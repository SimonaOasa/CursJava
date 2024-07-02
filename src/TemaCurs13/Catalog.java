package TemaCurs13;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	
	Elev elev;
	
	Map<String , Integer> eleve = new HashMap<>();

	void adagaElevInCatlog(Elev e) {
		eleve.put(e.nume, e.nota);
	}
	
	public void afiseazaCatalog() {
		System.out.println("Catalogul : ");
		
		for (Map.Entry<String, Integer> entry : eleve.entrySet() ) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue() );
			
		}
		
	}
	
	}
	
