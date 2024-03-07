package curs2;

public class Rectangle {
	
	int lungime;
	int latime;
	int inaltime; 
	String culoare="ALB";
	
	public  int calculArie(int lungime, int latime) {
		
		return lungime*latime;
		
	}
	
	public  int calculPerimetru(int lungime,int latime) {
		
		return 2 * (lungime + latime);
	}
	
	public String afiseazaCuloareDreptunghi() {
		return culoare;
	}
	
	
	//constructor default 
	public Rectangle() {}
	public Rectangle(int lungime, int latime) {
		this.lungime = lungime;
		this.latime=latime;
		
	}

	//constructor nou
	public Rectangle(int lungime , int latime , String culoare) {
		this.lungime=lungime;
		this.latime=latime;
		this.culoare=culoare;
	}
	
}
