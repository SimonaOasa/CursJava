package curs2;

import java.util.Scanner;

public class Dreptunghi {
	
	public static int calculArie(int lungime, int latime) {
	
		return lungime*latime;
		
	}
	
	public static int calculPerimetru(int lungime,int latime) {
		
		//int perimetru= 2 * (lungime + latime);
		//return perimetru;
		return 2 * (lungime + latime);
	}

	public static void main(String[] args) {
		
		//dreptunghi
		int lungime=5;
		int latime=3;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introdu lungimea :");
		lungime=scan.nextInt();
		System.out.println("Introdu lungimea :");
		latime=scan.nextInt();
		
		
		//int arieDreptunghi=calculArie(lungime,latime);
		//System.out.println("Aria dreptunghi este : " + arieDreptunghi);
		System.out.println("Aria dreptunghi este : " + calculArie(lungime,latime));
		int perimetru = calculPerimetru(lungime,latime);
		System.out.println("Perimetru dreptunghi este : " + perimetru);
		
		//dreptunghi
		int lungime2=15;
		int latime2=15;
		
		int arieDreptunghi2=calculArie(lungime2,latime2);
		System.out.println("Aria dreptunghi este : " + arieDreptunghi2);

		 scan.close();
	}

}
