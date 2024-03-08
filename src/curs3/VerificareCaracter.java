package curs3;

import java.util.Scanner;

/*
 * facem un program care verifica daca user ul a introdus caracter
 * 
 * daca a introdus litera, printam : caracterul e o litera 
 * daca nu a introdus litera, printam : caracterul nu este o litera 
 */
public class VerificareCaracter {

	char caracter;
	
	/*
	 * char 
	 * String
	 * televizor.charAt(5)==i
	 * 012345678
	 */
	
	public void askTheUserForACharacter() {
		System.out.println("Please enter a character:");
		Scanner scan = new Scanner(System.in);
		caracter = scan.next().charAt(0);
		}
	
	
	public void checkIfCharacterIsLetter() {
		
		askTheUserForACharacter();
		
		if (Character.isLetter(caracter)) {
			System.out.println("caracterul este o litera");
		}else {
			System.out.println("caracterul nu este o litera");
		}
		
	}
}
