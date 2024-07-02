package TemaCurs14;

public class Leguma {

	String nume;
	String calorie;
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}
	
	public String getNume() {
		return nume;
	}
	
	public String getCalorie() {
		return calorie;
	}

	@Override
	public String toString() {
		return "Leguma [nume=" + nume + ", calorie=" + calorie + "]";
	}
	
	
	
}
