package curs12;
import java.util.*;
public class AgeVerifier {

	
	public void checkAgeLimit(int age) throws InvalidAgeException{
		
		if(age <18) {
			throw new InvalidAgeException("Invalid age to proceed");
		}else {
			System.out.println("You are allowed");
		}
	}

}
