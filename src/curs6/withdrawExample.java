package curs6;
import java.util.*;
/*
 * avem un sold de 1000 
 * vreau sa retrag din sold 
 * nu pot retrage toata suma sau mai mult decat am in sold 
 * vreau sa intreb user ul cat vrea sa retraga si fac asta pana introduce o valoare valida 
 * 
 */
public class withdrawExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println ("Ce suma vrei sa retragi?");
		
		int sold = 1000;
		int sumaRetrasa = scan.nextInt();
	//	for (int i=1; i < sold-1; i++) {		
		//}
		
		while (sumaRetrasa <1 || sumaRetrasa >=sold  ) {
			
			System.out.println ("Suma indisponibila. Introdu alta suma");
			sumaRetrasa = scan.nextInt();
		}
		
		System.out.println("Va rugam ridicati banii! ");
		System.out.println("Noul sold este " + (sold-sumaRetrasa));
        scan.close();
	
	 //System.out.println("Mai vrei si alta operatiune?");
	//	boolean raspuns = scan.nextBoolean();
		
	//	while (raspuns) {
	//		if () {
				
		//	}else {
				
		//	}
			
	//		System.out.println("Mai vrei si alta operatiune?");
	//		raspuns = scan.nextBoolean(); 
			
		}
		
	}

