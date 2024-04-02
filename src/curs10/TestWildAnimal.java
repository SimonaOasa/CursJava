package curs10;

public class TestWildAnimal {

	public static void main(String[] args) {
		
	//	WildAnimal animal = new WildAnimal();
	//	animal.makeSound();
		
	////	System.out.println("----------------------------------------------------------");
		
	//	Lion simba = new Lion();
	//	simba.makeSound();//metoda suprascrisa
	//	simba.eatMeat();//metoda proprie Lion
	//	simba.whereDoesItLive();//metoda mostenita din clasa parinte

	//	System.out.println("----------------------------------------------------------");

	//	Dear bambi = new Dear ();
	//	bambi.makeSound();//metoda suprascrisa 
	//	bambi.eatGrass();//metoda proprie a lui Dear
	//	bambi.whereDoesItLive();//metoda mostenita din clasa parinte 
		
	//	*/
		
		WildAnimal simba = new Lion();
		simba.makeSound();
		((Lion) simba).eatMeat();
		simba.whereDoesItLive();
		feedAnimal(simba);
		
		simba = new Dear();
		simba.makeSound();
		((Dear) simba).eatGrass();
		feedAnimal(simba);
		
	}	
		public static void feedAnimal( WildAnimal animal) {
	    
			if (animal instanceof Lion) {
				System.out.println("you are getting burgers");
			}else if ( animal instanceof Dear) {
				System.out.println("you are getting salad!");
			}
			
		}
		
	}


