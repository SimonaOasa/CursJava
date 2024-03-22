package curs7;
import java.util.*;
/*
 * facem un joc de zaruri in care avem urmatoarele reguli 
 * daca user ul da in total 2,6,11 -->pierde jocul --> facem exit 
 * daca userul da in total 8 sau 12 --> castiga jocul --> facem exit 
 * daca userul da in total 3,9 --> repeta automat aruncarea
 * daca da orice alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea inca o data 
 * raspunsul trebuie sa fie de forma yes, no si mapam in spate pe true - false 
 * --daca raspunde nu , facem exit 
 * --daca raspunde da, o luam de la capat 
 */

public class DiceGame {

	public static void main(String[] args) {
		
		boolean incercare=true;
		
		int dice = (int) (Math.random() * 6 + 1);
		int dice2=(int) (Math.random()*6+1);
		int total = dice + dice2;
		
		
		while (incercare) {
			
			if (total==2 || total==6 || total==11) {
				System.out.println("Imi pare rau! Ai dat " + total + "Ai pierdut jocul!");
				break;
			}else if (total==8 ||total==12) {
				System.out.println("Felicitari! Ai dat " + total + "Ai castigat jocul!");
				break;
				
			}else if (total==3 || total==9) {
				System.out.println(" Ai dat " + total + "Automat mai dai o data!");
				continue;
			}else {
				
				System.out.println("Ai dat " + total );
				
				boolean continuare = true; 
				while (continuare) {
					System.out.println("Mai vrei sa continui jocul ?");
					Scanner scan = new Scanner(System.in);
					//String raspuns = scan.next().equalsIgnoreCase("yes") ? 
					String raspuns = scan.next();
					
					if (raspuns.equals("yes")) {
						incercare = true ; 
						continuare=false ;
					}else if (raspuns.equals("no")) {
						incercare = false; 
						continuare=false;
					}else {
						System.out.println("Raspuns invalid. Raspunde cu Yes sau No ");
						continuare = true;
					}
				//	scan.close();
				}
				
				
				/*
				System.out.println("Mai vrei sa continui jocul ?");
				Scanner scan = new Scanner(System.in);
				//String raspuns = scan.next().equalsIgnoreCase("yes") ? 
				String raspuns = scan.next();
				
				if (raspuns.equals("yes")) {
					incercare = true ; 
					continue;
				}else if (raspuns.equals("no")) {
					incercare = false; 
					
				}else {
					System.out.println("Raspuns invalid. Raspunde cu Yes sau No ");
				}*/
				
			}
			
		}

	}

}
