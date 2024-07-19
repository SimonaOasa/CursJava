package TemaCurs16;

public class StringManipulation {
	
	StringBuilder sb;
	
	//initializare StringBuilder 
	public StringManipulation(String input) {
		
		sb = new StringBuilder(input);
	}
	
	// metoda pt numarare "Nulla"
	
	public int countOccurences(String word) {
		
		String[] words = sb.toString().split("\\s+");
		int count = 0; 
		for (String w : words) {
			if (w.equals(word)) {
				count++;
			}
		}
		
		return count;
		
	}
	
	// metoda pt impartire string in propozitii si afisare propozitii
	
	public void splitIntoSentences() {
		String[] sentences = sb.toString().split("\\.\\s+");
		for (String sentence : sentences) {
			System.out.println(sentence);
		}
	}
	
	
	// metoda pt stergere aparitii litera 'a' folosind StringBuilder
	public void deleteCharacter(char c) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == c) {
				sb.deleteCharAt(i);
				i--;
			}
		}
	}
	
	// metoda pt inlocuire litera 'o' cu caracterul '#'
	
	public void replaceCharacter(char c, char replacement) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == c) {
				sb.setCharAt(i, replacement);
			}
		}
	}
	
	
	// metoda pt returnare string modificat 
	
	public String getString() {
		return sb.toString();
	}
	
	

	public static void main(String[] args) {
	
		String text;
		text = "Loorem ipsum dolor sit aaamet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis."; 

		StringManipulation manipulator = new StringManipulation(text);
		
		System.out.println("Cuvantul Nulla apare de " + manipulator.countOccurences("Nulla") + "ori");
		
		System.out.println("Propozitiile din text : ");
		
		manipulator.splitIntoSentences();
		
		manipulator.deleteCharacter('a');
		
		System.out.println("Textul dupa stergerea caracterului 'a' : ");
		
		System.out.println(manipulator.getString());
		
		manipulator.replaceCharacter('o', '#');
		
		System.out.println("Textul dupa inlocuirea caracterului 'o' cu '#' : ");
		
		System.out.println(manipulator.getString());
		
		
	}

}
