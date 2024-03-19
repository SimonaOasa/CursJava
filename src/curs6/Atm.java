package curs6;
import java.util.*;
/*
 * program care simuleaza un ATM
 * are o singura functionalitate de retragere bani (retrageri multiple)
 * nu permite retragerea unei sume mai mari decat soldul
 * intreaba user ul dupa fiecare operatiune daca vrea sa continue sau face exit 
 * 
 */
public class Atm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sold = 2500;
		System.out.println ("Ce suma vrei sa retragi?");
		int sumaRetrasa = scan.nextInt();
		boolean retragere = true;
		
		while (retragere) {
			
			if (sumaRetrasa < 1 || sumaRetrasa>=sold) {
				System.out.println("Suma indisponibila . Introdu alta suma : ");
				sumaRetrasa=scan.nextInt();
			}else {
				System.out.println("Va rugam ridicati banii ");
				System.out.println("Noul sold este " + (sold-sumaRetrasa));
				sold=sold-sumaRetrasa;
				
			}
			
			System.out.println("vrei sa continui ? ");
			retragere=scan.nextBoolean();
		}
		System.out.println("la revedere");
		scan.close();
	}

}
