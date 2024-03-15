package curs5;
/*
 * facem un program care verifica daca un text este pangram (daca foloseste toate literele alfabetului)
 * 
 * 
 */
public class PangramCheck {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		String text = "The quick brown fo jumps over the lazy dog.".toLowerCase(); 
	//	System.out.println(text.indexOf('e'));
		//char litera ='a';
		//litera++;
	//	System.out.println(++litera);
		
		boolean estePanagram=true;
		
		for (char ch='a';ch<='z';ch++) {
		if (text.indexOf(ch)==-1) {
			estePanagram=false;
			break;
		}
	
		}
		
		System.out.println(estePanagram ? "Textul este panagram : " : "Textul nu este panagram");
		
	}

}
