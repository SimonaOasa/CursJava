package TemaCurs14;

public class setare_catel2 {

	public static void main(String[] args) {
		
		Leguma catel1  = new Leguma();
		
		String nume = "ION";
		
		catel1.setNume(nume);
		
		System.out.println(catel1.getNume());
		//catel1.getNume();
		
		catel1.setNume("Ion");
		
		System.out.println(catel1.getNume());
		
		int a = 1;
		
		int b = 3;
		
		
		
		System.out.println(valoare(a, b));
		System.out.println(valoare(2, 3));
		
	}
	
	static int valoare(int i, int j) {
		return i + j;
	}

}
