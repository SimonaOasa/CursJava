package TemaCurs8;

import java.util.Scanner;


//program care afiseaza numele lunii
//se intreaba utilizatorul numarul lunii
//folosim array pt numele lunilor 

public class AfiseazaNumeLunaDoWhile {

	public static void main(String[] args) {
		
		int nrIntrodus = 0;
		System.out.println("Introdu luna : ");
		Scanner scan = new Scanner(System.in);
		nrIntrodus = scan.nextInt();
		boolean isValid = true;
		String[] luna = new String[13];
		//while(isValid == true) {
		if(nrIntrodus < 1 || nrIntrodus > 12 ) {
			
		System.out.println(nrIntrodus); 

	    
		do {
		  System.out.println("Mai introdu o data luna: ");
		  nrIntrodus = scan.nextInt();
		}while(nrIntrodus < 1 || nrIntrodus > 12);
		
		
		} //else {
			
			luna[1] = "Ianuarie";
			luna[2] ="Februarie";
			luna[3] = "Martie";
			luna[4] ="Aprilie";
			luna[5] = "Mai";
			luna[6] ="Iunie";
			luna[7] = "Iulie";
			luna[8] ="August";
			luna[9] = "Septembrie";
			luna[10] ="Octombrie";
			luna[11] = "Noiembrie";
			luna[12] ="Decembrie";
			
			System.out.println(luna[nrIntrodus]);
			isValid = false;
	//	}
		
	//	}
		
//		nrIntrodus<1 si >12 
//		nr invalid , introdu alt nr 
//		
//		if(nrIntrodus < 1 && nrIntrodus > 12 ) {
//			System.out.println("Introdu luna : ");
//		}
		
	/*	for (i=1; i++; i<=12) {
			if (nrintrod == i) {
				System.out.println(luna[i]);
			}
		}
		
		
		boolean lunavalida = true;
		do {
			System.out.println("Introdu luna : ");
			Scanner.NextInt();
			case 1 : 
				System.out.println("");
		}while lunavalida;*/

	}

}
