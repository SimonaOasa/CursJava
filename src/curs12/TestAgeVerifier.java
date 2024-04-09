package curs12;
import java.util.*;
public class TestAgeVerifier {

	public static void main(String[] args) {

    try { 
		AgeVerifier obj = new AgeVerifier();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		
		obj.checkAgeLimit(age);
		

	}catch (InvalidAgeException e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("Invalid age to vote");
	}

	System.out.println("Code after");
}
}