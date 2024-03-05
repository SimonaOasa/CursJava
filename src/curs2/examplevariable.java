package curs2;

public class examplevariable {

	String prenume;
	
	public static void main(String[] args) {
		//declarare si initializare
		String nume="Ion";
		int age;
		//initializare variabila
		age=22;
		
		
        System.out.println(nume);
        //var keyword --not allowed
        var numar=55;
        var masina="Dacia";
        /*method parameters
         * instance variables
         * return type
         * lambda expressions
         * arrays
         * constructor parameters
         * 
         */
        examplevariable obj=new examplevariable();
        obj.afiseazaMesaj();
        
        //afiseazaMesaj();
        
	}
	
	public void afiseazaMesaj() {
		
		String numeFamilie="popescu";
		System.out.println(numeFamilie+prenume);
				
	}
	
	public void afiseazaAltMesaj() {
		afiseazaMesaj();
		//numeFamilie="ionescu";
		prenume="elena";
	}
	
	}


