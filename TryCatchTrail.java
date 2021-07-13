package exceptionHandling;

public class TryCatchTrail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a =100, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			//e.printStackTrace(); 
			//System.out.println(e);
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}

}
