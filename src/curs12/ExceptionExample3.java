package curs12;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		
		try {
			String nume = null;
			System.out.println(nume.length());
		}catch(Exception e) {
			System.out.println("Exception occured");
			System.out.println(3/0);
			//throw new Exception("");
		}finally {
			System.out.println("Finally block of code!");
		}
		
		System.out.println("Code after TRY- CATCH");
		

	}

}
