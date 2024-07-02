package TemaCurs13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elev elev1 = new Elev("ion", 4);
		
		Elev elev2 = new Elev("gheorghe", 4);
		
		Elev elev3 = new Elev("vasile", 4);
		
		Catalog catalog = new Catalog();
		
		catalog.adagaElevInCatlog(elev1);
		
		catalog.adagaElevInCatlog(elev2);
		
		catalog.adagaElevInCatlog(elev3);
		
		Scanner scanner = new Scanner (System.in);
		
		String nume = scanner.nextLine();
		
		int nota = scanner.nextInt();
		
		Elev elev = new Elev(nume, nota);
		
		catalog.afiseazaCatalog();
		
		

	}

}
