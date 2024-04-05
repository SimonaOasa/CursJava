package curs11;

public class ProtectedAccessModifier {
/*
 * scopul este in acelasi pachet si sub clasa in pachete diferite 
 * 
 * Clasele nu pot fi declarate ca protected 
 * 
 * Aceeasi clasa : yes 
 * Alta clasa din acelasi pachet : yes 
 * 
 * Subclasa (clasa copil ) in acelasi pachet : yes 
 * Alta clasa in alt pachet : NO  
 * 1415-1420 la gara 
 * 
 * 
 */
	
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
		
	}
	
	public static void main() {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();
		
	}
	
}
