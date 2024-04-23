package TemaCurs7;

import java.util.Scanner;

//program care simuleaza validarea unui cod PIN
//utilizatorul introduce un PIN si programul il compara cu un PIN default 2244
//utilizatorul are 3 incercari
//daca incearca de 3 ori si PIN ul este gresit , programul va printa "Maximum attempts reached. Card blocked"
//pt fiecare incercare gresita, programul printeaza "Wrong PIN"
//daca PIN este valid , programul printeaza "Access granted"


public class ValidareCodPin {
	public static final int PinDefault = 2244;
	
	public static void main(String[] args) {
		int i = 0;
	    int PinIntrodus = 0;
	    
		
		for( i = 0 ; i <= 2; i++) {
			System.out.println("Introdu codul PIN: ");
			Scanner scan = new Scanner(System.in);
			PinIntrodus = scan.nextInt();
			if(PinIntrodus == PinDefault) {
				System.out.println("Access granted");
				break;
			}else {
				System.out.println("Wrong PIN");
				if(i == 2) {
					System.out.println("Maximum attempts reached. Card blocked");
					
				}
			}
		}
		
	System.out.println(i);
		
		
		
		
	}

}
