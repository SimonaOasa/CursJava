package curs9;
import java.util.*;
/*
 * citim de la tastatura o litera 
 * si verificam daca este consoana sau vocala 
 * 
 * 
 */
public class IsCharVowel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introdu o litera : ");
		char litera = scan.next().charAt(0);

		/*String text = "masina";
		System.out.println(text.toUpperCase());
		litera = Character.toUpperCase(litera);
		System.out.println(litera);*/
		
		//aeiouAEIOU
		
		if (litera=='A' || litera =='E' ||litera =='I' ||litera =='O'||litera=='U') {
			System.out.println("Este vocala");
		}else {
			System.out.println("Este consoana");
		}
		
		System.out.println("-------------------------");
		
		switch (litera) {
		   case 'A' : 
		   case 'E' : 
		   case 'I' : 
		   case 'O' : 
		   case 'U' :
			   System.out.println("Este vocala");
			   break;
		   default : 	   
			   System.out.println("Este consoana");
			   
		
		}
		
		System.out.println("-------------------------");
		
		switch (litera) {
		case 'A' , 'E', 'I', 'O', 'U' -> System.out.println("Este vocala");
		default  -> System.out.println("Este consoana");
		
		}
		
		 scan.close();
	}

}
