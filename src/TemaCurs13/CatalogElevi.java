package TemaCurs13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatalogElevi {

	Map<String , Integer> elevi = new HashMap<>();
	

public void adaugaNota(String nume, int nota) {
	
	//if (elevi.containsKey(nume) = false ) {
	if (!elevi.containsKey(nume)) {	
		elevi.put(nume, nota);
		System.out.println("Nu aveai nota, ti-am trecut acum!");
		afiseazaCatalog();
	} else {
		int notaVeche = elevi.get(nume);
		if (nota > notaVeche) {
			elevi.put(nume, nota);
			System.out.println("Aveai nota " + notaVeche + " si ti-am trecut nota " + nota);
			
		} else {
			System.out.println("Nu ai nevoie de alta nota!");
//		} else {
//			System.out.println("Ai aceeasi nota!");
//		}
		}
		afiseazaCatalog();
	}
	
  }

public void afiseazaCatalog() {
	System.out.println("Catalogul : ");
	
	for (Map.Entry<String, Integer> entry : elevi.entrySet() ) {
		
		System.out.println(entry.getKey() + " : " + entry.getValue() );
		
	}
	
}

public static void main (String[] args) {
	
	CatalogElevi catalog = new CatalogElevi();
	
	Scanner scanner = new Scanner (System.in);
	
	while (true) {
		
		System.out.println("Introdu numele elevului (sau 'gata' pt a termina interogarea) : ");
		
		String nume = scanner.nextLine();
		
		if (nume.equals("gata")) {
			break;
		}
		
		System.out.println("Introdu nota elevului " + nume + " : ");
		int nota = scanner.nextInt();
		scanner.nextLine();
		
		catalog.adaugaNota(nume, nota);
		
	   
		
	}
	
	
	scanner.close();
	catalog.afiseazaCatalog();
  }
	


}


