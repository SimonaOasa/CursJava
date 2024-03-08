package curs3;
/*
 * program care verifica daca suntem intr o zi lucratoare sau in week end 
 * daca suntem in zi lucratoare, printam : Este zi lucratoare!
 * daca suntem in week end , printam : Este weekend!
 * daca nu este o zi valida, printam : Ziua nu exista!
 * 
 */

import java.util.Scanner;

public class VerificareZiASaptamanii {
  
	int zi;
	
	public void askTheUserForADay() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		}
	
	public void checkWeekday() {
		
		askTheUserForADay();
		
		if (zi>=1 && zi<=5) {
		    System.out.println("It's a working day!");
		}	else if (zi==6 || zi==7) {
			System.out.println("It's weekend!");
		} else {
			System.out.println("Day not valid");
		}
		
	}
	
}
