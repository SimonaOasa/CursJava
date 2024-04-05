package curs11package3;

public interface Angajat {

	int salariu = 1000;//variabila din interiorul interfetei e o constanta
	
	
	void setName();
	String getName();
	void setEmail();
	String getEmail();
	void setName(String name);
	
	default void printDept() {
		System.out.println("QA");
	}
	
}
