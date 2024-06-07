package TemaCurs11;

public class Human extends Primate implements BasicNeeds{

	public String eat() {
		return "Omnivore";
		
	}
	public void sleep() {
		System.out.println("I need to sleep!");
	}
	public void drink() {
		
	}
	
	public void walk() {
		System.out.println("can walk");
	}
	public void run() {
		System.out.println("can run");
	}
	public void speak() {
		System.out.println("I can speak!");
	}
	
	
}
