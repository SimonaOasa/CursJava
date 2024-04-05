package curs11;

 class DefaultAccessModifier {
/*
 * Default inseamna atunci cand nu specific nimic
 * scopul este limitat la pachetul in care se afla
 * 
 * aceeasi clasa : yes
 * alta clasa din acelasi pachet :yes 
 * subclasa (clasa copil) in acelasi pachet : yes
 * subclasa in alt pachet : No 
 * Alta clasa in alt pachet : NO 
 * 
 */
	 
	 String mesaj = "Default access modifier";
	 
	 void printMesaj() {
		 System.out.println(mesaj);
	 }
	 
}
 
 
