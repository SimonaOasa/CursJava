package temaCurs9;

import java.util.Scanner;

public class Angajat {

	public static void main(String[] args) {
	
		//program de acordat bonusuri
		 int bonus = 0;
		 Scanner scan = new Scanner (System.in);
	     System.out.println("Introdu an vechime : ");
	     int anVechime = scan.nextInt();
	     System.out.println("Introdu vanzarile : "); 
	     int vanzariEfectuate = scan.nextInt();	     
	     System.out.println("Introdu o luna : ");
		 int luna = scan.nextInt();

         switch(anVechime) {
         case 1 : 
        	 bonus = 100;
        	 System.out.println("Ai primit bonus:  " + bonus);
        	 break;
         case 2: 
        	 bonus = 200;
        	 System.out.println("Ai primit bonus:  " + bonus);
        	 break;
         case 3:
        	 if(vanzariEfectuate <= 5000) {
        	   bonus =  600;
        	   System.out.println("Ai primit bonus:  " + bonus);
          	   break;
        	 }else if(vanzariEfectuate <= 10000 && (luna >= 1 && luna <= 6 )) {
        		 bonus =  800;
        		 System.out.println("Ai primit bonus:  " + bonus);
            	 break;
        	 }else if(vanzariEfectuate <= 10000 && (luna >= 7 && luna <= 11 )) {
        		 bonus =  1000;
        		 System.out.println("Ai primit bonus:  " + bonus);
            	 break;
        	 }else if(vanzariEfectuate <= 10000 && (luna == 12 )) {
        		 bonus =  900;
        		 System.out.println("In decembrie se vand singure! ");
        		 System.out.println("Ai primit bonus:  " + bonus);
            	 break;
        	 }else {      // if(vanzariEfectuate > 10000)
        		 bonus =  1200;
        		 System.out.println("Ai primit bonus:  " + bonus);
            	 break;
        	 }
        	 default :
        		 System.out.println("An invalid ");
        	 
         }
		 
	}

}
