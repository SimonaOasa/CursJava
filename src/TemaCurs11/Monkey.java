package TemaCurs11;

public class Monkey extends Primate implements BasicNeeds{

	public String eat() {
		return "mostly erbivore";
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
		System.out.println("cannot speak");
	}
	
	
}
