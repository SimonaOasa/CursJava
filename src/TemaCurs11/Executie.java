package TemaCurs11;

public class Executie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human maria = new Human();
		//System.out.println("Primate dataType instance of Human");
		//System.out.println("Primate dataType instance of " + maria.getClass());
		System.out.println("Primate dataType instance of " + maria.getClass().getSimpleName());
		System.out.println("----------------------------------------------");
		maria.walk();
		maria.run();
		System.out.println(maria.eat());
		maria.speak();
		//maria.drink();
		maria.sleep();
		System.out.println("                                              ");
		
		Monkey  maimuta = new Monkey();
		//System.out.println("Primate dataType instance of Monkey");
		//System.out.println("Primate dataType instance of " + maimuta.getClass());
		System.out.println("Primate dataType instance of " + maimuta.getClass().getSimpleName());
		System.out.println("----------------------------------------------");
		maimuta.walk();
		maimuta.run();
		maimuta.sleep();
		System.out.println(maimuta.eat());
		//maimuta.drink();
		maimuta.speak();
		
	}

}
