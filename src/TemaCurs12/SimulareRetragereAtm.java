package TemaCurs12;

import java.util.Scanner;

public class SimulareRetragereAtm {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println ("Ce suma vrei sa retragi?");  
		
		int sold = 1000;
		int sumaRetrasa = scan.nextInt();
		
		System.out.println("Hi Dragos");
		System.out.println("Please enter the amount to withdraw: ");

    while (sumaRetrasa <1 || sumaRetrasa >=sold  ) {
			
			System.out.println ("Suma indisponibila. Introdu alta suma");
			sumaRetrasa = scan.nextInt();
		}
		
	}

}
