package TemaCurs12;

public class Customer {

	private String name;
	private String address;
	private String email; 
	
	public Customer () {
		name = "ion";
		address = "adresa";
		email = "email";
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String nume) {
		name = nume;
	}
	
	public void setAddress(String adresa) {
		address = adresa;
	}
	
	public void setEmail(String mail) {
		email = mail;
	}
	
	public Customer(String nume, String adresa, String mail ) {
		name = nume;
		address = adresa; 
		email = mail;
		
	}
}
