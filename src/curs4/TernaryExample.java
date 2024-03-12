package curs4;
/*
 * simulam un cos de cumparaturi
 * avem 3 validari :
 * 1. verificam daca cosul este gol sau nu si printam
 * 2.verificam daca cosul contine peste 100 lei 
 * 3. verificam daca nr de produse este mai mare sau egal cu 5 
 * 
 * si daca valoarea cosului este peste 150 lei (adica valoare mare)
 * 
 */
public class TernaryExample {

	public static void main(String[] args) {
	 
		int numarProduse = 1;
		int totalPretCos = 160;
       //* 1. verificam daca cosul este gol sau nu si printam
		
		String mesaj = numarProduse >0 ? "Avem produse" : "Cos gol!";
		System.out.println(mesaj);
		
		//* 2.verificam daca cosul contine peste 100 lei 
		mesaj = totalPretCos >100 ? "Totalul depaseste 100 lei " : "Total sub 100 lei ";
		System.out.println(mesaj);
		
		//* 3. verificam daca nr de produse este mai mare sau egal cu 5 
		//mesaj = numarProduse>=5 ? "Cos mare" : totalPretCos > 150 ? "Valoare mare" :
	
		//mesaj = numarProduse>=5 && totalPretCos >150 ? "Cos mare si valoare mare" : 
	 
		// 1--> nr de produs mare cu valoare mica 
	    //2--> nr de produs mic cu valoare mare 
		//3 --> nr de produs mare cu valoare mare 
		//4--> nr de produs mic cu valoare mica 
	    
	mesaj = numarProduse >=5 && totalPretCos >150 ? "nr de produs mare cu valoare mare":
 		numarProduse <5 && totalPretCos <150 ? "nr de produs mic cu valoare mica " : "cos intermediar";
	  System.out.println(mesaj);
	}

}
