package exceptionHandling;

public class FinallyBlock {
	
	// if catch is not there, finally will execute and then terminate the program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a =100, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("Finally block...");			
		}
		System.out.println("Hello...");

	}

}
