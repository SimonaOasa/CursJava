package curs10;

public class Square extends Shape {

	String nume = "cerc";
	String culoare = "rosu";
	
	public Square(String nume, String culoare) {
		super(nume, culoare);
	
	}

	
	public void printDetails () {
		System.out.println("Numele este " + super.nume + " si culoarea este " + super.culoare);
		//referinta la clasa parinte se face cu "super", referinta din clasa curenta se face cu "this"
	}
	
}
